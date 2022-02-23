package com.esprit.spring.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.spring.entity.Etudiant;
import com.esprit.spring.entity.Tuteur;
import com.esprit.spring.repository.EtudiantRepository;
import com.esprit.spring.repository.TuteurRepository;

@Service
public class TuteurService implements ITuteurService {
	
	@Autowired
	TuteurRepository tuteurRepository;
	@Autowired
	EtudiantRepository etudiantRepository;
	
	 private static final Logger L = LogManager.getLogger(TuteurService.class);
	

	 @Transactional
		public void ajouterEtAffecterTuteur(Tuteur tuteur, int idEtudiant) {
			// TODO Auto-generated method stub
		 Etudiant etudiant=new Etudiant();
			for(int i=0; i < idEtudiant; i++) {
				
				Etudiant e=etudiantRepository.findById(idEtudiant).get();
				etudiant.getTuteur();
			
		}
			tuteur.setEtudiant(etudiant);
			
			tuteurRepository.save(tuteur);
	 }
		
	

}
