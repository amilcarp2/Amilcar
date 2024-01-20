package RectangleDemo;
import java.util.Scanner;
public class Project1part2 {

    public static boolean isPalindrome(String userinfo) {
    	
        userinfo = userinfo.toLowerCase();

        char[] cleanedString = new char[userinfo.length()];
        
        int index = 0;
        
        for (int i = 0; i < userinfo.length(); i++) {
        	
            char c = userinfo.charAt(i);
            
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            	
                cleanedString[index++] = c;
                
            }
        }

        int length = index;

        for (int i = 0; i < length / 2; i++) {
        	
            if (cleanedString[i] != cleanedString[length - 1 - i]) {
            	
            return false;
                
            }
        }

        return true;
    }

    public static void palindromeTester() {
    	
        int palindromeCount = 0;
        
        Scanner scanner = new Scanner(System.in);
      
        while (true) {
        	
            System.out.print("Enter a sentence (or a blank line to stop): ");
            
            String userInput = scanner.nextLine();

            if (userInput.isEmpty()) {
            	
                break;
                
            }

            if (isPalindrome(userInput)) {
            	
                System.out.println("Palindrome found!");
                
                palindromeCount++;
                
            } 
            
            else {
            	
                System.out.println("Not a palindrome.");
                
            }
        }

        System.out.println("Total palindromes found: " + palindromeCount);

    }

    public static void main(String[] args) {
    	
        palindromeTester();
        
    }
    
}
//Amilcar Peraza
// Project 1
// 11/11/2023
// CIS 2900.01-1