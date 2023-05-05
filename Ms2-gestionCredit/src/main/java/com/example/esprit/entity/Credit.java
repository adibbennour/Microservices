/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.esprit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * {@link } class.
 *
 * @author hbenammar
 * @since 0.1.0
 *
 */
@Entity
public class Credit {
@Id
@GeneratedValue
private long id; 
private String nom; 
private String lastName;

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
public String getLastName() {

	return lastName;
}
/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {

	this.lastName = lastName;
}
/**
 * 
 */
public Credit() {

	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param id
 * @param nom
 * @param lastName
 */
public Credit( String nom, String lastName) {

	super();
	this.nom = nom;
	this.lastName = lastName;
}

}
