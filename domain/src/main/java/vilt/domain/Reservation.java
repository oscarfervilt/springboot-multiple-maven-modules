package vilt.domain;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private long id_car;
	private long id_client;
	private Date date_start;
	private Date date_end;
	private boolean status;
	
	protected Reservation() {}

	public Reservation(long id_car, long id_client, Date date_start, Date date_end, boolean status) {
		super();
		this.id_car = id_car;
		this.id_client = id_client;
		this.date_start = date_start;
		this.date_end = date_end;
		this.status = status;
	}

	public long getId_car() {
		return id_car;
	}

	public void setId_car(long id_car) {
		this.id_car = id_car;
	}

	public long getId_client() {
		return id_client;
	}

	public void setId_client(long id_client) {
		this.id_client = id_client;
	}

	public Date getDate_start() {
		return date_start;
	}

	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}

	public Date getDate_end() {
		return date_end;
	}

	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getId() {
		return id;
	}
	
	
	
}
