package com.w3dev.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.w3dev.interview.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
