package com.onboarding.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.onboarding.app.entity.Client;
import com.onboarding.app.service.ClientService;

@Controller
public class ClientController {
	
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}
	
	// handler method to handle list clients and return mode and view
	@GetMapping("/clients")
	public String listClients(Model model) {
		model.addAttribute("clients", clientService.getAllClients());
		return "clients";
	}
	
	@GetMapping("/clients/new")
	public String createClientForm(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "create_client";
		
	}
	
	@PostMapping("/clients")
	public String saveClient(@ModelAttribute("client") Client client) {
		clientService.saveClient(client);
		return "redirect:/clients";
	}
	
	@GetMapping("/clients/edit/{id}")
	public String editClientForm(@PathVariable String id, Model model) {
		model.addAttribute("client", clientService.getClientById(id));
		return "edit_client";
	}

	@PostMapping("/clients/{id}")
	public String updateClient(@PathVariable String id,
			@ModelAttribute("client") Client client,
			Model model) {
		
		// get client from database by id
		Client existingClient = clientService.getClientById(id);
		client.setId(existingClient.getId());
		existingClient.setClientName(client.getClientName());
		existingClient.setClientOrg(client.getClientOrg());
		existingClient.setClientContact(client.getClientContact());
		existingClient.setClientSecret(client.getClientSecret());
		existingClient.setRedirectUrl(client.getRedirectUrl());
		existingClient.setScope(client.getScope());
		
		// save updated client object
		clientService.updateClient(existingClient);
		return "redirect:/clients";		
	}
	
	// handler method to handle delete client request
	
	@GetMapping("/clients/{id}")
	public String deleteClient(@PathVariable String id) {
		clientService.deleteClientById(id);
		return "redirect:/clients";
	}
	
}
