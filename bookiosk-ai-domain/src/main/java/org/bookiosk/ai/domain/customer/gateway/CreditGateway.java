package org.bookiosk.ai.domain.customer.gateway;

import org.bookiosk.ai.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
