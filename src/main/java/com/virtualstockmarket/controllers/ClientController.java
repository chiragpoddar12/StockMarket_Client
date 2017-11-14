package com.virtualstockmarket.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virtualstockmarket.model.Client;


@RestController
public class ClientController {

	@RequestMapping(value = "/client", method = RequestMethod.GET)
	public Client firstPage() {

		Client client = new Client("Chirag", 2000000);
		
		return client;
	}
}
