package com.esprit.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.esprit.spring.entity.Tuteur;
import com.esprit.spring.service.ITuteurService;

@RestController
public class TuteurRestController {
	@Autowired
	ITuteurService tuteurService;
	
	
	// http://localhost:8081/SpringMVC/servlet/ajouterEtAffecterTuteur/[1]
			@PostMapping("/ajouterEtAffecterTuteur")
			@ResponseBody
			public void ajouterEtAffecterTuteur(@RequestBody Tuteur tuteur ,@RequestParam int idEtudiant)
			{
			
				System.out.println("tuteur");
				System.out.println(tuteur);
				tuteurService.ajouterEtAffecterTuteur(tuteur, idEtudiant);
			}

}
