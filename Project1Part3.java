package RectangleDemo;
import java.util.Scanner;
public class Project1Part3 {

	public static String computerChoice() {
		
		int min = 1;
		
		int max = 3;
		
		int random = (int)(min + (max - min + 1) * Math.random());
		
		if(random == 3) {
			
			return "scissors";
			
		} else if(random == 2) {
			
			return "paper";
			
		} else if(random == 1) {
			
			return "rock";
		} else {
			
			return"error";
			
		}
		
	}
	
	public static String userChoice () {
		Scanner scnr = new Scanner(System.in);
		
		while(true) {
			
            System.out.print("Enter your choice of rock/paper/scissors: ");
            
            String user = scnr.nextLine();
            user = user.toLowerCase();
            if (isValidChoice(user)) {
            	
                return user;
                
            } else {
            	
            	System.out.print("Invalid choice. ");
            	
            }
            
        }
		 
    }

	public static boolean isValidChoice (String userInput) {
		
	if(userInput.equals("rock")){
		return true;
	}
	if(userInput.equals("paper")){
		return true;
	}
	if(userInput.equals("scissors")){
		return true;
	}
	else {
		
	return false;
	
	}
		
    }
		
	public static void determineWinner(String computer,String user) {
		
		System.out.println("Computer's choice: " + computer);
		
        System.out.println("Your choice: " + user);
        

        if (computer.equals(user)) {
        	
            System.out.println("It's a tie! Play again.");
            
        } else if ((computer.equals("rock") && user.equals("scissors")) ||
                   (computer.equals("scissors") && user.equals("paper")) ||
                   (computer.equals("paper") && user.equals("rock"))) {
        	
            System.out.println("Computer wins!");
            
        } else {
        	
            System.out.println("You win!");
            
        }
	}
	
	public static void main(String[] args) {
		 Scanner scnr = new Scanner(System.in);

	        while (true) {
	            String computer = computerChoice();

	            String user = userChoice();

	            determineWinner(computer, user);

	            System.out.print("Do you want to play again? Enter yes or no: ");
	            
	            String playAgain = scnr.nextLine();
	            
	            playAgain = playAgain.toLowerCase();

	            if (!playAgain.equals("yes")) {
	                break;
	            }
	        }
	        
	        System.out.println("Thanks for playing! Hope you won!");

	}
	
}
//Amilcar Peraza
//Project 1
//11/11/2023
//CIS 2900.01-1