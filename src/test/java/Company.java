

public class Company {
	private void add() throws EmployeeNotFoundException {
		throw new EmployeeNotFoundException();
	}

	public static void main(String[] args) throws EmployeeNotFoundException {
		Company c=new Company();
		c.add();

	}

}
