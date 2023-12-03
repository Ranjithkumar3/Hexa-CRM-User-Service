package com.hexaguntech.crm.user.hexacrm.service;

import com.hexaguntech.crm.user.hexacrm.collection.User;
import com.hexaguntech.crm.user.hexacrm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public String save(User user) {
        return userRepository.save(user).getUserId();
    }
}
