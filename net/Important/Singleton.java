package com.net.Important;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Student{
		private int id;
		 private String firstName;
		 private String lastName;
		 private int age;
		 private String gender;
		 private String departmantName;
		 private int joinedYear;
		 private String city;
		 private int rank;
	 
		 public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
		   int joinedYear, String city, int rank) {
		  super();
		  this.id = id;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.age = age;
		  this.gender = gender;
		  this.departmantName = departmantName;
		  this.joinedYear = joinedYear;
		  this.city = city;
		  this.rank = rank;
		 }
	 
		 public int getId() {
		  return id;
		 }
	 
		 public void setId(int id) {
		  this.id = id;
		 }
	 
		 public String getFirstName() {
		  return firstName;
		 }
	 
		 public void setFirstName(String firstName) {
		  this.firstName = firstName;
		 }
	 
		 public String getLastName() {
		  return lastName;
		 }
	 
		 public void setLastName(String lastName) {
		  this.lastName = lastName;
		 }
	 
		 public int getAge() {
		  return age;
		 }
	 
		 public void setAge(int age) {
		  this.age = age;
		 }
	 
		 public String getGender() {
		  return gender;
		 }
	 
		 public void setGender(String gender) {
		  this.gender = gender;
		 }
	 
		 public String getDepartmantName() {
		  return departmantName;
		 }
	 
		 public void setDepartmantName(String departmantName) {
		  this.departmantName = departmantName;
		 }
	 
		 public int getJoinedYear() {
		  return joinedYear;
		 }
	 
		 public void setJoinedYear(int joinedYear) {
		  this.joinedYear = joinedYear;
		 }
	 
		 public String getCity() {
		  return city;
		 }
	 
		 public void setCity(String city) {
		  this.city = city;
		 }
	 
		 public int getRank() {
		  return rank;
		 }
	 
		 public void setRank(int rank) {
		  this.rank = rank;
		 }
	 
		 @Override
		 public String toString() {
		  return " [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
		    + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
		    + city + ", rank=" + rank + "]";
		 }
	}
public class Singleton{
	
	public static void main(String args[]) {
		List<Student> list=Arrays.asList(
				new Student(1, "yash", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98)
		);
		
		
		//Highest rank in each department
		
		Map<String, Optional<Student>> map=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.maxBy(Comparator.comparing(Student::getRank))));
		System.out.println(map);
		
		
	}
}
