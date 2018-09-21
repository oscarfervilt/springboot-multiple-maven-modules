package vilt.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private String brand;
	private String model;
	private String color;
	private String registrationNumber;
	private String km;
	private String username;
	private String deposit;

	protected Car() {}

	public Car(String brand, String model, String color, String registrationNumber, String km, String username,
			String deposit) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.km = km;
		this.username = username;
		this.deposit = deposit;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getKm() {
		return km;
	}

	public void setKm(String km) {
		this.km = km;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public long getId() {
		return id;
	} 
	
	
}