package com.altanexercise.consumer.repository;

import com.altanexercise.consumer.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    List<User> findUserByCountry(String country);

}
