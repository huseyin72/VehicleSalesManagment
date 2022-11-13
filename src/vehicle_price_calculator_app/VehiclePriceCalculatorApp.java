package vehicle_price_calculator_app;
import java.util.ArrayList;

import fileIO.FileOperation;
import project_classes.RecordClass;
import project_classes.Vehicle;

public class VehiclePriceCalculatorApp {

	public VehiclePriceCalculatorApp() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		FileOperation fileReaderStarter= new FileOperation();
		fileReaderStarter.fileReader();
		RecordClass runProgram = new RecordClass(fileReaderStarter.allSoldVehiclesGetter(),fileReaderStarter.allSoldSedansGetter(),fileReaderStarter.allSoldHatchbacksGetter(),fileReaderStarter.allSoldMinivanGetter(),fileReaderStarter.allSoldPickupGetter(),fileReaderStarter.allSoldBicycleGetter());
		
		runProgram.run();
		
	}

}
