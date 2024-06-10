package org.bookiosk.ai.domain.customer.gateway;

import org.bookiosk.ai.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
