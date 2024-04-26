package com;
import java.util.Scanner;
public class Terminal {
	public static void main(String[] args)  {
		Containerterminal a= new Containerterminal(7,7,4);
		a.create(6, 6);
		a.create(6, 5);
		a.create(5, 5);
		a.create(4, 5);
		a.create(3, 5);
		a.create(6, 4);
		a.create(6, 3);
		a.create(6, 2);
		a.create(5, 2);
		a.create(4, 2);
		a.create(6, 0);
		a.create(6, 1);

		 for (int i = 0; i <a.q.length; i++) {
			 if(a.q[i]==null) {
        		System.out.print("-");
        	}
        	else
        		System.out.print(a.q[i]);
		 }
		 System.out.println(" ");
		 
		 for (int i = 0; i <a.con.length; i++) {
	            for (int j = 0; j < a.con[i].length; j++) {
	            	if(a.con[i][j]==null) {
	            		
	            		System.out.print(" ");
	            		
	            	}
	            	else
	            		System.out.print(a.con[i][j]);
	            }
	            System.out.println();
		 }
			
		Scanner sc= new Scanner(System.in);
		while (true) {
	            System.out.print("Enter something (or 'X' to exit): ");
	            String userInput = sc.nextLine();
	            if (userInput.equalsIgnoreCase("A")) {
	                a.aufnehmen();
	            }
	            else if (userInput.equalsIgnoreCase("L")) {
	                a.links();
	            }
	            else if (userInput.equalsIgnoreCase("B")) {
	                a.ablegen();
	            }
	            else if (userInput.equalsIgnoreCase("R")) {
	                a.rechts();
	            }
	            else if (userInput.equalsIgnoreCase("X")) {
	                System.out.println("Exiting the program. Goodbye!");
	                break;  // Exit the loop
	            }
	   		 for (int i = 0; i <a.q.length; i++) {
	   			 if(a.q[i]==null) {
	            		System.out.print("-");
	            	}
	            	else
	            		System.out.print(a.q[i]);
	   		 }
	   		 System.out.println(" ");
	   		 for (int i = 0; i <a.con.length; i++) {
	   	            for (int j = 0; j < a.con[i].length; j++) {
	   	            	if(a.con[i][j]==null) {
	   	            		System.out.print(" ");
	   	            	}
	   	            	else
	   	            		System.out.print(a.con[i][j]);
	   	            }
	   	            System.out.println();
	   		 }
	        }
	        // Close the scanner when done to avoid resource leaks
	        sc.close();
	}
	}

