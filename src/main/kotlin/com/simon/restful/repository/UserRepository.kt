package com.simon.restful.repository

import com.simon.restful.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>