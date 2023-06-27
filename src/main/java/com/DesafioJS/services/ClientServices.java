package com.DesafioJS.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DesafioJS.repositories.ClientRepository;

@Service
public class ClientServices {

	@Autowired
	public ClientRepository clientRepository;
}
