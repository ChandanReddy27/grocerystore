package com.foodshop.groceries.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.foodshop.groceries.entity.User;
import com.foodshop.groceries.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signup(@RequestBody User u) {
        return userService.createUser(u);
    }

    @RequestMapping(value = "/deleteAccount", method = RequestMethod.DELETE)
    public String deleteAccount(@RequestBody ObjectNode objectNode) {
        return userService.deleteUser(objectNode.get("username").asText());
    }

    @RequestMapping(value = "/updateAccount", method = RequestMethod.PATCH)
    public String updateAccount(@RequestBody User u) {
        return userService.updateUser(u);
    }
}
