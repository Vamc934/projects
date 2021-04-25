
public class Employee {
	private void empId(int id) throws EmployeeNotFoundException {
		if (id==1004) {
			System.out.println("Employee found empName:Vamsi");
		}
		else
		try{
			throw new EmployeeNotFoundException();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("close database");
		}

	}

	public static void main(String[] args) throws EmployeeNotFoundException {
		Employee e=new Employee();
		e.empId(100);

	}

}
