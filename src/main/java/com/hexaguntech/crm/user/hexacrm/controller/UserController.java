package com.hexaguntech.crm.user.hexacrm.controller;

import com.hexaguntech.crm.user.hexacrm.collection.User;
import com.hexaguntech.crm.user.hexacrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping()
    public String save(@RequestBody User user) {
        return userService.save(user);
    }
}
