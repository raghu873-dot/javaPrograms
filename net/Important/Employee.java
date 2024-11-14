package com.net.Important;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{

	private Integer id;
	private String name;
	private Address address;
	private Integer salary;
	private List<String> department=new ArrayList<>();
	
	public Employee(Integer id, String name, Address address, Integer salary, List<String> department) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.department = department;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public List<String> getDepartment() {
		return department;
	}
	public void setDepartment(List<String> department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	
	
	
	
}
