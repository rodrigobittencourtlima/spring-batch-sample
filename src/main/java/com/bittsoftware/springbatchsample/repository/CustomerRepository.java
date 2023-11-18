package com.bittsoftware.springbatchsample.repository;

import com.bittsoftware.springbatchsample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
