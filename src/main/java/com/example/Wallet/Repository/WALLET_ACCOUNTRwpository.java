package com.example.Wallet.Repository;

import com.example.Wallet.Model.WALLET_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WALLET_ACCOUNTRwpository extends JpaRepository<WALLET_ACCOUNT,Integer> {
    WALLET_ACCOUNT findByName(String Name);

    WALLET_ACCOUNT findBySsn(String ssn);
}
