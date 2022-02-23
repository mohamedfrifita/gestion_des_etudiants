package com.esprit.spring.service;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Etudiant;
import com.esprit.spring.entity.Projet;
import com.esprit.spring.repository.EtudiantRepository;
import com.esprit.spring.repository.ProjetRepository;

@Service
public class ProjetService implements IProjetService {
	@Autowired
	ProjetRepository projetRepository;
	@Autowired
	EtudiantRepository  etudiantRepository;
	 private static final Logger L = LogManager.getLogger(ProjetService.class);

	@Override
	public void ajouterProjet(Projet projet) {
		projetRepository.save(projet);
		
	}

	

}
