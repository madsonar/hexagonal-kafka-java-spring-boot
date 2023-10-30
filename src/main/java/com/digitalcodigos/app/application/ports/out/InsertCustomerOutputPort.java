package com.digitalcodigos.app.application.ports.out;

import com.digitalcodigos.app.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
