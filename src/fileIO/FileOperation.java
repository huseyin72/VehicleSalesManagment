package fileIO;
import project_classes.Vehicle;
import project_classes.Sedan;
import project_classes.Automobile;
import project_classes.Bicycle;
import project_classes.Hatchback;
import project_classes.Minivan;
import project_classes.PickupTruck;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;


public class FileOperation {
	private Scanner scan;
	private Scanner scanIn;
	//ArrayList<Type> str = new ArrayList<Type>();
	private ArrayList<Vehicle> allSoldVehicles;
	private ArrayList<Vehicle> allSoldSedans;
	private ArrayList<Vehicle> allSoldHatchbacks;
	private ArrayList<Vehicle> allSoldMinivan;
	private ArrayList<Vehicle> allSoldPickup;
	private ArrayList<Vehicle> allSoldBicycle;
	public FileOperation() {
		
		allSoldVehicles = new ArrayList<Vehicle>();
		allSoldBicycle = new ArrayList<Vehicle>();
		allSoldSedans =  new ArrayList<Vehicle>();
		allSoldHatchbacks = new ArrayList<Vehicle>();
		allSoldMinivan = new ArrayList<Vehicle>();
		allSoldPickup = new ArrayList<Vehicle>();

	}

	
	public void fileReader() {
		try {
			scan = new Scanner(new File("data/HW2_SoldVehicles.csv"));
			scan.useDelimiter("\n");
			String startNext;
			while(scan.hasNext()) {
				startNext = scan.next();
				
				char searchChar = startNext.charAt(0);
				if (searchChar == 'S') {
					scanIn =new Scanner(startNext);
					scanIn.useDelimiter(",|\\n");
					 while (scanIn.hasNext()) {
						 Sedan sedanObject = new Sedan(scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next().trim());
						 allSoldSedans.add(sedanObject);
						 allSoldVehicles.add(sedanObject);
					    }
					
				}
				
				if (searchChar == 'B') {
					
					scanIn =new Scanner(startNext);
					scanIn.useDelimiter(",|\\n");
					 while (scanIn.hasNext()) {
						 Bicycle bicycleObject = new Bicycle(scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next().trim());
						 allSoldBicycle.add(bicycleObject);
						 allSoldVehicles.add(bicycleObject);
					    }
					

				}

				if (searchChar == 'H') {
					scanIn =new Scanner(startNext);
					scanIn.useDelimiter(",|\\n");				
					 while (scanIn.hasNext()) {
						 Hatchback hatchbackObject = new Hatchback(scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next().trim());
						 allSoldHatchbacks.add(hatchbackObject);
						 allSoldVehicles.add(hatchbackObject);
					    }
					
				}
				if (searchChar == 'M') {

					scanIn =new Scanner(startNext);
					scanIn.useDelimiter(",|\\n");
					 while (scanIn.hasNext()) {
						 Minivan minivanObject = new Minivan(scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next().trim());
						 allSoldMinivan.add(minivanObject);
						 allSoldVehicles.add(minivanObject);
					    }
					
					
				}
				if (searchChar == 'P') {
					scanIn =new Scanner(startNext);
					scanIn.useDelimiter(",|\\n");
					 while (scanIn.hasNext()) {
						 PickupTruck pickupObject = new PickupTruck(scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next(),scanIn.next().trim());
						 allSoldPickup.add(pickupObject);
						 allSoldVehicles.add(pickupObject);
					    }
					
					
				}
				
				
				
				
			}
			
			
			
			
		}
		catch(IOException e)
    	{
    		System.out.println("file not found");
    	}
		scan.close();
		
	}
	public ArrayList<Vehicle>  allSoldVehiclesGetter() {
		ArrayList<Vehicle> allSoldVehiclesCopy  = new ArrayList<Vehicle>();
		for (Vehicle var : allSoldVehicles) 
		{ 
			allSoldVehiclesCopy.add(new Vehicle(var));
		}
		return allSoldVehiclesCopy;
		
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
	
	
	


}
