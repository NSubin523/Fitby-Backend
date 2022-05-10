package com.example.fitby.openSource.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OSRepo extends JpaRepository<OSModel,Long> {
}
