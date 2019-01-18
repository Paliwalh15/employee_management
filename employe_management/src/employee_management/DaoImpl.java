package employee_management; 
import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoImpl implements Dao {
	ConnectionFactory obj=new ConnectionFactory();
	Connection con=obj.getConnection();
	Statement stmnt=null;

	//Creating a new employee
	@Override
	public boolean createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try
		{
		  PreparedStatement ps=con.prepareStatement("INSERT INTO employee"
		  		+ " VALUES (?,?,?,?,?,?)");
		  ps.setString(1, employee.getid());
		  ps.setString(2, employee.getname());
		  ps.setString(3, employee.getaddress());
		  ps.setString(4, employee.getemail());
		  ps.setString(5, employee.getcontact());
		  ps.setInt(6, employee.getsalary());
		  ps.execute();
		} catch(SQLException ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	//Getting profile of all existing employees
	@Override
	//public List<Employee> rettriveAllEmployee() {
	public Employee rettriveAllEmployee() {
		//List<Employee> emp_list=new ArrayList<>();
		// TODO Auto-generated method stub
		try
		{
			String sql="SELECT * FROM employee";
			stmnt=con.createStatement();
			ResultSet rs=stmnt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println("ID     :"+ rs.getString("id"));
				System.out.println("Name   :"+ rs.getString("name"));
				System.out.println("contact:"+ rs.getString("contact"));
				System.out.println("Email  :"+ rs.getString("email"));
				System.out.println("Address:"+ rs.getString("address"));
				System.out.println("Salary :"+ rs.getString("salary"));
				System.out.println("----------------------------------------");
			}
			rs.close();
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return null;
	}
		/*try {
			String sql="SELECT * FROM employee";
			Statement stmnt=con.createStatement();
			ResultSet rs=stmnt.executeQuery(sql);
			while(rs.next())
			{
				Employee emp=new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
				emp_list.add(emp);
			}		
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return emp_list;*/
	

	//Updating employee's information by providing EmployeeID
	@Override
	public boolean updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String queryString = "UPDATE employee SET name=?,contact=?,email=?,"
				+ "address=?,salary=? WHERE id=?";
		try { 
		PreparedStatement ps=con.prepareStatement(queryString);
		ps.setString(1, employee.getname()); 
		ps.setString(2, employee.getcontact()); 
		ps.setString(3, employee.getemail()); 
		ps.setString(4, employee.getaddress());
		ps.setInt(4, employee.getsalary());
		ps.setString(6, employee.getid());
		ps.executeUpdate(); 
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	//Deleting employee by providing employeeID
	@Override
	public boolean deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			String sql="DELETE FROM employee WHERE id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, employee.getid());
			ps.execute();
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	//Getting profile of particular employee
	@Override
	public Employee rettriveEmployeeById(Employee employee) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("SELECT * FROM employee"
					+ " WHERE id = ?");
			//System.out.println("hi");
			ps.setString(1, employee.getid());
			//System.out.println("hye");
			ResultSet rs=ps.executeQuery();
			//System.out.println("hello");
			while(rs.next())
			{
				System.out.println("ID     :"+ rs.getString("id"));
				System.out.println("Name   :"+ rs.getString("name"));
				System.out.println("contact:"+ rs.getString("contact"));
				System.out.println("Email  :"+ rs.getString("email"));
				System.out.println("Address:"+ rs.getString("address"));
				System.out.println("Salary :"+ rs.getInt("salary"));
				System.out.println("-------------------------------------------");
			}
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return null;
	}

	//Sorting employees by their salary
	@Override
	public Employee sortEmployeeBySalary() {
		// TODO Auto-generated method stub
		try {
			String sql="SELECT id,name,salary FROM employee ORDER by salary ASC";
			stmnt=con.createStatement();
			ResultSet rs=stmnt.executeQuery(sql);
		/*	System.out.println("ID |  Name  |  Address  |   Email   |  Contact  | Salary");
			System.out.println("___|________|___________|___________|___________|________");
			//System.out.println(rs.getString("id") );
			while(rs.next())
			{
				System.out.println(rs.getString("id")+" | "+
			rs.getString("name")+" |  "+rs.getString("address")+"  |  "+rs.getString("email")
			+"   |   "+rs.getString("contact")+"  |  "+rs.getInt("salary"));
			}*/
			System.out.println("ID  |  Name  |  Salary");
			System.out.println("______________________");
			while(rs.next())
			{
				System.out.println(rs.getString("id")+"  |  "+rs.getString("name")+""
						+ "  |  "+rs.getInt("salary"));
			}
			
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return null;
	}

	//Getting ID's of all employee associated with a particular project
	@Override
	public EmployeeProject getEmployeesByProjectId(EmployeeProject ep) {
		// TODO Auto-generated method stub
		try {
			String query ="SELECT emp_id from employee_project WHERE"
					+ " project_id=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, ep.getProject_id());
			ResultSet rs=ps.executeQuery();
			System.out.println("Following are the Id's of employee who are"
					+ " working on this project!");
			while(rs.next())
			{
				System.out.println(rs.getString("emp_id"));
			}
		} catch (Exception ex)
{
			System.out.println(ex);
}
		return null;
	}

	//Adding project
	@Override
	public boolean addProject(Projects project) {
		// TODO Auto-generated method stub
		try {
			String sql="INSERT into Projects VALUES(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, project.getId());
			ps.setString(2, project.getDescription());
			ps.execute();
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	//Deleting project
	@Override
	public boolean deleteProject(Projects project) {
		// TODO Auto-generated method stub
		try {
			String sql="DELETE FROM projects WHERE id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, project.getId());
			ps.execute();			
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	//Updating project
	@Override
	public boolean updateProject(Projects project) {
		// TODO Auto-generated method stub
		try {
			String sql="UPDATE projects SET description=? WHERE id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, project.getDescription());
			ps.setString(2, project.getId());
			ps.execute();
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return false;
	}

	//Updating Salary
	@Override
	public Employee updateSalary(Employee employee) {
		// TODO Auto-generated method stub
		try {
			String sql="UPDATE employee SET salary=? WHERE id=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, employee.getsalary());
			ps.setString(2, employee.getid());
			ps.execute();
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return null;
	}

	//Assigning project to employee
	@Override
	public boolean assignProjects(EmployeeProject ep) {
		// TODO Auto-generated method stub
		try {
			String sql="INSERT into employee_project VALUES(?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, ep.getEmp_id());
			ps.setString(2, ep.getProject_id());
			ps.execute();
		} catch(Exception ex)
		{
			System.out.println(ex);
		}
		return false;
	}
}
