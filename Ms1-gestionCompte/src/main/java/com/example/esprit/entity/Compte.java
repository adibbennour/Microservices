package com.example.esprit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Compte {
@Id
@GeneratedValue
private long id; 
private String nom; 
private String numeroCompte;

/**
 * @return the id
 */
public long getId() {

	return id;
}
/**
 * @param id the id to set
 */
public void setId(long id) {

	this.id = id;
}
/**
 * @return the nom
 */
public String getNom() {

	return nom;
}
/**
 * @param nom the nom to set
 */
public void setNom(String nom) {

	this.nom = nom;
}
/**
 * @return the lastName
 */
public String getNumeroCompte() {

	return numeroCompte;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String numeroCompte) {

	this.numeroCompte = numeroCompte;
}
/**
 * 
 */
public Compte() {

	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param id
 * @param nom
 * @param lastName
 */
public Compte( String nom, String numeroCompte) {

	super();
	this.nom = nom;
	this.numeroCompte = numeroCompte;
}

}
