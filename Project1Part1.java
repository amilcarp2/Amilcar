package RectangleDemo;
import java.util.Scanner;
public class Project1Part1 {

	public static void main(String[] args) {
		
			int month = userMonth();
			
	        int daysInMonth = getDaysInMonth(month);
	        
	        int day = userDay(daysInMonth);
	        
	        String season = getSeason(month, day);
	        
	        System.out.println("The season is: " + season);
	    }
		
	public static int userMonth() {
		
		int month;
		
		Scanner scnr = new Scanner(System.in);
		
		do{ 
			
		System.out.println("Enter a month using a integer from 1-12");
		
		month = scnr.nextInt();
		
		if(month < 1 || month > 12) {
			
			System.out.println("What you entered is bigger or less then 1-12 put in another number");
			
		}
			
		} while (month < 1 || month > 12);
		
	return month; 
		}
			
	
	public static int getDaysInMonth(int month) {
		
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        return daysInMonth[month];
        
    }
	
	public static int userDay(int daysInMonth) {
		
		int userday;
		
		Scanner scnr = new Scanner(System.in);
		
		do{ 
			System.out.println("Enter a day that is not less than or greater than the days in the month you entered");
			
			userday = scnr.nextInt();
			
			if(userday < 1 || userday > daysInMonth) {

				System.out.println("What you entered is bigger or less then days in the month you entered");
			}
				
			} while (userday < 1 || userday > daysInMonth);
			
		return userday; 
			}
	
	public static String getSeason(int month, int day) {
		
		 if ((month == 3 && day >= 21) || (month >= 4 && month <= 5) || (month == 6 && day <= 20)) {
			 
		        return "Spring";
		        
		    } else if ((month == 6 && day >= 21) || (month >= 7 && month <= 8) || (month == 9 && day <= 20)) {
		    	
		        return "Summer";
		        
		    } else if ((month == 9 && day >= 21) || (month >= 10 && month <= 11) || (month == 12 && day <= 20)) {
		    	
		        return "Fall";
		        
		    } else {
		    	
		        return "Winter";
		        
		    }
		}
	
}
//Amilcar Peraza
//Project 1
//11/11/2023
//CIS 2900.01-1