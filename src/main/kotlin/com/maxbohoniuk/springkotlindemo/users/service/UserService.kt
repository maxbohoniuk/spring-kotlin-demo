package com.maxbohoniuk.springkotlindemo.users.service

import com.maxbohoniuk.springkotlindemo.users.model.User
import com.maxbohoniuk.springkotlindemo.users.repo.UserReposiroty
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.UUID

@Service
class UserService(private val userReposiroty: UserReposiroty) {

    fun getUserByUUID(uuid: UUID): User {
        return userReposiroty.findById(uuid).orElseThrow()
    }

    fun createUser(user: User): User {
        return userReposiroty.findByEmailIgnoreCase(user.email)
            .orElseGet { userReposiroty.save(user) }
    }

    fun getUsers(): List<User> = userReposiroty.findAll()

}