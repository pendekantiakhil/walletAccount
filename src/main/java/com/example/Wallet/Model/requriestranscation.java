package com.example.Wallet.Model;

import jakarta.persistence.Column;

public class requriestranscation {
    private int rTid;
    private int amount;

    public int getrTid() {
        return rTid;
    }

    public void setrTid(int rTid) {
        this.rTid = rTid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    private String memo;
    private String DateTime;
    private String SSN;
}
