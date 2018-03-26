package pack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class EmployeeDAO {
	@Autowired
private JdbcTemplate template;
public int insert(Employee e1){
	template.update("insert into Employee values(?,?,?,?)", new Object[]
			{
			e1.getId(),e1.getName(),e1.getSalary(),e1.getDesignation()
			});
	int status =1;
	return status;
	}
public void delete(Employee e1){
	template.update("delete from Employee where id = (?)",new Object[]{
			e1.getId()
	});
}
public List<Employee> getAllEmployees(){
	List<Employee> list = template.query("select * from Employee", new EmployeeRowMapper());
	return list;
	
	// TODO Auto-generated method stub
	
}

}


