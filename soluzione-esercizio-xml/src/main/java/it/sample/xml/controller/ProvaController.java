package it.sample.xml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.sample.xml.model.SampleDTO;
import it.sample.xml.service.ObjectSavingService;

@RestController
@RequestMapping("prova")
public class ProvaController {
	
	@Autowired
	private ObjectSavingService service;
	
	@PostMapping("test")
	public void receiveXml(@RequestBody SampleDTO dto) {
		service.saveAll(dto.getSomeObjects(), dto.getOtherObjects());
	}

}
