package org.bookiosk.ai.customer;

import org.bookiosk.ai.domain.customer.Customer;
import org.bookiosk.ai.domain.customer.gateway.CustomerGateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {


    public Customer getByById(String customerId){

      return null;
    }
}
