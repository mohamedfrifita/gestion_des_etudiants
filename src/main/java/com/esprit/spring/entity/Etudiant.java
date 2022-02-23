package com.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="etudiant")
public class Etudiant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2239789265991203460L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEtudiant;
	private String login;
	
	private String password;
	@Enumerated(EnumType.STRING)
	Specialite specialite;
	
	@JsonIgnore
	@OneToOne
	private Tuteur tuteur;
	@JsonIgnore
	@ManyToMany(mappedBy="etudiants", cascade=CascadeType.ALL)
	private List<Projet>projets;
	
	
	
	
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	public Tuteur getTuteur() {
		return tuteur;
	}
	public void setTuteur(Tuteur tuteur) {
		this.tuteur = tuteur;
	}

	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	public Etudiant(int idEtudiant, String login, String password, Specialite specialite) {
		super();
		this.idEtudiant = idEtudiant;
		this.login = login;
		this.password = password;
		this.specialite = specialite;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Etudiant [idEtudiant=" + idEtudiant + ", login=" + login + ", password=" + password + ", specialite="
				+ specialite + "]";
	}
	
	
	
	

}
