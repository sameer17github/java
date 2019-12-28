package com.app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t2")
public class Employee {
	@Id
	private int id;
	private String name;
	private int salary;
	
	Employee()
	{
		
	}

	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		
	}
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return id+"\t"+name+"\t"+salary;
	}
	
}
