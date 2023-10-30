package com.digitalcodigos.app.adapters.out.client.mapper;

import com.digitalcodigos.app.adapters.out.client.response.AddressResponse;
import com.digitalcodigos.app.application.core.domain.Address;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
