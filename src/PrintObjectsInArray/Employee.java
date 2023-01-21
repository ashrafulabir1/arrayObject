package PrintObjectsInArray;

public class Employee implements Comparable<Employee> {

	
	 private int empId;
	 private String name;
	    //constructor
	    public Employee(String name, int empId) {
	        this.name = name;
	        this.empId = empId;
	    }
	 
	    public String getName() {
	        return name;
	    }
	 
	    public int getempId() {
	        return empId;
	    }
	     
	    //overridden functions since we are working with array of objects
	    @Override
	    public String toString() {
	        return "{" + "name='" + name + '\'' +
	                    ", EmpId=" + empId + '}';
	    }
	 
	    //compareTo method overridden for sorting array of objects
	    @Override
	    public int compareTo(Employee o) {
	        if (this.empId != o.getempId()) {
	            return this.empId - o.getempId();
	        }
	        return this.name.compareTo(o.getName());
	    }
}
