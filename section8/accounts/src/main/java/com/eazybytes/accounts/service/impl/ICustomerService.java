package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomerService
{
    /**
     *
     * @param mobileNumber
     * @return
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
