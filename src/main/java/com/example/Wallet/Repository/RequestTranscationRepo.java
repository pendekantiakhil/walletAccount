package com.example.Wallet.Repository;

import com.example.Wallet.Model.REQUEST_TRANSCATION;
import com.example.Wallet.Model.Send_Transcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestTranscationRepo  extends JpaRepository<REQUEST_TRANSCATION ,Integer> {

    List<REQUEST_TRANSCATION> findAllByWalletAccountSsn(String SSN);
}
