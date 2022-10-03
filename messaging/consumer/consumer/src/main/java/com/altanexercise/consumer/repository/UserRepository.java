package com.altanexercise.consumer.repository;

import com.altanexercise.consumer.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

    List<UserEntity> findUserByCountry(String country);

}
