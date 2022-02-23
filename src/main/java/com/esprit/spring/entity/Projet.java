package com.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="projet")
public class Projet implements Serializable{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6877629619976778503L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int refProjet;
	private String nomProjet;
	@JsonIgnore
	@ManyToMany( cascade=CascadeType.ALL)
	private List<Etudiant>etudiants;
	
	
	

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public int getRefProjet() {
		return refProjet;
	}
	public void setRefProjet(int refProjet) {
		this.refProjet = refProjet;
	}
	public String getNomProjet() {
		return nomProjet;
	}
	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}
	public Projet(int refProjet, String nomProjet) {
		super();
		this.refProjet = refProjet;
		this.nomProjet = nomProjet;
	}
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Projet [refProjet=" + refProjet + ", nomProjet=" + nomProjet + "]";
	}

	
	

}
