package com.digitalcodigos.app.config;

import com.digitalcodigos.app.adapters.out.FindAddressByZipCodeAdapter;
import com.digitalcodigos.app.adapters.out.UpdateCustomerAdapter;
import com.digitalcodigos.app.application.core.usecase.FindCustomerByIdUseCase;
import com.digitalcodigos.app.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
