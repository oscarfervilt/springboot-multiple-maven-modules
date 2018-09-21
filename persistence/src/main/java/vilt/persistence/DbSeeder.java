package vilt.persistence;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import vilt.domain.Client;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class DbSeeder implements CommandLineRunner{
	 private ClientRepository clientRepository;
	 private static final Logger LOGGER = LoggerFactory.getLogger(DbSeeder.class);
	 private static final String userName = "osfer";
	 
	 public DbSeeder(ClientRepository clientRepository) {
		 this.clientRepository = clientRepository;
	 }
	
	 public void doNothing() {
			  
			BasicConfigurator.configure();	  
		    LOGGER.debug("Depuracion");
		    LOGGER.info("Informacion");
		    LOGGER.warn("Advertencia");
		    LOGGER.error("Error");
		    LOGGER.trace("Traza {}", userName);
		 
		    try {
		    	// any exception
		    } catch (Exception e){
			    LOGGER.error("Exception happens", e);
		    }

		  }
	 	 
	@Override
	public void run(String...strings) throws Exception{
		Client oscar = new Client("72885727s", "oscar", "fernandez", "oscar.fernandez@vilt.group.com", "68585775", "osfer", "osfer", new Date());
		Client paco = new Client("1111111a", "paco", "valle", "email", "phoneNumber", "username", "assword", new Date());
	
		List<Client> clients = new ArrayList<>();
		clients.add(oscar);
		clients.add(paco);
		
		this.clientRepository.save(clients);
	}	
}
