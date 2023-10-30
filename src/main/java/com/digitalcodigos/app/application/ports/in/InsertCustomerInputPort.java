package com.digitalcodigos.app.application.ports.in;

import com.digitalcodigos.app.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
