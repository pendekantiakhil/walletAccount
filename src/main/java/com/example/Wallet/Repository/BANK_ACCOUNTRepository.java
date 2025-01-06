package com.example.Wallet.Repository;

import com.example.Wallet.Model.BANK_ACCOUNT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BANK_ACCOUNTRepository extends JpaRepository<BANK_ACCOUNT,Integer> {
}
