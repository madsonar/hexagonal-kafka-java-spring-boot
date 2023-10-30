package com.digitalcodigos.app.application.ports.out;

import com.digitalcodigos.app.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
