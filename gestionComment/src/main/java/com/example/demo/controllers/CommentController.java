/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Comment;
import com.example.demo.services.CommentService;

/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
@RestController
@RequestMapping("/Comment")
public class CommentController {
@Autowired
CommentService commentService;
@GetMapping("/getEmployee/{id}")
public Comment getComment(@PathVariable ("id") long id) {
	return commentService.getCommentById(id);
}

@GetMapping("/getAllComment")
public List<Comment> getAllComments() {
	return commentService.getAllComments();
}



}
