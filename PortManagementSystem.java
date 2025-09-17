package qs;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PortManagementSystem {

	private ArrayDeque<Container> containerStack;
	private ArrayDeque<Ship> shipQueue;
	private Scanner scanner;
	
	public PortManagementSystem() 
	
	{ 
		containerStack = new ArrayDeque<>();
		shipQueue = new ArrayDeque<>();
		scanner = new Scanner(System.in);
		
	}
	
	//MAIN METHOD
	
	public void run() {
		while(true) {
			System.out.print("=== Port Container Management ===");
			System.out.println("[1] Store container");
			System.out.println("[2] View Port container");
			System.out.println("[3] Register arriving ship");
			System.out.println("[4] Load next ship");
			System.out.println("[5] Load view next ship");
			System.out.println("[6] Store container");
			System.out.println("[0] Exit");
			System.out.print("[Enter choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
				case 1:
					storeContainer();
					break;
				case 2:
					viewContainers();
					break;
				case 3:
					registerShips();
					break;
				case 4:
					viewShip();
					break;
				case 5:
					loadNextShip();
					break;
				case 0:
			
			System.out.println("Exiting...");
				return;
				default:
			System.out.println("Invalid choice!");
				
			}
		}
	}
	
	
	private void storeContainer() {
		System.out.println("Enter container ID: ");
		String id = scanner.nextLine();
		System.out.print("Enter container Description: ");
		String description = scanner.nextLine();
		System.out.print("Enter container weight (kg): ");
		int weight = scanner.nextInt();
		scanner.nextLine();
		
		Container container = new Container(id, description, weight);
		containerStack.push(container);
		System.out.println("Stored: " + container);

	}
	
	private void viewContainers() {
		if (containerStack.isEmpty()) {
			System.out.println("No containers in port.");
				return;

		}
		
		System.out.println("Container in port(TOP to BUTTOM):");
			for (Container container : containerStack) {			
				System.out.println(container);		

		}
	}
	
	
	private void registerShips() {
		System.out.print("Enter ship name: ");
		String name = scanner.nextLine();
		System.out.print("Enter captain's name: ");
		String captain = scanner.nextLine();
		
		Ship ship = new Ship(name, captain);
		shipQueue.offer(ship);
		System.out.println("Registered: " + ship);

	}
	
	
	private void viewShip() {
		if (shipQueue.isEmpty()) {
			System.out.println("No ships waiting. ");
			return;

		}
		
		System.out.println("Ships Waiting(FRONT to Rear):");
		for (Ship ship : shipQueue) {
			System.out.println(ship);

		}
	}
	
	private void loadNextShip() {
		if (containerStack.isEmpty()) {
			System.out.println("No container to load.");
			return;

		}
		
		if (shipQueue.isEmpty()) {
			System.out.println("No ships waiting to load.");
			return;
		}
		
		Container container = containerStack.pop();
		Ship ship = shipQueue.poll();
		
		System.out.println("Loaded: " + container + " ---> " + ship);
	    System.out.println("Remaining containers: " + containerStack.size());
	    System.out.println("Remaining ships waiting: " + shipQueue.size());
	
	}
		
	
	public static void main(String[] args) {
		PortManagementSystem system = new PortManagementSystem();
			system.run();
	
	
		}

			}
	
	
	
	
		
		

	


