package com.guilhermefalcao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilhermefalcao.course.entitys.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
