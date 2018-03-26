package pack;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCrud {
	public static void main(String[] args) {
		System.out.println("Doing Update operations by passing id at runtime");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf= HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter An id");
		int tempId=sc.nextInt();
		//sc.nextLine();
		Employee emp = (Employee)s.get(Employee.class, tempId);
		if(emp!= null){
			System.out.println("Old name:"+emp.getName());
			System.out.println("Enter name:");
			String tempName=sc.next();
			emp.setName(tempName);
			System.out.println("New Name:"+emp.getName());
			s.update(emp);
			tx.commit();
		}
		//else
		//{
		//	System.err.println("Sorry  Id is not exist");
		//}
		s.close();
		sf.close();
		sc.close();
		}
			}

