package vilt.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vilt.domain.Client;
import vilt.persistence.ClientRepository;

@RestController
public class ClientController {
	private ClientRepository clientRepository;

	public ClientController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
//	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	@GetMapping("/clients")
	public List<Client> getClients(){
		List<Client> clients = this.clientRepository.findAll();
		
		return clients;
	}
}
