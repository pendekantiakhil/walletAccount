package com.example.Wallet.Model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class signindetails {
    private Integer BankID;

    private String BANumber;

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    private String SSN;
    private String Name ;

    private String Email;

    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    private String phonenumber;

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

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
