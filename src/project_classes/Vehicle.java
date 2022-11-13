package project_classes;

import java.text.DecimalFormat;

public class Vehicle {
	
	private String vehicleID;
	private String monthOfSale;
	private String cityOfSale;
	private int productionYear;
	private int vat;
	private double sct;
	private double totalPrice;


	public Vehicle() {
		this(null,null,null,null,null);
	}
	
	
	public Vehicle(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String vat) {
		this.vehicleID = vehicleID;
		this.monthOfSale = monthOfSale;
		this.cityOfSale = cityOfSale;
		this.productionYear =Integer.parseInt(productionYear);
		this.vat = Integer.parseInt(vat);
		

	}
	public Vehicle(Vehicle theObject) {
		this.vehicleID = theObject.vehicleID;
		this.monthOfSale = theObject.monthOfSale;
		this.cityOfSale = theObject.cityOfSale;
		this.productionYear = theObject.productionYear;
		this.vat = theObject.vat;
		this.sct = theObject.sct;
		this.totalPrice = theObject.totalPrice;
	}
	
	public String getVehicleID() {
		return vehicleID;
	}
	
	public String getMonthOfSale() {
		return monthOfSale;
	}
	
	public String getCityOfSale() {
		return cityOfSale;
	}
	
	public int getProductionYear() {
		return productionYear;
	}
	
	public double getVat() {
		return vat;
	}
	
	public double getSct() {
		return sct;
		//method for override 
	}
	
	public double getTotalPrice() {
		return 0;
		//method for override 
	}
	
	public void setVehicleID(String _inputID) {
		vehicleID = _inputID;
	}
	
	public void setMonthOfSale(String _inputMonth) {
		monthOfSale = _inputMonth;
	}
	
	public void setProductionYear(int _inputYear) {
		productionYear = _inputYear;
	}
	
	public void setVat(int _inputVat) {
		vat = _inputVat;
	}
	
	public void setSct(double _inputSct) {
		sct = _inputSct;
	}
	
	public void setTotalPrice(double _inputPrice) {
		totalPrice = _inputPrice;
	}
	
	public double sctCalculator() {
		//method for override 
		return 0;
	}
	
	public double totalPriceCalculator() {
		//method for override 
		return 0;
	}
	
	public double monthSctCalculator() {
		double monthSct = 0;
		
		if (monthOfSale.equals("January"))
			monthSct = 0.3;
		else if (monthOfSale.equals("May"))
			monthSct = 0.4;
		else if (monthOfSale.equals("August"))
			monthSct = 0.5;
		else if (monthOfSale.equals("October"))
			monthSct = 0.6;
		else if (monthOfSale.equals("December"))
			monthSct = 0.7;
		
		return monthSct;
	}
	
	public double citySctCalculator() {
		double citySct = 0;
		
		if (cityOfSale.equals("Izmir"))
			citySct = 0.1;
		else if (cityOfSale.equals("Istanbul"))
			citySct = 0.3;
		else if (cityOfSale.equals("Ankara"))
			citySct = 0.2;
		
		return citySct;
	}
	
	public double yearSctCalculator() {
		double yearSct = 0;
		
		if (2001 <= productionYear && productionYear <= 2008)
			yearSct = 1.0;
		else if (2012 <= productionYear && productionYear <= 2017)
			yearSct = 1.2;
		else if (2018 <= productionYear && productionYear <= 2022)
			yearSct = 1.6;
		
		return yearSct;
	}
	
	public boolean equals(Object _otherObject){
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			Vehicle otherVehicle = (Vehicle) _otherObject;
			return (vehicleID.equals(otherVehicle.vehicleID) &&
					monthOfSale.equals(otherVehicle.monthOfSale) &&
					cityOfSale.equals(otherVehicle.cityOfSale) &&
					productionYear == otherVehicle.productionYear &&
					vat == otherVehicle.vat &&
					sct == otherVehicle.sct &&
					totalPrice == otherVehicle.totalPrice);
		}
	}
	
	public String toString() {
		DecimalFormat sctPattern = new DecimalFormat("0.000");
		DecimalFormat moneyPattern = new DecimalFormat(".00");
		String returnString = "Vehicle ID: " + vehicleID + " Month: " + monthOfSale + " City: " + cityOfSale + 
				" Production Year: " + productionYear + " SCT: " + sctPattern.format(sct) + "\n" +
				"Total price paid for " + vehicleID + " is: " + moneyPattern.format(totalPrice)+ "TL";
		return returnString;
	}
}
