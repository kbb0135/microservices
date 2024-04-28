package org.microservices.accounts.service.impl;

import lombok.AllArgsConstructor;
import org.microservices.accounts.dto.CustomerDto;
import org.microservices.accounts.repository.AccountsRepository;
import org.microservices.accounts.repository.CustomerRepository;
import org.microservices.accounts.service.IAccountsService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
