package ua.my.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	private int id;

	private Bar bar;

	private Hall hall;

	private Kitchen kitchen;

	private List<Respond> respond;

	private String name;

	private int age;

	private String menuResponse;

	private String staffResponse;

	public Client() {
		super();
	}

	public Client(String name, int age, String menuResponse,
			String staffResponse) {
		super();
		this.name = name;
		this.age = age;
		this.menuResponse = menuResponse;
		this.staffResponse = staffResponse;
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
	@JoinColumn(name = "bar_id")
	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	@ManyToOne
	@JoinColumn(name = "hall_id")
	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
	}

	@ManyToOne
	@JoinColumn(name = "kitchen_id")
	public Kitchen getKitchen() {
		return kitchen;
	}

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "client")
	public List<Respond> getRespond() {
		return respond;
	}

	public void setRespond(List<Respond> respond) {
		this.respond = respond;
	}

	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "staff_response")
	public String getStaffResponse() {
		return staffResponse;
	}

	public void setStaffResponse(String staffResponse) {
		this.staffResponse = staffResponse;
	}

	@Column(name = "menu_response")
	public String getMenuResponse() {
		return menuResponse;
	}

	public void setMenuResponse(String menuResponse) {
		this.menuResponse = menuResponse;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", bar=" + bar + ", hall=" + hall
				+ ", kitchen=" + kitchen + ", respond=" + respond
				+ ", name=" + name + ", age=" + age + ", menuResponse="
				+ menuResponse + ", staffResponse=" + staffResponse + "]";
	}

}
