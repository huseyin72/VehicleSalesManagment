package project_classes;

import java.util.ArrayList;
import java.util.*;

public class RecordClass {
	private ArrayList<Vehicle> allSoldVehicles;
	private ArrayList<Vehicle> allSoldSedans;
	private ArrayList<Vehicle> allSoldHatchbacks;
	private ArrayList<Vehicle> allSoldMinivan;
	private ArrayList<Vehicle> allSoldPickup;
	private ArrayList<Vehicle> allSoldBicycle;
	
	
	public RecordClass() {
		this (null,null,null,null,null,null);
		
	}
	

	public RecordClass(ArrayList<Vehicle> allSoldVehicles,ArrayList<Vehicle> allSoldSedans,ArrayList<Vehicle> allSoldHatchbacks,ArrayList<Vehicle> allSoldMinivan,ArrayList<Vehicle> allSoldPickup,ArrayList<Vehicle> allSoldBicycle) {
		this.allSoldVehicles = allSoldVehicles;
		this.allSoldSedans = allSoldSedans;
		this.allSoldHatchbacks = allSoldHatchbacks;
		this.allSoldMinivan = allSoldMinivan;
		this.allSoldPickup = allSoldPickup;
		this.allSoldBicycle = allSoldBicycle;
	}
	
	public RecordClass(RecordClass theObject) {
		this.allSoldVehicles = theObject.allSoldVehicles;
		this.allSoldSedans = theObject.allSoldSedans;
		this.allSoldHatchbacks = theObject.allSoldHatchbacks;
		this.allSoldMinivan = theObject.allSoldMinivan;
		this.allSoldPickup = theObject.allSoldPickup;
		this.allSoldBicycle = theObject.allSoldBicycle;
		
		
	}
	
	public ArrayList<Vehicle>  allSoldSedansGetter() {
		ArrayList<Vehicle> allSoldSedansCopy  = new ArrayList<Vehicle>();
		for (Vehicle var : allSoldSedans) 
		{ 
			allSoldSedansCopy.add(new Vehicle(var));
		}
		return allSoldSedansCopy;
		
	}
	public ArrayList<Vehicle>  allSoldHatchbacksGetter() {
		ArrayList<Vehicle> allSoldHatchbacksCopy  = new ArrayList<Vehicle>();
		for (Vehicle var : allSoldHatchbacks) 
		{ 
			allSoldHatchbacksCopy.add(new Vehicle(var));
		}
		return allSoldHatchbacksCopy;
		
	}
	public ArrayList<Vehicle>  allSoldMinivanGetter() {
		ArrayList<Vehicle> allSoldMinivanCopy  = new ArrayList<Vehicle>();
		for (Vehicle var : allSoldMinivan) 
		{ 
			allSoldMinivanCopy.add(new Vehicle(var));
		}
		return allSoldMinivanCopy;
		
	}
	public ArrayList<Vehicle>  allSoldPickupGetter() {
		ArrayList<Vehicle> allSoldPickupCopy  = new ArrayList<Vehicle>();
		for (Vehicle var : allSoldPickup) 
		{ 
			allSoldPickupCopy.add(new Vehicle(var));
		}
		return allSoldPickupCopy;
		
	}
	public ArrayList<Vehicle>  allSoldBicycleGetter() {
		ArrayList<Vehicle> allSoldBicycleCopy  = new ArrayList<Vehicle>();
		for (Vehicle var : allSoldBicycle) 
		{ 
			allSoldBicycleCopy.add(new Vehicle(var));
		}
		return allSoldBicycleCopy;
		
	}
	public  void  run() {
		System.out.println("Please press,");
		System.out.println("1 to see all sold vehicles list");
		System.out.println("2 to see sold sedan list");
		System.out.println("3 to see sold hatchback list");
		System.out.println("4 to see sold minivan list");
		System.out.println("5 to see sold pickup truck list");
		System.out.println("6 to see sold bicycle list");
		System.out.print("Please enter your choice: ");
		
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();

		switch(input) {
		case 1:
			for (Vehicle var : allSoldVehicles) 
			{ 
				System.out.println(var);

			}
			break;
		case 2:
			for (Vehicle var : allSoldSedans) 
			{ 
				
				System.out.println(var);
			}
			break;
		case 3:
			for (Vehicle var : allSoldHatchbacks) 
			{ 
				System.out.println(var);
			}
			break;
		case 4:
			for (Vehicle var : allSoldMinivan) 
			{ 
				System.out.println(var);
			}
			break;
		case 5:
			for (Vehicle var : allSoldPickup) 
			{ 
				System.out.println(var);
			}
			break;
		case 6:
			for (Vehicle var : allSoldBicycle) 
			{ 
				System.out.println(var);
			}
			break;
			
		default:
			System.out.println("wrong iput");
			break;
		
			
		}

		
		
	}
	
	

}
