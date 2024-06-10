package org.bookiosk.ai.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.bookiosk.ai.dto.CustomerAddCmd;
import org.bookiosk.ai.dto.CustomerListByNameQry;
import org.bookiosk.ai.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
