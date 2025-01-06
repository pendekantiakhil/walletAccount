package com.example.Wallet.Repository;

import com.example.Wallet.Model.Email_Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Email_addRepository extends JpaRepository<Email_Address,Integer> {
  Email_Address findByEmailId(String EmailId);
}
