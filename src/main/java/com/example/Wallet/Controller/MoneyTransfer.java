package com.example.Wallet.Controller;

import com.example.Wallet.Model.*;
import com.example.Wallet.Repository.RequestTranscationRepo;
import com.example.Wallet.Repository.SendTranscationRepository;
import com.example.Wallet.Repository.WALLET_ACCOUNTRwpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoneyTransfer {
    @Autowired
    RequestTranscationRepo requestTranscationRepo;

    @Autowired
    WALLET_ACCOUNTRwpository walletAccountRwpository;

    @Autowired
    SendTranscationRepository sendTranscationRepository;

    @PostMapping("/RequestTranscation")
    public String requestTranscation(requriestranscation requestTranscation){
        REQUEST_TRANSCATION requestTranscation1 = new REQUEST_TRANSCATION();
        requestTranscation1.setAmount(requestTranscation.getAmount());
        requestTranscation1.setMemo(requestTranscation.getMemo());
        requestTranscation1.setDateTime(requestTranscation.getDateTime());
        requestTranscation1.setRTid(requestTranscation.getrTid());
        WALLET_ACCOUNT walletAccount = walletAccountRwpository.findByName(requestTranscation.getSSN());
        System.out.println(walletAccount.getName());
        requestTranscation1.setWalletAccount(walletAccount);
        requestTranscationRepo.save(requestTranscation1);
        return "success";
    }

    @GetMapping("/Statement")
    public List<Send_Transcation> statement(@PathVariable String ssn){
        return sendTranscationRepository.findAllByWalletAccountSsn(ssn);
    }

    @PostMapping("/sendTranscation")
    public String sendTranscation(sendAmount sendAmount){
        Send_Transcation sendTranscation = new Send_Transcation();
        sendTranscation.setAmount(sendAmount.getAmount());
        sendTranscation.setMemo(sendAmount.getMemo());
        sendTranscation.setC_DTime(sendAmount.getcDTime());
        sendTranscation.setI_DTime(sendAmount.getiDTime());
        sendTranscation.setsTid(sendAmount.getsTid());
        sendTranscation.setcType(sendAmount.getcType());
        sendTranscation.setcReason(sendAmount.getcReason());
        sendTranscation.setIdentifier(walletAccountRwpository.findBySsn(sendAmount.getSSN()).getPhoneNumber());
        sendTranscation.setWalletAccount(walletAccountRwpository.findBySsn(sendAmount.getSSN()));
        sendTranscationRepository.save(sendTranscation);
        return "success";
    }

    public Integer addtion(int a,int b){
        return a+b;
    }



}
