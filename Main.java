package RectangleDemo;

import java.util.Scanner;

import java.util.Random;

public class Main {
	
    public static void main(String[] args) {
    	
        TeamLeader teamLeader = getTeamLeaderDetails();
        
        displayDetails(teamLeader);
        
    }

    private static TeamLeader getTeamLeaderDetails() {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        
        String name = scanner.nextLine();
        

        System.out.print("Enter Employee Number (XXX-L): ");
        
        String employeeNumber = scanner.nextLine();

        System.out.print("Enter Hire Date (YYYY-MM-DD): ");
        
        String hireDate = scanner.nextLine();

        System.out.print("Enter Shift (1 for day, 2 for night): ");
        
        int shift = scanner.nextInt();

        System.out.print("Enter Hourly Pay Rate: ");
        
        double hourlyPayRate = scanner.nextDouble();

        System.out.print("Enter Monthly Bonus: ");
        
        double monthlyBonus = scanner.nextDouble();

        System.out.print("Enter Required Training Hours: ");
        
        int requiredTrainingHours = scanner.nextInt();

        System.out.print("Enter Attended Training Hours: ");
        
        int attendedTrainingHours = scanner.nextInt();

        return new TeamLeader(name, employeeNumber, hireDate, shift, hourlyPayRate, monthlyBonus,requiredTrainingHours, attendedTrainingHours);
    }

    private static void displayDetails(TeamLeader teamLeader) {
    	
        System.out.println("\nEmployee Name: " + teamLeader.getName());
        
        System.out.println("Employee Number: " + teamLeader.getEmployeeNumber());
        
        System.out.println("Hire Date: " + teamLeader.getHireDate());
        
        System.out.println("Shift: " + teamLeader.getShift());
        
        System.out.println("Hourly Pay Rate: " + teamLeader.getHourlyPayRate());
        
        System.out.println("Monthly Bonus: " + teamLeader.getMonthlyBonus());
        
        System.out.println("Required Training Hours: " + teamLeader.getRequiredTrainingHours());
        
        System.out.println("Attended Training Hours: " + teamLeader.getAttendedTrainingHours());
        
    }
}