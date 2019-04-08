package it.my.mfdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.my.mfdemo.model.City;
import it.my.mfdemo.model.Country;
import it.my.mfdemo.model.Province;
import it.my.mfdemo.repository.CountryRepository;

@RestController
@RequestMapping("country")
public class CountryController {

	@Autowired
	private CountryRepository repository;

	@PutMapping
	public Country put(@RequestBody Country country) {
		return repository.save(country);
	}

	@GetMapping("list")
	public List<Country> list() {
		return repository.findAll();
	}

	@GetMapping("addOne")
	public Country addOne() {
		return addMockCountry();
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
}
