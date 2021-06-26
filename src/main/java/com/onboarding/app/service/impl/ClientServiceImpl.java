package com.onboarding.app.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.onboarding.app.entity.Client;
import com.onboarding.app.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	private static final String GET_CLIENT_URL ="https://oauth-server-911.herokuapp.com/clients";

	private static final String BASE_CLIENT_OPERATION_URL ="https://oauth-server-911.herokuapp.com/clients/";

	//private static final String GET_CLIENT_URL = "http://localhost:8090/clients";

	//private static final String BASE_CLIENT_OPERATION_URL = "http://localhost:8090/clients/";

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Client> getAllClients() {
		ResponseEntity<Client[]> responseEntity = restTemplate.getForEntity(GET_CLIENT_URL, Client[].class);
		Client[] clientArray = responseEntity.getBody();
		return Arrays.stream(clientArray).collect(Collectors.toList());
	}

	@Override
	public Client saveClient(Client client) {
		return restTemplate.postForObject(GET_CLIENT_URL, client, Client.class);
	}

	@Override
	public Client getClientById(String id) {
		ResponseEntity<Client> responseEntity = restTemplate.getForEntity(BASE_CLIENT_OPERATION_URL + id, Client.class);
		return responseEntity.getBody();
	}

	@Override
	public Client updateClient(Client client) {
		ClientInfoRequest request = new ClientInfoRequest(client.getClientName(), client.getRedirectUrl(),
				client.getClientContact(), client.getScope(), client.getClientOrg(), client.getId());
		return restTemplate.patchForObject(BASE_CLIENT_OPERATION_URL, request, Client.class);
	}

	@Override
	public void deleteClientById(String id) {
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", id);
		restTemplate.delete(BASE_CLIENT_OPERATION_URL + id, params);
	}

}
