package com.hibernet.HibernateCrudOperations.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe 
{
	@Id
   int id;
   String name;
   String tech;
   String email;
   String phonenumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", tech=" + tech + ", email=" + email + ", phonenumber="
			+ phonenumber + "]";
}
   
   
}
