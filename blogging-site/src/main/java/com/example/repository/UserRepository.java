package com.example.repository;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional; // Add this import for Optional

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Method to find a user by username
    User findByUsername(String username);

    // Method to find a user by email
    Optional<User> findByEmail(String email);
}
