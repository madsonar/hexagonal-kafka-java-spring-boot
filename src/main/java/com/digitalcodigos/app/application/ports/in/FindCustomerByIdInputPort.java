package com.digitalcodigos.app.application.ports.in;

import com.digitalcodigos.app.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
