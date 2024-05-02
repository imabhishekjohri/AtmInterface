package com.main;

import java.util.Scanner;

public class AtnInterface {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Create an instance of the ATM class
	        ATM atm = new ATM();
	        
	        // Welcome message
	        System.out.println("Welcome to the ATM Interface!");
	        
	        // User authentication
	        System.out.print("Enter user ID: ");
	        String userId = scanner.nextLine();
	        System.out.print("Enter PIN: ");
	        String pin = scanner.nextLine();
	        
	        // Check if authentication is successful
	        if (atm.authenticate(userId, pin)) {
	            System.out.println("Authentication successful!");
	            // Display ATM functionalities
	            atm.displayMenu();
	            // Process user input
	            atm.processTransaction(scanner);
	        } else {
	            System.out.println("Authentication failed. Exiting...");
	        }
	    }
	}

	class ATM {
	    private String userId = "Abhishek";
	    private String pin = "Abhishek@12";
	    
	    // Authenticate user
	    public boolean authenticate(String userId, String pin) {
	        return this.userId.equals(userId) && this.pin.equals(pin);
	    }
	    
	    // Display ATM menu
	    public void displayMenu() {
	        System.out.println("\nATM  :::::::::: Menu:");
	        System.out.println("1. Transactions History");
	        System.out.println("2. Withdraw");
	        System.out.println("3. Deposit");
	        System.out.println("4. Transfer");
	        System.out.println("5. Quit");
	    }
	    
	    // Process user transactions
	    public void processTransaction(Scanner scanner) {
	        boolean quit = false;
	        while (!quit) {
	            System.out.print("\nEnter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline
	            
	            switch (choice) {
	                case 1:
	                    System.out.println("Displaying Transactions History...");
	                    // Implement transactions history functionality
	                    break;
	                case 2:
	                    System.out.println("Withdrawal...");
	                    // Implement withdrawal functionality
	                    break;
	                case 3:
	                    System.out.println("Deposit...");
	                    // Implement deposit functionality
	                    break;
	                case 4:
	                    System.out.println("Transfer...");
	                    // Implement transfer functionality
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    quit = true;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

