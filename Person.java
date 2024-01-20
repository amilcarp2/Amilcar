package RectangleDemo;

public class Person {
	
    private String name;
    
    private String address;
    
    private String telephoneNumber;

    public Person(String name, String address, String telephoneNumber) {
    	
        this.name = name;
        
        this.address = address;
        
        if (isValidPhoneNumber(telephoneNumber)) {
        	
            this.telephoneNumber = telephoneNumber;
            
        } else {
        	
            this.telephoneNumber = "N/A";
            
        }
    }

    public String getName() {
    	
        return name;
        
    }

    public String getAddress() {
    	
        return address;
        
    }

    public String getTelephoneNumber() {
    	
        return telephoneNumber;
        
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
    	
        if (phoneNumber.length() != 12) {
        	
            return false;
            
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
        	
            if (i == 3 || i == 7) {
            	
                if (phoneNumber.charAt(i) != '-') {
                	
                    return false;
                    
                }
                
            } else {
            	
                if (!Character.isDigit(phoneNumber.charAt(i))) {
                	
                    return false;
                    
                }
            }
        }
        return true;
    }
}
/* Aj Peraza 
homework 3
11/29/2023 */