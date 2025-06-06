package com.biztrack.businessexpensetracker.repo;

import com.biztrack.businessexpensetracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}
