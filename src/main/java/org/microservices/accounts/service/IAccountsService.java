package org.microservices.accounts.service;

import org.microservices.accounts.dto.CustomerDto;

//Service layer
//
/*
    @parqm customerDto-Customer DTO object
    this interface is going to taking the objects send by customer to create accounts
 */
public interface IAccountsService {
    //responsible for creating new methods

    void createAccount(CustomerDto customerDto);
}
