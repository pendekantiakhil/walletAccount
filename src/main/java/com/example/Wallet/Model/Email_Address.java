package com.example.Wallet.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "EMAILADDRESS")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Email_Address {

    @Id
    @Column(name = "EmailADD")
    private String emailId;

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        emailId = emailId;
    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SSN")
    private WALLET_ACCOUNT walletAccount;

    public WALLET_ACCOUNT getWalletAccount() {
        return walletAccount;
    }

    public void setWalletAccount(WALLET_ACCOUNT walletAccount) {
        this.walletAccount = walletAccount;
    }
}
