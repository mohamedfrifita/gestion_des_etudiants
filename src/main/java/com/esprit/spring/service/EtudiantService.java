package com.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Etudiant;
import com.esprit.spring.entity.Projet;
import com.esprit.spring.entity.Tuteur;
import com.esprit.spring.repository.EtudiantRepository;
import com.esprit.spring.repository.ProjetRepository;

@Service
public class EtudiantService implements IEtudiantService {
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	ProjetRepository projetRepository;
	

	 private static final Logger L = LogManager.getLogger(EtudiantService.class);
	@Override
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiantRepository.save(etudiant);	
		
	}
	
	
	@Transactional
	public void affecterEtudiantProjet(int idEtudiant, int idProjet) {
		Projet projet =projetRepository.findById(idProjet).get();
		Etudiant etudiant= etudiantRepository.findById(idEtudiant).get();
		if(projet.getEtudiants()==null) {
			List<Etudiant>etudiants=new ArrayList<>();
			etudiants.add(etudiant);
			projet.setEtudiants(etudiants);
		}else {
			projet.getEtudiants().add(etudiant);
		}
		
	}
	
	
	
	
	 
}
