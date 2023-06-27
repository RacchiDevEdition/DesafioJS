package com.DesafioJS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DesafioJS.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Long> {

}
