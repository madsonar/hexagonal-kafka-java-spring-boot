package com.digitalcodigos.app.config;

import com.digitalcodigos.app.adapters.out.FindAddressByZipCodeAdapter;
import com.digitalcodigos.app.adapters.out.InsertCustomerAdapter;
import com.digitalcodigos.app.adapters.out.SendCpfValidationAdapter;
import com.digitalcodigos.app.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationOutputPort
    ) {
        return new InsertCustomerUseCase(
                findAddressByZipCodeAdapter,
                insertCustomerAdapter,
                sendCpfValidationOutputPort);
    }
}
