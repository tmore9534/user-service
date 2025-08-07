package com.pocketmoney.userservice.respository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pocketmoney.userservice.entities.UserInfo;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, String> {
    // Custom query to find user by userId
    Optional<UserInfo> findByUserId(String userId);
}