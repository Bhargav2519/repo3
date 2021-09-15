package com.krivis.userservice.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="user")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iduser")
	private int iduser;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Age")
	private int Age;
	
	@Column(name="Salary")
	private float Salary;

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int iduser, String name, int age, float salary) {
		super();
		this.iduser = iduser;
		Name = name;
		Age = age;
		Salary = salary;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Users [iduser=" + iduser + ", Name=" + Name + ", Age=" + Age + ", Salary=" + Salary + "]";
	}
	
}