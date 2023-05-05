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
 * @author ajlani
 * @since 0.1.0
 *
 */
@Entity
public class Employee {
@Id
@GeneratedValue
private long id; 
private String FirstName; 
private String lastName;
private String Age;
private String Email;
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
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getAge() {
	return Age;
}
public void setAge(String age) {
	Age = age;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
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
public Employee( String firstName, String lastName, String age, String email) {
	super();
	
	FirstName = firstName;
	this.lastName = lastName;
	Age = age;
	Email = email;
}
public Employee() {
	super();
}


}
