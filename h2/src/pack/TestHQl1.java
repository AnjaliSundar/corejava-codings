package pack;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQl1 {
  public static void main(String[] args) {
	SessionFactory sf = HibernateUtility.getSessionFactory();
	Session s = sf.openSession();
	String hql = "select emp.name, emp.salary from pack.Employee emp";
	Query query = s.createQuery(hql);
	List list = query.list();
	Iterator it = list.iterator();
	while(it.hasNext()){
		Object[] obj = (Object[]) it.next();
		String name = (String)obj[0];
		double salary = (Double)obj[1];
		System.out.println("name = "+name+", salary = "+salary);
		
		
		}
	sf.close();
	s.close();
}

}
