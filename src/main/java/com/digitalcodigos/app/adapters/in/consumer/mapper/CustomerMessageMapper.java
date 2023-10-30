package com.digitalcodigos.app.adapters.in.consumer.mapper;

import com.digitalcodigos.app.adapters.in.consumer.message.CustomerMessage;
import com.digitalcodigos.app.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);
}
