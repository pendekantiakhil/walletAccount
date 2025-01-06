package com.example.Wallet.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class REQUEST_TRANSCATION {
    @Id
    @Column(name = "RTID")
    private int rTid;
    private int amount;
    private String memo;

    @Column(name = "DATETIME")
    private String DateTime;

    public int getRTid() {
        return rTid;
    }

    public void setRTid(int RTid) {
        this.rTid = RTid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        amount = amount;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        memo = memo;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public WALLET_ACCOUNT getWalletAccount() {
        return walletAccount;
    }

    public void setWalletAccount(WALLET_ACCOUNT walletAccount) {
        this.walletAccount = walletAccount;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ssn")
    private WALLET_ACCOUNT walletAccount;
}
