package com.maxbohoniuk.springkotlindemo.users

import com.maxbohoniuk.springkotlindemo.users.model.UserRequestDto
import com.maxbohoniuk.springkotlindemo.users.model.UserResponseDto
import com.maxbohoniuk.springkotlindemo.users.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getUsers(): List<UserResponseDto> = userService.getUsers().map { UserResponseDto(it) }

    @PostMapping
    fun createUser(@RequestBody user: UserRequestDto): UserResponseDto = UserResponseDto(userService.createUser(user.toEntity()))
}