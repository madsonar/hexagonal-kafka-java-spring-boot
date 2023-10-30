package com.digitalcodigos.app.config;

import com.digitalcodigos.app.adapters.out.DeleteCustomerByIdAdapter;
import com.digitalcodigos.app.application.core.usecase.DeleteCustomerByIdUseCase;
import com.digitalcodigos.app.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase (
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
