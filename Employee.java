package RectangleDemo;

public class Employee {
	
    private String name;
    
    private String employeeNumber;
    
    private String hireDate;

    public Employee(String name, String employeeNumber, String hireDate) {
    	
        this.name = name;
        
        this.employeeNumber = employeeNumber;
        
        this.hireDate = hireDate;
        
    }

    public String getName() {
    	
        return name;
        
    }

    public String getEmployeeNumber() {
    	
        return employeeNumber;
        
    }

    public String getHireDate() {
    	
        return hireDate;
        
    }
}