package com.DesafioJS.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.DesafioJS.services.ClientServices;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

	@Autowired
	public ClientServices clientService;
	

}
