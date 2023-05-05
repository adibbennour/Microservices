/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.demo.entity;

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
public class Comment {
@Id
@GeneratedValue
private long id; 
private String Comment;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
public Comment(String comment) {
	super();
	Comment = comment;
}
public Comment() {
	super();
} 


}
