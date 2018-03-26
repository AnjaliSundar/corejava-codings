package pack;

public class Employee {
private int Id;
private String name;
private double Salary;
private String Designation;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, double salary, String designation) {
	super();
	this.Id = id;
	this.name = name;
	this.Salary = salary;
	this.Designation = designation;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	this.Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double d) {
	this.Salary = d;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	this.Designation = designation;
}


}

