package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	int status;
	public int insert(Employee e1){
		status=dao.insert(e1);
		return status;
	}
	public List<Employee> getEmployees(){
		return getEmployees();
	}
public void delete(Employee e1){
	dao.delete(e1);
}

}
