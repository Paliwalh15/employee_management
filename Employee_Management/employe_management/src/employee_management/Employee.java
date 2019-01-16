package employee_management;

public class Employee {
	private String id;
	private String name;
	private String address;
	private String email;
	private String contact;
	private String salary;
	
	/*public Employee(int id, String name, String address, String email,
	 *  String contact) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.address = email;
        this.contact = contact;
    }*/
	/*public Employee()
	{
		
	}*/

	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getcontact() {
		return contact;
	}
	public void setcontact(String contact) {
		this.contact = contact;
	}
	public String getsalary() {
		return salary;
	}
	public void setsalary(String salary) {
		this.salary = salary;
	}
}
