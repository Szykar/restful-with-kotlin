package com.simon.restful.controller

import com.simon.restful.entity.User
import com.simon.restful.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("users")
class UserController {

    @Autowired
    lateinit var userRepository: UserRepository

    @GetMapping("")
    fun getAllUsers(): Iterable<User> {
        return userRepository.findAll()
    }

    @PostMapping("")
    fun addNewUser(
            @RequestParam(value = "name") name: String,
            @RequestParam(value = "email") emailAddress: String,
            @RequestParam(value = "age") age: Byte
    ): User {
        val newUser = User(0, name, emailAddress, age)
        userRepository.save(newUser)

        return newUser
    }
}