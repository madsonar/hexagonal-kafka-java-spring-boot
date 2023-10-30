package com.digitalcodigos.app.application.ports.out;

import com.digitalcodigos.app.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
