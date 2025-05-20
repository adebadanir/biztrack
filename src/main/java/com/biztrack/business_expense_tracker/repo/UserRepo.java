package com.biztrack.business_expense_tracker.repo;

import com.biztrack.business_expense_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}
