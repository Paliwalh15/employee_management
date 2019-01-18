package employee_management;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest {

	@Test
	public void testCreateEmployee() {
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		e.setid("45");
		e.setname("harsh");
		e.setaddress("ghaziabad");
		e.setemail("harsh@gmail.com");
		e.setcontact("100");
		e.setsalary(5000);
		boolean result=d.createEmployee(e);
		assertEquals(false, result);
		boolean result1=d.deleteEmployee(e);
		assertEquals(false, result1);
	}
	
	@Test
	public void testRettriveAllEmployee() {
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		Employee result=d.rettriveAllEmployee();
		assertEquals(null, result);
	}
	
	@Test
	public void testRettriveEmployeeById() {
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		e.setid("45");
		Employee result=d.rettriveEmployeeById(e);
		assertEquals(null, result);
	}
	
	/*@Test
	public void testUpdateEmployee() {
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		e.setid("45");
		e.setname("test");
		e.setaddress("test");
		e.setemail("test");
		e.setcontact("test");
		e.setsalary(5000);
		boolean result=d.updateEmployee(e);
		assertEquals(false, result);
	}*/
	
	@Test
	public void testSortEmployeeBySalary() {
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		Employee result = d.sortEmployeeBySalary();
		assertEquals(null, result);
	}
	
	@Test
	public void testUpdateSalary() {
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		e.setid("45");
		e.setsalary(10000);
		Employee result=d.updateSalary(e);
		assertEquals(null, result);
	}
	
	@Test
	public void testAddProject() {
		Projects p=new Projects();
		DaoImpl d=new DaoImpl();
		p.setId("100");
		p.setDescription("xyz");
		boolean result=d.addProject(p);
		assertEquals(false, result);
	}
	
	@Test
	public void testUpdateProject() {
		Projects p=new Projects();
		DaoImpl d=new DaoImpl();
		p.setId("100");
		p.setDescription("updatedxyz");
		boolean result=d.updateProject(p);
		assertEquals(false, result);
	}
	
	@Test
	public void testAssignProject() {
		EmployeeProject ep=new EmployeeProject();
		DaoImpl d=new DaoImpl();
		ep.setEmp_id("45");
		ep.setProject_id("100");
		boolean result=d.assignProjects(ep);
		assertEquals(false, result);
	}
	
	@Test
	public void testGetEmployeeByProjectId() {
		EmployeeProject ep=new EmployeeProject();
		DaoImpl d=new DaoImpl();
		ep.setProject_id("100");
		EmployeeProject result1=d.getEmployeesByProjectId(ep);
		assertEquals(null, result1);
	}
	
	@Test
	public void testDeleteProject() {
		Projects p=new Projects();
		DaoImpl d=new DaoImpl();
		p.setId("100");
		boolean result=d.deleteProject(p);
		assertEquals(false, result);
	}
	
	@Test
	public void testDeleteEmployee()
	{
		Employee e=new Employee();
		DaoImpl d=new DaoImpl();
		e.setid("45");
	    boolean result=d.deleteEmployee(e);
	    assertEquals(false, result);
	}
}
