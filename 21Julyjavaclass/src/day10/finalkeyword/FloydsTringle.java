package day10.finalkeyword;

import java.util.Scanner;

public class FloydsTringle {

	  public static void main(String[] args) {  
		    // creating object for the scanner class  
		        Scanner scanner = new Scanner(System.in);  
		        System.out.print("Enter the number of rows for Floyd Triangle: ");  
		        int rows = scanner.nextInt();  
		        int number = 1;  
		        System.out.println("Floyd Triangle:");  
		    // printing the floyds triangle  
		        for (int i = 1; i <= rows; i++) {  
		            for (int j = 1; j <= i; j++) {  
		                System.out.print(number + " ");  
		                number++;  
		            }  
		            System.out.println();  
		        }  
		    }  
		}  