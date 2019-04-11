package it.my.mfdemo.service;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.my.mfdemo.domain.DomainCountry;
import it.my.mfdemo.model.BlobStorage;
import it.my.mfdemo.model.City;
import it.my.mfdemo.model.Country;
import it.my.mfdemo.model.Province;
import it.my.mfdemo.repository.BlobRepository;
import it.my.mfdemo.repository.CountryRepository;
import it.my.mfdemo.util.CountryMapper;

@RestController
@RequestMapping("country")
public class CountryController {

	@Autowired
	private CountryRepository repository;

	@Autowired
	private BlobRepository blob;
	
	@Autowired
	private CountryMapper mapper;

	@PutMapping
	public Country put(@RequestBody Country country) {
		return repository.save(country);
	}

	@GetMapping("list")
	public List<Country> list() {
		return repository.findAll();
	}

	@GetMapping("addOne")
	public ResponseEntity<DomainCountry> addOne() {
		try {
			return ResponseEntity.ok().body(mapper.toDomainCountry(addMockCountry()));
		} catch (DataIntegrityViolationException e) {
			System.out.println("orcazzozza");
			return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
		}
	}

	@GetMapping("addTwo")
	public List<Country> addTwo() {

		// aggiungiamo la prima città
		addMockCountry();

		// ricarichiamo la lista
		List<Country> all = repository.findAll();
		for (Country country : all) {
			List<Province> provinces = country.getProvinces();
			for (Province province : provinces) {
				// associamo la seconda città
				City second = new City("SecondVille", 2222);
				province.getCities().add(second);
			}
		}
		repository.saveAll(all);

		// se tutto è andato liscio, la risposta include due città figlie della
		// stessa provincia e dello stesso stato
		return repository.findAll();
	}

	private Country addMockCountry() {

		// creiamo gli oggetti
		// non mettiamo gli id, ci penserà il generatore custom
		Country country = new Country("FOO", "BAR", new ArrayList<>());
		Province province = new Province("ABC", "CDE", new ArrayList<>());
		City city = new City("First City", 1000);

		// associamo la prima volta
		province.getCities().add(city);
		country.getProvinces().add(province);

		return repository.save(country);
	}

	@GetMapping(name = "xml", produces = MediaType.TEXT_XML_VALUE)
	private String getXml() {
		if (repository.findAll().isEmpty()) {
			addMockCountry();
		}
		Country obj = repository.findAll().stream().findFirst().orElse(null);
		StringWriter xml = new StringWriter();
		JAXB.marshal(obj, xml);
		String result = xml.toString();
		BlobStorage raw = new BlobStorage();
		raw.setXml(result.getBytes());
		blob.save(raw);

		BlobStorage justSaved = blob.findAll().stream().findFirst().get();

		return new String(justSaved.getXml());
	}
}
