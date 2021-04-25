
 @SuppressWarnings("serial")
class EmployeeNotFoundException extends Throwable{
    @Override
    public String getMessage() {
    	String msg="Employee id is not found";
    	return msg;
    }
}
   


