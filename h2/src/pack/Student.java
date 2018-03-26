package pack;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "s")

public class Student extends Person {
	private String grades;
	
	public Student(String name, int uid, String grades) {
		super(name, uid);
		this.grades = grades;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	


	}
