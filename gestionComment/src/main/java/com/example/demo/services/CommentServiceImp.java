/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comment;
import com.example.demo.repositories.CommentRepositorie;


/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
@Service
public class CommentServiceImp implements CommentService {
	@Autowired
	CommentRepositorie CommentRepositorie;


	/* (non-Javadoc)
	 * @see com.example.gestioncandidat.services.CondidatService#getCondidatById(long)
	 */
	@Override
	public Comment getCommentById(long id) {

		return CommentRepositorie.findById(id).get();
	}

	/* (non-Javadoc)
	 * @see com.example.gestioncandidat.services.CondidatService#getAllCondidat()
	 */
	@Override
	public List<Comment> getAllComments() {

		return CommentRepositorie.findAll();
	}


}
