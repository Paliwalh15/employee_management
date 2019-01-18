package employee_management;
import java.util.*;

public interface Dao {
	boolean createEmployee(Employee employee);
	//List<Employee> rettriveAllEmployee();
	Employee rettriveAllEmployee(); 
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(Employee employee);
	Employee rettriveEmployeeById(Employee employee);
	Employee sortEmployeeBySalary();
	Employee updateSalary(Employee employee);
	EmployeeProject getEmployeesByProjectId(EmployeeProject ep);
	boolean addProject(Projects project);
	boolean deleteProject(Projects project);
	boolean updateProject(Projects project);
	boolean assignProjects(EmployeeProject ep);
}
