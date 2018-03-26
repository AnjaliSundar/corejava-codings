package pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service = (EmployeeService)context.getBean("service");
		Employee e1 = (Employee) context.getBean("employeeObject");
	    int id;
	    String name;
	    double salary;
	    int desgination;
	    int a = 1,i;
	   do{
		 
		   System.out.println("******** Employee Management System ********");
		  System.out.println(" 1)	Add   2) Delete by Id  3) Display All  4) Update by id  5) Exit");
		 
		  Scanner sc = new Scanner(System.in);
		  sc.nextInt();
		  switch(a){
		  case 1:

			  System.out.println("Delete");
			  System.out.println("Enter id");
			  e1.setId(sc.nextInt());
			  //System.out.println("Enter name");
			  service.delete(e1);
			  break;
		  
			  
				
				  
			  
			  
		  case 2:
			  System.out.println("Enter id");
			  e1.setId(sc.nextInt());
			  System.out.println("Enter name");
			  e1.setName(sc.next());
			  System.out.println("Enter Salary");
			  e1.setSalary(sc.nextDouble());
			  System.out.println("Enter Desgination");
			  e1.setDesignation(sc.next());
			  i = service.insert(e1);
			  if(i==1)
			  
				  System.out.println("Employee info are stored");
			  break;
			
			  
			  
			  
			
		  
	  // default :
		 //  break;
		  }
}
	   while(a<5);
	   
	}
	}  
		  
		  

	   
		
		
		
		
		
		
		
		
		

