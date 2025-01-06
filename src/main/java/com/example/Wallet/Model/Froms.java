//package com.example.Wallet.Model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor
//@Setter
//@Getter
//public class Froms {
//    private Integer percentage;
//
//    @Id
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="RTID")
//    private REQUEST_TRANSCATION requestTranscation;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name="EmailADD")
//    private Email_Address emailAddress;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//
//}
