package com.eazybytes.accounts.functions;

import com.eazybytes.accounts.service.IAccountsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class AccountFunctions {

    private static final Logger logger = LoggerFactory.getLogger(AccountFunctions.class); // Logger

    @Bean
    public Consumer<Long> updateCommunication(IAccountsService iAccountsService) {
        return accountNumber ->  {
            logger.info("Sending email to customer with account number {}", accountNumber);
            iAccountsService.updateCommunicationSwitch(accountNumber);
        };

    }

}
