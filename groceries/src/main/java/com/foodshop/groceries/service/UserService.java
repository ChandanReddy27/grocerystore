package com.foodshop.groceries.service;

import com.foodshop.groceries.entity.User;
import com.foodshop.groceries.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public String createUser(User u){
        userRepo.save(u);
        return "User Created";
    }

    public String deleteUser(String username){
        userRepo.deleteById(username);
        return "User Deleted";
    }

    public String updateUser(User u){
        userRepo.findById(u.getUsername());
        userRepo.save(u);
        return "User Updated";
    }
}
