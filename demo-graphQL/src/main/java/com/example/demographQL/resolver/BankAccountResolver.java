package com.example.demographQL.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import com.example.demographQL.bank.domain.BankAccount;
import com.example.demographQL.bank.domain.Currency;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank account id: {}" , id);

        return  BankAccount.builder().id(id).name("aditya").currency(Currency.USD).build();
    }

    public int sum(int a , int b) {
        return a + b;
    }

    public String test() {
        return "Hello GraphQL";
    }
}
