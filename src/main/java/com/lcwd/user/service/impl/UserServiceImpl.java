package com.lcwd.user.service.impl;

import com.lcwd.user.service.exception.ResourceNotFoundException;
import com.lcwd.user.service.repository.UserRepo;
import com.lcwd.user.service.service.UserService;
import com.lcwd.user.service.enties.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    /**
     * @param user
     * @return
     */
    @Override
    public User Saveuser(User user) {
        //  generate unique userId
      String randomUserId =   UUID.randomUUID().toString();
       user.setUseId(randomUserId);
        return userRepo.save(user);
    }

    /**
     * @return
     */
    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given not found on Server!!"+userId));
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public User deleteUser(String userId) {
        return null;
    }
}
