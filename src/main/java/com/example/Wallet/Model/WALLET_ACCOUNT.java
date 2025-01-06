package com.example.Wallet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WALLET_ACCOUNT {
    @Id
    private String ssn;

    @Column(name = "Name")
    private String name ;
    private int Balance;

    public String getBANumber() {
        return BANumber;
    }

    public void setBANumber(String BANumber) {
        this.BANumber = BANumber;
    }

    private String BAVerified;
    private String BANumber;
    @Column(name="PHONENO")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="BankID")
    private BANK_ACCOUNT bankAccount;

    public String getSSN() {
        return ssn;
    }

    public void setSSN(String SSN) {
        this.ssn = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public String getBAVerified() {
        return BAVerified;
    }

    public void setBAVerified(String BAVerified) {
        this.BAVerified = BAVerified;
    }

    public BANK_ACCOUNT getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BANK_ACCOUNT bankAccount) {
        this.bankAccount = bankAccount;
    }
}
