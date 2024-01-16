package com.jobboard.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobboard.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// add logic for custom query to get all applied jobs

	// add logic for custom query method to apply for a job
}
