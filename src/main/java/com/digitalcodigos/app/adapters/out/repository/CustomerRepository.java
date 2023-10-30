package com.digitalcodigos.app.adapters.out.repository;

import com.digitalcodigos.app.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
