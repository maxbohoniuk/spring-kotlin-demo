package com.maxbohoniuk.springkotlindemo.posts.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID
@Entity
@Table(name = "posts")
data class Post(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        val id: UUID?,
        val title: String,
        val content: String?
) {

}
