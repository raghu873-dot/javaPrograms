package com.net.Triple;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.net.Important.Address;
 
class Student {
 
	 private int id;
	 private String firstName;
	 private String lastName;
	 private int age;
	 private String gender;
	 private String departmantName;
	 private int joinedYear;
	 private String city;
	 private int rank;
	 private int salary;
	 private List<Address> address;
 
 
	 public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
			int joinedYear, String city, int rank, int salary, List<Address> address) {
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
		this.salary = salary;
		this.address = address;
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
	 
 
	 public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
				+ city + ", rank=" + rank + ", salary=" + salary + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((departmantName == null) ? 0 : departmantName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (departmantName == null) {
			if (other.departmantName != null)
				return false;
		} else if (!departmantName.equals(other.departmantName))
			return false;
		return true;
	}
	 
	 
	 
 
	}
 
public class JavaStreamStudent {
 
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			    new Student(1, "yash", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122,2000,Arrays.asList(new Address(1,"bellary"))),
			    new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67,1000,Arrays.asList(new Address(2,"bangalore"))),
			    new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164,4000,Arrays.asList(new Address(3,"delhi"))),
			    new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26,6000,Arrays.asList(new Address(4,"gujarat"))),
			    new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12,500,Arrays.asList(new Address(5,"rajasthan"))),
			    new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90,5000,Arrays.asList(new Address(6,"paris"))),
			    new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324,8000,Arrays.asList(new Address(7,"argentia"))),
			    new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433,3000,Arrays.asList(new Address(8,"portugal"))),
			    new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7,1500,Arrays.asList(new Address(3,"london"))),
			    new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98,4500,Arrays.asList(new Address(3,"australia"))));
 
	   System.out.println(list.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList()));
		Map<Integer,Set<Student>> set=list.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.toSet()));
		/* for this equals and hashcode should be overridden */
		System.out.println("Students grouped by the age and unique data : "+set);
		
		Map<Integer,Set<Student>> treemap=list.stream().collect(Collectors.groupingBy(Student::getAge,TreeMap::new,Collectors.toSet()));
		System.out.println("Students grouped by the age and sorting order and unique data : "+treemap);
		
		List<Student> lstStuName = list.stream().filter(dt -> dt.getFirstName().startsWith("A"))
			    .collect(Collectors.toList());
		System.out.println("List of students whose name starts with letter A : "+lstStuName);
		
		Map<String, List<Student>> mapData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
		System.out.println("Students grouped by the department names : "+mapData);
		
		long countStudent = list.stream().count();
		System.out.println("Total count of students : "+countStudent);
		
		OptionalInt maxAge = list.stream().mapToInt(dt -> dt.getAge()).max();
		System.out.println("Max age of student : "+maxAge.getAsInt());
		
		Student maxAgeStudentObject=list.stream().max(Comparator.comparing(Student::getAge)).get();
		System.out.println("Max age of student returing object : "+maxAgeStudentObject);
		
		List<String> lstDepartments = list.stream().map(Student::getDepartmantName).distinct()
			    .collect(Collectors.toList());
		System.out.println("All distinct department names : "+lstDepartments);
		
		Map<String, Long> countStudentInEachdept = list.stream()
			    .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
		System.out.println("Student count in each department : "+countStudentInEachdept);
		
		List<String> listofDuplicateDept=countStudentInEachdept.entrySet().stream().filter(x->x.getValue()>1).map(y->y.getKey()).collect(Collectors.toList());
		System.out.println("list of duplicates to print : "+listofDuplicateDept);
		
		List<Student> lstStudent = list.stream().filter(dt -> dt.getAge() < 30).collect(Collectors.toList());
		System.out.println("List of students whose age is less than 30 : "+lstStudent);
		
		List<Student> lstStu = list.stream().filter(dt -> dt.getRank() > 50 && dt.getRank() < 100)
			    .collect(Collectors.toList());
		System.out.println("List of students whose rank is between 50 and 100 : "+lstStu);
		
		Map<String, Double> mapAvgAge = list.stream()
			    .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
		System.out.println("Average age of male and female students : "+mapAvgAge);
		
		Entry<String, Long> entry = list.stream()
			    .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream()
			    .max(Map.Entry.comparingByValue()).get();
		System.out.println("Department having maximum number of students : "+entry);
		
		List<Student> lstDelhistudentAsc = list.stream().filter(dt -> dt.getCity().equals("Mumbai"))
			    .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
		System.out.println("List of students who stays in Delhi and sort them by their names : "+lstDelhistudentAsc);

		List<Student> lstDelhistudentDesc = list.stream().filter(dt->dt.getCity().equals("Mumbai"))
				.sorted(Comparator.comparing(Student::getFirstName).reversed()).collect(Collectors.toList());
		System.out.println("List of students who stays in Delhi and sort them in descending by their names : "+lstDelhistudentDesc);
		
		Map<String, Double> collect = list.stream()
			    .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));
		System.out.println("Average rank in all departments  : "+collect);

		Map<String, Optional<Student>> studentData = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,
			    Collectors.maxBy(Comparator.comparing(Student::getRank))));
		System.out.println("Highest rank in each department  : "+studentData);
		
		List<Student> stuRankSorted = list.stream().sorted(Comparator.comparing(Student::getRank))
			    .collect(Collectors.toList());
		System.out.println("List of students sorted by their rank  : "+stuRankSorted);
		
		List<Student> top3Salary=list.stream().sorted(Comparator.comparing(Student::getSalary).reversed()).limit(3).collect(Collectors.toList());
		System.out.println("top 3 salary  : "+top3Salary);
		
		Student student = list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();
		System.out.println("Second highest rank student  : "+student);
		
		String s= "malayalam";
		System.out.println(s.chars().mapToObj(e -> (char)e).collect(Collectors.groupingBy(t -> t,Collectors.counting())));
		Map<Character, Long> collect2 = s.chars().mapToObj(x->(char)x).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(collect2);
		
		Map<Character,Long> map=s.chars().mapToObj(e->(char) e).collect(Collectors.groupingBy(x->x,Collectors.counting()));
		
		System.out.println(list.stream().map(x->x.getFirstName()).collect(Collectors.toList()));
		
		/* flatmap converts list of list of strings, flatten them into single list of strings */ 
		Map<String, List<Address>> flatmap=list.stream().flatMap(x->x.getAddress().stream()).collect(Collectors.groupingBy(Address::getPostalAddress));
		System.out.println("groupBy postal address which is list of address  : "+flatmap);
		
		List<List<String>> listOfLists = Arrays.asList(
			    Arrays.asList("a", "b", "c"),
			    Arrays.asList("d", "e", "f"),
			    Arrays.asList("g", "h")
			);
		
		List<String> listFlatMap=listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(listFlatMap);
		
	}
}