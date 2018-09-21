package vilt.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String dni;
	private String firstname;
	private String lastname;
	private String email;
	private String phoneNumber;
	private String username;
	private String password;
	private Date created;

	protected Client() {} 

	public Client(String dni, String firstname, String lastname, String email, String phoneNumber,
			String username, String password, Date created) {
		this.dni = dni;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.username = username;
		this.password = password;
		this.created = created;		
	}

	
	public long getId() {
		return id;
	}

	public String getDni() {
		return dni;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Date getCreated() {
		return created;
	}
	
}
