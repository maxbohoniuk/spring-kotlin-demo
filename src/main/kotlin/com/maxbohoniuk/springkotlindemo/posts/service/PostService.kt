package com.maxbohoniuk.springkotlindemo.posts.service

import com.maxbohoniuk.springkotlindemo.posts.model.Post
import com.maxbohoniuk.springkotlindemo.posts.repo.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(val postRepository: PostRepository) {

    fun getAllPosts(): List<Post> = postRepository.findAll()

    fun addPost(post: Post): Post = postRepository.save(post)

}