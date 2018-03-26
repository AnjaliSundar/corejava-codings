package pack;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorColumn(name = "objType")
@DiscriminatorValue(value = "p")
public class Person {
	@Id
		private String name;
		private int uid;
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(String name, int uid) {
			super();
			this.name = name;
			this.uid = uid;
		}
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
	}
