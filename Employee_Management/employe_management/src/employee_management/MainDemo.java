package employee_management;
import java.util.Scanner;
public class MainDemo extends DaoImpl{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MainDemo md=new MainDemo();
		Employee e=new Employee();
		Projects p=new Projects();
		EmployeeProject ep=new EmployeeProject();
		String id;
		String name;
		String address;
		String email;
		String contact;
		String salary;
		String description;
		String emp_id;
		String project_id;
		int choice;
		int ch;
		do {
		System.out.println("Enter Your Choice:\n1-CreateEmployee\n"
				            + "2-RettriveAllEmployee\n"
				            + "3-UpdateEmployeeInfo\n4-DeleteEmployee\n"
				            + "5-RettriveEmployeeById"
				            + "\n6-UpdateSalary\n7-SortEmployeeBySalary\n"
				            + "8-GetEmployeeByProjectId\n"
				            + "9-AddProject\n10-DeleteProject\n"
				            + "11-UpdateProject\n12-AssignProject\n");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter EmployeeID:");
		        id=sc.next();
			    System.out.println("Enter EmployeeName:");
		        name=sc.next();
		        System.out.println("Enter EmployeeAddress:");
		        address=sc.next();
		        System.out.println("Enter EmployeeEmail:");
		        email=sc.next();
		        System.out.println("Enter EmployeeContact:");
		        contact=sc.next();
		        System.out.println("Enter EmployeeSalary:");
		        salary=sc.next();
		        e.setid(id);
		        e.setname(name);
		        e.setaddress(address);
		        e.setemail(email);
		        e.setcontact(contact);
		        e.setsalary(salary);
		        //MainDemo md=new MainDemo();
		        md.createEmployee(e);
		        System.out.println("Records Entered Successfully!");
		        break;
		case 2: md.rettriveAllEmployee();
		        System.out.println("Here you are!");
	            break;
		case 3: System.out.println("Please enter Id of employee whose details"
				+ " you want to update!");
		        id=sc.next();
		        System.out.println("Welcome "+id);
		        System.out.println("Please enter following details you want"
		        		+ " to update!");
		        System.out.println("Name:");
		        name=sc.next();
		        System.out.println("Address:");
		        address=sc.next();
		        System.out.println("Email:");
		        email=sc.next();
		        System.out.println("Contact:");
		        contact=sc.next();
		        System.out.println("Salary:");
		        salary=sc.next();
		        e.setid(id);
		        e.setname(name);
		        e.setaddress(address);
		        e.setemail(email);
		        e.setcontact(contact);
		        e.setsalary(salary);
		        md.updateEmployee(e);
		        System.out.println("Information updated successfully!");
		        break;
		case 4: System.out.println("Enter Id of Emoloyee whome you want to"
				+ " Delete!");
		        id=sc.next();
		        e.setid(id);
		        md.deleteEmployee(e);
		        System.out.println("Employee records deleted successfully!");
		        break;
		case 5: System.out.println("Enter EmployeeId to Fetch his/her detail:");
		        id=sc.next();
		        e.setid(id);
		        md.rettriveEmployeeById(e);
		        System.out.println("Here you are!");
		        break;
		case 6: System.out.println("Enter Id of employee whose salary you want"
				+ " to update!");
		        id=sc.next();
		        System.out.println("Enter new updated salary:");
		        salary=sc.next();
		        e.setid(id);
		        e.setsalary(salary);
		        md.updateSalary(e);
		        System.out.println("Salary updated successfully!");
			    break;
		case 7: md.sortEmployeeBySalary();
		        break;
		case 8: System.out.println("Enter ProjectId:");
		        project_id=sc.next();
		        ep.setProject_id(project_id);
		        md.getEmployeesByProjectId(ep);
			    break;
		case 9: System.out.println("Enter following details!");
		        System.out.println("ProjectId:");
		        id=sc.next();
		        System.out.println("ProjectDescription:");
		        description=sc.next();
		        p.setId(id);
		        p.setDescription(description);
		        md.addProject(p);
		        System.out.println("Project Added Successfully!");
			    break;
		case 10:System.out.println("Enter ID of project which you want to"
				+ " delete!");
		        id=sc.next();
		        p.setId(id);
		        md.deleteProject(p);
		        System.out.println("Project deleted successfully!");
			    break;
		case 11:System.out.println("Enter ID of project which you want to"
				+ " update!");
		        id=sc.next();
		        System.out.println("Now please enter the new description of"
		        		+ " project!");
		        description=sc.next();
		        p.setId(id);
		        p.setDescription(description);
		        md.updateProject(p);
		        System.out.println("Updated Successfully!");
			    break;
		case 12:System.out.println("EmployeeId: ");
		        emp_id=sc.next();
		        System.out.println("ProjectId: ");
		        project_id=sc.next();
		        ep.setEmp_id(emp_id);
		        ep.setProject_id(project_id);;
		        md.assignProjects(ep);
		        System.out.println("Project successfully assigned!");
		        break;
	   default: System.out.println("Wrong Choice!");
	            break;	
		}
		System.out.println("Do you want to continue press '1' for continue!");
		ch=sc.nextInt();
		}while(ch==1);
		System.out.println("Terminated! Hope to see you again...");
	}
}
