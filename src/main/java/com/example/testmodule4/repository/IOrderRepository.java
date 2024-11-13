package com.example.testmodule4.repository;

import com.example.testmodule4.model.Product;
import com.example.testmodule4.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByDateBetween(Date startDate, Date endDate);
}
