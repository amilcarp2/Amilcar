package RectangleDemo;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        
        String name = scanner.nextLine();

        System.out.print("Enter Address: ");
        
        String address = scanner.nextLine();

        System.out.print("Enter Telephone Number (XXX-XXX-XXXX): ");
        
        String telephoneNumber = scanner.nextLine();

        if (telephoneNumber.length() != 12 || telephoneNumber.charAt(3) != '-' || telephoneNumber.charAt(7) != '-') {
        	
            System.out.println("Invalid phone number format! Setting default.");
            
            telephoneNumber = "N/A";
        }

        System.out.print("Enter Customer Number: ");
        
        int customerNumber = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Do you wish to be on the mailing list? (yes/no): ");
        
        String wantsOnMailingList = scanner.nextLine();
        
        boolean onMailingList = wantsOnMailingList.equalsIgnoreCase("yes");

        Customer customer = new Customer(name, address, telephoneNumber, customerNumber, onMailingList);

        System.out.println("\nCustomer Name: " + customer.getName());
        
        System.out.println("Address: " + customer.getAddress());
        
        System.out.println("Telephone Number: " + customer.getTelephoneNumber());
        
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        
        System.out.println("On Mailing List: " + customer.isOnMailingList());

    }
}