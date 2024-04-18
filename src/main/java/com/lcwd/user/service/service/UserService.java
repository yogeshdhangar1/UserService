package com.lcwd.user.service.service;

import com.lcwd.user.service.enties.User;

import java.util.List;

public interface UserService {

    // Create
    User Saveuser(User user);

    // get All User
    List<User> getAllUser();

    // get single UserId

    User getUser(String userId);

    // TODO: Delete

    User deleteUser(String userId);
   // TODO : Update;

}
