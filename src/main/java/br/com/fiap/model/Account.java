package br.com.fiap.model;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name = "teste";
	private LocalDate dateBorn;
	private String email;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateBorn() {
		return dateBorn;
	}

	public void setDateBorn(LocalDate dateBorn) {
		this.dateBorn = dateBorn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", dateBorn=" + dateBorn + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
}
