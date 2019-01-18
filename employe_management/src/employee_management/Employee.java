package employee_management;

public class Employee {
	private String id;
	private String name;
	private String address;
	private String email;
	private String contact;
	private int salary;
	
	public Employee(String id, String name, String address, String email,
	   String contact,int salary) {

        this.id = id;
        this.name = name;
        this.address = address;
        this.address = email;
        this.contact = contact;
        this.salary = salary;
    }
	public Employee()
	{
		
	}
/**
 * @return the id
 */
	public String getid() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setid(String id) {
		this.id = id;
	}
	
	/**
	 * @return the name
	 */
	public String getname() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setname(String name) {
		this.name = name;
	}
	
	/**
	 * @return the address
	 */
	public String getaddress() {
		return address;
	}
	
	/**
	 * @param address the address to set
	 */
	public void setaddress(String address) {
		this.address = address;
	}
	
	/**
	 * @return the email
	 */
	public String getemail() {
		return email;
	}
	
	/**
	 * @param email the email to set
	 */
	public void setemail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the contact
	 */
	public String getcontact() {
		return contact;
	}
	
	/**
	 * @param contact the contact to set
	 */
	public void setcontact(String contact) {
		this.contact = contact;
	}
	
	/**
	 * @return the salary
	 */
	public int getsalary() {
		return salary;
	}
	
	/**
	 * @param salary the salary to set
	 */
	public void setsalary(int salary) {
		this.salary = salary;
	}
}
