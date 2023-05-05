package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Comment;


public interface ICommentService {

	public List<Comment> getComments();

	public Comment getCommentById(Long id);

	public Comment addComment(Comment a);

	public boolean supprimerComment(Long id);

	public Comment updateComment(Long id, Comment a);
}
