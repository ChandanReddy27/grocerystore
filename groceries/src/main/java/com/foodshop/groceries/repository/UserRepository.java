package com.foodshop.groceries.repository;

import com.foodshop.groceries.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{

}
