package ua.my.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Respond {

	private int id;

	private Client Client;

	public Respond() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "client_id")
	public Client getClient() {
		return Client;
	}

	public void setClient(Client client) {
		Client = client;
	}

	@Override
	public String toString() {
		return "Respond [id=" + id + ", Client=" + Client + "]";
	}

}
