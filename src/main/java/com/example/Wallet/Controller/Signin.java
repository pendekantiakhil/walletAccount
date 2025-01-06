package com.example.Wallet.Controller;

import com.example.Wallet.Model.*;
import com.example.Wallet.Repository.BANK_ACCOUNTRepository;
import com.example.Wallet.Repository.Email_addRepository;
import com.example.Wallet.Repository.WALLET_ACCOUNTRwpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class Signin {

    @Autowired
    BANK_ACCOUNTRepository bankAccountRepository;

    @Autowired
    WALLET_ACCOUNTRwpository walletAccountRwpository;

    @Autowired
    Email_addRepository emailAddRepository;

    @PostMapping("/Signin")
    public signindetails signindetailsvales(@RequestBody signindetails signindetails1){

        BANK_ACCOUNT bankAccount = new BANK_ACCOUNT();
        bankAccount.setBankID(signindetails1.getBankID());
        bankAccount.setBANumber(signindetails1.getBANumber());
        WALLET_ACCOUNT walletAccount = new WALLET_ACCOUNT();
        walletAccount.setBankAccount(bankAccount);
        walletAccount.setBalance(signindetails1.getAmount());
        walletAccount.setName(signindetails1.getName());
        walletAccount.setSSN(signindetails1.getSSN());
        walletAccount.setPhoneNumber(signindetails1.getPhonenumber());
        walletAccount.setBAVerified("N");
        walletAccount.setBANumber(signindetails1.getBANumber());
        walletAccountRwpository.save(walletAccount);
        Email_Address emailAddress = new Email_Address();
        emailAddress.setEmailId(signindetails1.getEmail());
        emailAddress.setWalletAccount(walletAccount);
        emailAddRepository.save(emailAddress);
        return null;
    }

    @PostMapping("/login")
    public Boolean signindetailsvales(@RequestBody logindetails signin) {

        Email_Address emailAddress = emailAddRepository.findByEmailId(signin.getEmail());
        String ssn = emailAddress.getWalletAccount().getSSN();
        ssn.replaceAll(" ","");
        System.out.println(ssn);
        System.out.println(signin.getSSN());
        if (ssn.contains(signin.getSSN())){
            return true;
        }
        else {
            return false;
        }

    }
}






