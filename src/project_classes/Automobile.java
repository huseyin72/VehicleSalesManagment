package project_classes;

public class Automobile extends Vehicle {
	private double engineVolume;
	public final int BASE_PRICE = 200000;
	
	public Automobile() {
		this(null, null, null, null, null, null);
	}
	
	public Automobile(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String vat, String engineVolume) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat);
		this.engineVolume = Double.parseDouble(engineVolume);
	}

	public Automobile(Automobile theObject) {
		super(theObject);
		this.engineVolume = theObject.engineVolume;
	}
	
	public double getEngineVolume() {
		return engineVolume;
	}
	
	public void setEngineVolume(double _engineVolume) {
		engineVolume = _engineVolume;
	}
	
	public double totalPriceCalculator() {
		double tempPrice = BASE_PRICE * (1 + (getSct() * 0.8)) + (1 + getVat()/100);
		return tempPrice;
	}
	
	public boolean equals(Object _otherObject) {
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			Automobile otherAutomobile = (Automobile) _otherObject;
			return (getVehicleID().equals(otherAutomobile.getVehicleID()) &&
					getMonthOfSale().equals(otherAutomobile.getMonthOfSale()) &&
					getCityOfSale().equals(otherAutomobile.getCityOfSale()) &&
					getProductionYear() == otherAutomobile.getProductionYear() &&
					getVat() == otherAutomobile.getVat() &&
					getSct() == otherAutomobile.getSct() &&
					getTotalPrice() == otherAutomobile.getTotalPrice() &&
					engineVolume == otherAutomobile.engineVolume);		
		}
	}
	
	public String toString() {
		String returnString = super.toString();
		return returnString;
	}
}
