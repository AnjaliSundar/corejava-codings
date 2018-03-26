package pack;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Criteria;
import org.hibernate.Session;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Testinheritancemapping1 {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Criteria crt = s.createCriteria(Person.class);
		List list = crt.list();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Person p= (Person)it.next();
			if(p instanceof Customer ){
				Customer c = (Customer)p;
				System.out.println("Name = "+c.getName()+"Id = "+c.getUid()+"Bankname = "+c.getBankName());
				}
			else if(p instanceof Student){
				Student s1 = (Student)p;
						System.out.println("Name = "+s1.getName()+"Id = "+s1.getUid()+"bankName = "+s1.getGrades());
			}
				else
				{
					System.out.println("Name = "+p.getName()+"Id = "+p.getUid());
				}
		
	}

}
		}
