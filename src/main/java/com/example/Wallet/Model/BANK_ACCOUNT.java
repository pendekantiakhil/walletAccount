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
public class BANK_ACCOUNT {

    @Id
    private Integer BankID;

    private String BANumber;


    public Integer getBankID() {
        return BankID;
    }

    public void setBankID(Integer bankID) {
        BankID = bankID;
    }

    public String getBANumber() {
        return BANumber;
    }

    public void setBANumber(String BANumber) {
        this.BANumber = BANumber;
    }
}
