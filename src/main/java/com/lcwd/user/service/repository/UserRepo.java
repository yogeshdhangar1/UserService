package com.lcwd.user.service.repository;

import com.lcwd.user.service.enties.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {
}
