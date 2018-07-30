
public class Employee {
	String firstname;
	String lastname;
	int year_of_born;
	
	public Employee(String a, String b, int c) {
		firstname = a;
		lastname = b;
		year_of_born = c;
	}
	
	public Employee(Employee emp) {
		firstname = emp.firstname;
		lastname = emp.lastname;
		year_of_born = emp.year_of_born;
	}
	
	public Employee() {
		firstname = "not_given";
		lastname = "not_given";
		year_of_born = -1;
	}
}
