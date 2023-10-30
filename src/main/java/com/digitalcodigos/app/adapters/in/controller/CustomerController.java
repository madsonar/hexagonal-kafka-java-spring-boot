package com.digitalcodigos.app.adapters.in.controller;

import com.digitalcodigos.app.adapters.in.controller.mapper.CustomerMapper;
import com.digitalcodigos.app.adapters.in.controller.request.CustomerRequest;

import com.digitalcodigos.app.adapters.in.controller.response.CustomerResponse;
import com.digitalcodigos.app.application.core.domain.Customer;
import com.digitalcodigos.app.application.ports.in.DeleteCustomerByIdInputPort;
import com.digitalcodigos.app.application.ports.in.FindCustomerByIdInputPort;
import com.digitalcodigos.app.application.ports.in.InsertCustomerInputPort;
import com.digitalcodigos.app.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<CustomerResponse> findByid(@PathVariable final String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(
            @PathVariable final String id, @Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
    return ResponseEntity.noContent().build();
    }
}
