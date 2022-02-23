package com.esprit.spring.service;

import com.esprit.spring.entity.Etudiant;
import com.esprit.spring.entity.Tuteur;

public interface IEtudiantService {
	public void ajouterEtudiant(Etudiant etudiant);
	public void affecterEtudiantProjet(int idEtudiant, int idProjet);
	
}
