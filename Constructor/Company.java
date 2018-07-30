
public class Company {

	public static void main(String[] args) {
		
		String[] names = {"Bob", "John", "Will", "Arthur", "Marc", "Peter", "Steven"};
		String[] surnames = {"Marley", "Legend", "Smith", "LuterKing", "Zuckenberg", "Crouch", "Gerrard"};
		int[] year = {1987, 1965, 1972, 1850, 1982, 1981, 1980}; 
		
		Employee[] employees = new Employee[14];
		
		for(int i=0; i<7; i++) {
			employees[i] = new Employee(names[i], surnames[i], year[i]);
		}
		
		for(int i=7; i<12; i++) {
			employees[i] = new Employee(employees[i-7]);
		}
		
		for(int i=12; i<14; i++) {
			employees[i] = new Employee();
		}
		
		//for(Employee emp: employees) {
		//	System.out.println("emp: "+emp.firstname+" "+emp.lastname+" "+emp.year_of_born);
		//}
		
		for(int i=0; i<14; i++) {
			System.out.println("Employee no."+(i+1)+", "+employees[i].firstname+", "+employees[i].lastname+", "+employees[i].year_of_born);
		}

	}

}
