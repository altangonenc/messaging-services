package com.altanexercise.producer.repository;

import com.altanexercise.producer.entity.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrderRepository extends JpaRepository<UserOrder,Long> {
}
