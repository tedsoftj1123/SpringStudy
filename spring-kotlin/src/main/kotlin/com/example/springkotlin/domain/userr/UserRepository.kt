package com.example.springkotlin.domain.userr

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>{
}