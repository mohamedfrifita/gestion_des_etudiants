package com.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.esprit.spring.entity.Projet;
import com.esprit.spring.service.IProjetService;

@RestController
public class ProjetRestController {

@Autowired
IProjetService projetService;


//http://localhost:8081/SpringMVC/servlet/add-projet

	@PostMapping("/add-projet")
	@ResponseBody
	 public void ajouterProjet(@RequestBody Projet projet) {
		projetService.ajouterProjet(projet);
		
		
	}
	
}
