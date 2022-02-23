package com.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.spring.entity.Etudiant;
import com.esprit.spring.service.IEtudiantService;
@RestController
public class EtudiantRestController {
	@Autowired
	IEtudiantService etudiantService;
	
	// http://localhost:8081/SpringMVC/servlet/add-etudiant
	
	@PostMapping("/add-etudiant")
	@ResponseBody
	 public void ajouterEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.ajouterEtudiant(etudiant);
		
		
	}
	
	// http://localhost:8081/SpringMVC/servlet/affecterEtudiantProjet
	@PostMapping("/affecterEtudiantProjet")
	@ResponseBody
	public void affecterEtudiantProjet(@RequestParam ("idEtudiant")int idEtudiant,@RequestParam ("idProjet") int idProjet) {
		etudiantService.affecterEtudiantProjet(idEtudiant, idProjet);
		
	}

}
