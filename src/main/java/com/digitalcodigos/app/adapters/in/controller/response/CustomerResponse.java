package com.digitalcodigos.app.adapters.in.controller.response;

import com.digitalcodigos.app.adapters.out.client.response.AddressResponse;
import lombok.Data;

@Data
public class CustomerResponse {
    private String id;

    private String name;

    private AddressResponse address;

    private String cpf;

    private Boolean isValidCpf;
}
