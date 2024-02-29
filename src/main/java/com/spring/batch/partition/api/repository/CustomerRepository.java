package com.spring.batch.partition.api.repository;
import com.spring.batch.partition.api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
