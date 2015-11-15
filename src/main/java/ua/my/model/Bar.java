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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Bar {

	private int id;

	private List<Client> clientlist;

	private String liquorMenu;

	private String nonAlcoholigMenu;

	private Staff staff;

	public Bar() {
	}

	public Bar(String liquorMenu, String nonAlgoholicMenu) {
		super();
		this.liquorMenu = liquorMenu;
		this.nonAlcoholigMenu = nonAlgoholicMenu;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bar_id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "bar")
	public List<Client> getClientlist() {
		return clientlist;
	}

	public void setClientlist(List<Client> clientlist) {
		this.clientlist = clientlist;
	}

	@Column (name = "liquor_menu")
	public String getLiquorMenu() {
		return liquorMenu;
	}

	public void setLiquorMenu(String liquorMenu) {
		this.liquorMenu = liquorMenu;
	}

	@Column(name = "non_alcoholig_menu")
	public String getNonAlcoholigMenu() {
		return nonAlcoholigMenu;
	}

	public void setNonAlcoholigMenu(String nonAlcoholigMenu) {
		this.nonAlcoholigMenu = nonAlcoholigMenu;
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
		return "Bar [id=" + id + ", clientlist=" + clientlist + ", liquorMenu="
				+ liquorMenu + ", nonAlcoholigMenu=" + nonAlcoholigMenu
				+ ", staff=" + staff + "]";
	}

}
