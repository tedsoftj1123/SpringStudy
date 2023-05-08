package com.example.jpasecondcache.domain.user.entity.repository

import com.example.jpasecondcache.domain.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserJpaRepository : JpaRepository<User, Long> {

}