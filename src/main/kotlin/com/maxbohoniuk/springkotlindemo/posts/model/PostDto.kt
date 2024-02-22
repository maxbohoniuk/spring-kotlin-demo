package com.maxbohoniuk.springkotlindemo.posts.model

import java.util.UUID
data class PostDto(
        val id: UUID?,
        val title: String,
        val content: String?
) {
        fun toEntity() = Post(null, title, content)

        companion object {
                fun fromEntity(postEntity: Post) = PostDto(postEntity.id, postEntity.title, postEntity.content)
        }

}
