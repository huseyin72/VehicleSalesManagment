package project_classes;

public class Vehicle {
	
	private String vehicleID;
	private String monthOfSale;
	private String cityOfSale;
	private String productionYear;
	private String vat;
	private int totalPrice;
	private int stc;


	public Vehicle() {
	}
	public Vehicle(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String vat) {
		this.vehicleID = vehicleID;
		this.monthOfSale = monthOfSale;
		this.cityOfSale = cityOfSale;
		this.productionYear =productionYear;
		this.vat = vat;
		

	}
	public Vehicle(Vehicle theObject) {
		this.vehicleID = theObject.vehicleID;
		this.monthOfSale = theObject.monthOfSale;
		this.cityOfSale = theObject.cityOfSale;
		this.productionYear = theObject.productionYear;
		this.vat = vat;
		this.totalPrice = theObject.totalPriceGetter();
		this.stc = theObject.stcGetter();
		
		
		
		
	}

	public void  totalPriceCalculator() {
		totalPrice = 0;
		//method for override 
		
		
		
	}
	public int  totalPriceGetter() {
		totalPriceCalculator();
		return totalPrice;
		
		//method for override 
		
		
		
	}
	public void   stcCalculator() {
		//method for override 
		stc = 0;
		
		
	}
	public int  stcGetter() {
		stcCalculator();
		
		return stc;
		//method for override 
	}
		

		
		
		
	
	
	

}
