package com.maxbohoniuk.springkotlindemo.users.repo

import com.maxbohoniuk.springkotlindemo.users.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserReposiroty : JpaRepository<User, UUID> {

    fun findByEmailIgnoreCase(email: String): Optional<User>
}