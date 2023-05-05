/* Copyright (C)  Dqlick ™ - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 */
package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Comment;

/**
 * {@link } class.
 *
 * @author ajlani
 * @since 0.1.0
 *
 */
public interface CommentService {
public Comment getCommentById(long id);
public List<Comment> getAllComments();
}
