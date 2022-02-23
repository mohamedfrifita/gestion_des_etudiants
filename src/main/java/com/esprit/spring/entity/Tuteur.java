package com.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tuteur")
public class Tuteur implements Serializable{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7386081842140012375L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTuteur;
	private String nomTuteur;
	
	@JsonIgnore
	@OneToOne(mappedBy="tuteur")
	private Etudiant etudiant;
	
	
	
	
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public int getIdTuteur() {
		return idTuteur;
	}
	public void setIdTuteur(int idTuteur) {
		this.idTuteur = idTuteur;
	}
	public String getNomTuteur() {
		return nomTuteur;
	}
	public void setNomTuteur(String nomTuteur) {
		this.nomTuteur = nomTuteur;
	}
	public Tuteur(int idTuteur, String nomTuteur) {
		super();
		this.idTuteur = idTuteur;
		this.nomTuteur = nomTuteur;
	}
	public Tuteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tuteur [idTuteur=" + idTuteur + ", nomTuteur=" + nomTuteur + "]";
	}
	public Tuteur(int idTuteur, String nomTuteur, Etudiant etudiant) {
		super();
		this.idTuteur = idTuteur;
		this.nomTuteur = nomTuteur;
		this.etudiant = etudiant;
	}
	
	

}
