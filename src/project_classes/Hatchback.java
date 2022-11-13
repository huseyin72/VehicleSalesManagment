package project_classes;

public class Hatchback extends Automobile {
	private String cityMode;
	
	public Hatchback() {
		this(null, null, null, null, null, null, null);
	}
	
	public Hatchback(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String cityMode, String engineVolume, String vat) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat, engineVolume);
		this.cityMode = cityMode;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public Hatchback(Hatchback theObject) {
		super(theObject);
		this.cityMode = theObject.cityMode;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public String getCityMode() {
		return cityMode;
	}
	
	public void setCityMode(String _cityMode) {
		cityMode = _cityMode;
	}
	
	public double sctCalculator() {
		if (getVehicleID() == null)
			return 0;
		double tempSct = 0;
		double citySct = 0;
		
		if (cityMode.equals("yes"))
			citySct = 0.15;
		else if (cityMode.equals("no"))
			citySct = 0.1;
		
		tempSct = (getEngineVolume() * 0.3 * yearSctCalculator() + citySct);
		return tempSct;
	}
	
	public boolean equals(Object _otherObject) {
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			Hatchback otherHatchback = (Hatchback) _otherObject;
			return (getVehicleID().equals(otherHatchback.getVehicleID()) &&
					getMonthOfSale().equals(otherHatchback.getMonthOfSale()) &&
					getCityOfSale().equals(otherHatchback.getCityOfSale()) &&
					getProductionYear() == otherHatchback.getProductionYear() &&
					getVat() == otherHatchback.getVat() &&
					getSct() == otherHatchback.getSct() &&
					getTotalPrice() == otherHatchback.getTotalPrice() &&
					getEngineVolume() == otherHatchback.getEngineVolume() &&
					cityMode.equals(otherHatchback.cityMode));		
		}
	}
	
	public String toString() {
		String returnString = "Vehicle: Hatchback " + super.toString();
		return returnString;
	}
}
