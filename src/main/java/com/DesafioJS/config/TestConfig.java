package com.DesafioJS.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.DesafioJS.entities.Client;
import com.DesafioJS.repositories.ClientRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	public ClientRepository clientRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Client c1 = new Client();
		clientRepository.saveAll(Arrays.asList(c1));
	}
	
}
