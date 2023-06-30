package com.DesafioJS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DesafioJS.dto.ClientDto;
import com.DesafioJS.entities.Client;
import com.DesafioJS.services.ClientServices;

@RestController
@RequestMapping(value = "/clients" , consumes = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

	@Autowired
	public ClientServices clientService;

	@GetMapping
	public List<ClientDto> findAll() {
		List<ClientDto> searchResult = clientService.findAll();
		return searchResult;
	}

	@PostMapping
	public ClientDto insertNewClient(@RequestBody ClientDto client) {

		ClientDto newClient = clientService.save(new Client(client));
		return newClient;

	}

}
