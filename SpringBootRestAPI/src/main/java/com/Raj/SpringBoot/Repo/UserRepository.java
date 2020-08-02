package com.Raj.SpringBoot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Raj.SpringBoot.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
