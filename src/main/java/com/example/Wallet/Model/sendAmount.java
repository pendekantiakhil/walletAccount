package com.example.Wallet.Model;

public class sendAmount {
    private String sTid;
    private int amount;
    private String memo;
    private String iDTime;
    private String cDTime;

    public String getsTid() {
        return sTid;
    }

    public void setsTid(String sTid) {
        this.sTid = sTid;
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

    public String getiDTime() {
        return iDTime;
    }

    public void setiDTime(String iDTime) {
        this.iDTime = iDTime;
    }

    public String getcDTime() {
        return cDTime;
    }

    public void setcDTime(String cDTime) {
        this.cDTime = cDTime;
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

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    private String cReason;
    private String cType;
    private String SSN;
}
