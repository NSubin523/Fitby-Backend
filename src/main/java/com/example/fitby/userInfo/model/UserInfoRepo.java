package com.example.fitby.userInfo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo,Long> {
    UserInfo getByUserEmail(String userEmail);
}
