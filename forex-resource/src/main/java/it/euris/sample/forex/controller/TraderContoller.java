package it.euris.sample.forex.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("trader")
public class TraderContoller {
	
	@PostMapping("add")
	public ResponseEntity<?> add(/* Qui i parametri*/){
		
		 // Qui la logica
		
		
		return ResponseEntity.ok().build();
	}

}
