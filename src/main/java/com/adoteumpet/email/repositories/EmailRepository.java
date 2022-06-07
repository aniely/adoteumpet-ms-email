package com.adoteumpet.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adoteumpet.email.entities.Email;

public interface EmailRepository extends JpaRepository<Email, Long>{

}
