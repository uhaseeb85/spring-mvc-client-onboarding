package com.onboarding.app.service;

import java.util.List;

import com.onboarding.app.entity.Client;

public interface ClientService {
	List<Client> getAllClients();
	
	Client saveClient(Client client);
	
	Client getClientById(String id);
	
	Client updateClient(Client client);
	
	void deleteClientById(String id);
}
