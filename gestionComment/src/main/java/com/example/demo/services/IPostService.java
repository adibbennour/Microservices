package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Post;


public interface IPostService {

	public List<Post> getPosts();

	public Post getPostById(Long id);

	public Post addPost(Post a);

	public boolean supprimerPost(Long id);

	public Post updatePost(Long id, Post a);
	
	public int getIdPostWithMaxLike();
	
	public int getIdPostWithMaxComments();
	
	public List<Post>  getListPostWithStatusActive();
	
	public List<Post>  getListPostWithStatusDesActive();
}
