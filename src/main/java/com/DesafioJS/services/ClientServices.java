package com.DesafioJS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DesafioJS.dto.ClientDto;
import com.DesafioJS.entities.Client;
import com.DesafioJS.repositories.ClientRepository;

@Service
public class ClientServices {

	@Autowired
	public ClientRepository clientRepository;

	public List<ClientDto> findAll() {
		List<Client> result = clientRepository.findAll();
		List<ClientDto> dto = result.stream().map(x -> new ClientDto(x)).toList();
		return dto;
	}

	public ClientDto save(Client client) {
		Client newClient = clientRepository.save(client);
		System.out.println(newClient);
		ClientDto newClientDto = new ClientDto(newClient);
		System.out.println(newClientDto);
		return newClientDto;

	}
}
