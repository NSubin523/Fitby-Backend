package com.example.fitby.userInfo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userInfoRepo extends JpaRepository<userInfo,Long> {
}
