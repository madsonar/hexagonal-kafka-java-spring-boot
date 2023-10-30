package com.digitalcodigos.app.adapters.out.repository.mapper;

import com.digitalcodigos.app.adapters.out.repository.entity.CustomerEntity;
import com.digitalcodigos.app.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
