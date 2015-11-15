package ua.my.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Staff {

	private int id;

	private String name;

	private int age;

	private int experience;

	private String previousWork;

	private Bar bar;

	private Hall hall;

	private Kitchen kitchen;

	public Staff() {
		super();
	}

	public Staff(String name, int age, int experience, String previousWork) {
		super();
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.previousWork = previousWork;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@OneToOne(mappedBy = "staff")
	public Bar getBar() {
		return bar;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	@OneToOne(mappedBy = "staff")
	public Kitchen getKitchen() {
		return kitchen;
	}

	public void setKitchen(Kitchen kitchen) {
		this.kitchen = kitchen;
	}

	@OneToOne(mappedBy = "staff")
	public Hall getHall() {
		return hall;
	}

	public void setHall(Hall hall) {
		this.hall = hall;
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

	@Column
	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Column(name = "previous_work")
	public String getPreviousWork() {
		return previousWork;
	}

	public void setPreviousWork(String previousWork) {
		this.previousWork = previousWork;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", bar=" + bar + ", kitchen=" + kitchen
				+ ", hall=" + hall + ", name=" + name + ", age=" + age
				+ ", experience=" + experience + ", previousWork="
				+ previousWork + "]";
	}

}
