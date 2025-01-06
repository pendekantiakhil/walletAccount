package com.example.Wallet.Repository;

import com.example.Wallet.Model.Send_Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SendTranscationRepository extends JpaRepository<Send_Transcation,Integer> {
    List<Send_Transcation> findAllByWalletAccountSsn(String ssn);
}
