package ua.my.model;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
public class Kitchen {

	private int id;

	private List<Client> clientlist;

	private String veganMenu;

	private String classicMenu;

	private Staff staff;

	public Kitchen() {
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

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "kitchen")
	public List<Client> getClientlist() {
		return clientlist;
	}

	public void setClientlist(List<Client> clientlist) {
		this.clientlist = clientlist;
	}

	@Column(name = "vegan_menu")
	public String getVeganMenu() {
		return veganMenu;
	}

	public void setVeganMenu(String veganMenu) {
		this.veganMenu = veganMenu;
	}

	@Column(name = "classic_menu")
	public String getClassicMenu() {
		return classicMenu;
	}

	public void setClassicMenu(String classicMenu) {
		this.classicMenu = classicMenu;
	}

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "staff_id")
	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public String toString() {
		return "Kitchen [id=" + id + ", clientlist=" + clientlist
				+ ", veganMenu=" + veganMenu + ", classicMenu=" + classicMenu
				+ ", staff=" + staff + "]";
	}

}
