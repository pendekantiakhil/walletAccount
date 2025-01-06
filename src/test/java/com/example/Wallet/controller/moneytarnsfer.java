package com.example.Wallet.controller;

import com.example.Wallet.Controller.MoneyTransfer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class moneytarnsfer {

    @Autowired
    MoneyTransfer moneyTransfer;


    @Test
    public void testaddition(){
        Assertions.assertEquals(moneyTransfer.addtion(1,2),3);
    }
}
