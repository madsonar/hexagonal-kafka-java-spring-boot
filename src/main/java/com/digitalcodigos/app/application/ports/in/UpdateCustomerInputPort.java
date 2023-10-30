package com.digitalcodigos.app.application.ports.in;

import com.digitalcodigos.app.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
