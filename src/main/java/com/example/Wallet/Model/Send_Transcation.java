package com.example.Wallet.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Send_Transcation {

    @Id
    private String sTid;
    private String Identifier;

    private String i_DTime;
    private String c_DTime;

    private String memo;

    private String cReason;
    private String cType;
    private Integer amount;

    public String getsTid() {
        return sTid;
    }

    public void setsTid(String sTid) {
        this.sTid = sTid;
    }

    public String getIdentifier() {
        return Identifier;
    }

    public void setIdentifier(String identifier) {
        Identifier = identifier;
    }

    public String getI_DTime() {
        return i_DTime;
    }

    public void setI_DTime(String i_DTime) {
        this.i_DTime = i_DTime;
    }

    public String getC_DTime() {
        return c_DTime;
    }

    public void setC_DTime(String c_DTime) {
        this.c_DTime = c_DTime;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getcReason() {
        return cReason;
    }

    public void setcReason(String cReason) {
        this.cReason = cReason;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public WALLET_ACCOUNT getWalletAccount() {
        return walletAccount;
    }

    public void setWalletAccount(WALLET_ACCOUNT walletAccount) {
        this.walletAccount = walletAccount;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SSN")
    private WALLET_ACCOUNT walletAccount;

}
