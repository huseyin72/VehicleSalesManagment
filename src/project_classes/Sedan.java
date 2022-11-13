package project_classes;

public class Sedan extends Automobile {
	private String roofType;
	
	public Sedan() {

	}
	
	public Sedan(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String roofType, String engineVolume, String vat) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat, engineVolume);
		this.roofType = roofType;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public Sedan(Sedan theObject) {
		super(theObject);
		this.roofType = theObject.roofType;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public String getRoofType() {
		return roofType;
	}
	
	public void setRoofType(String _roofType) {
		roofType = _roofType;
	}
	
	public double sctCalculator() {
		if (getVehicleID() == null)
			return 0;
		double tempSct = 0;
		double roofSct = 0;
		
		if (roofType.equals("regular"))
			roofSct = 0.5;
		else if (roofType.equals("moonroof"))
			roofSct = 0.6;
		else if (roofType.equals("sunroof"))
			roofSct = 0.8;
		
		tempSct = (getEngineVolume() * 0.2 * roofSct) / yearSctCalculator();
		return tempSct;
	}
	
	public boolean equals(Object _otherObject) {
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			Sedan otherSedan = (Sedan) _otherObject;
			return (getVehicleID().equals(otherSedan.getVehicleID()) &&
					getMonthOfSale().equals(otherSedan.getMonthOfSale()) &&
					getCityOfSale().equals(otherSedan.getCityOfSale()) &&
					getProductionYear() == otherSedan.getProductionYear() &&
					getVat() == otherSedan.getVat() &&
					getSct() == otherSedan.getSct() &&
					getTotalPrice() == otherSedan.getTotalPrice() &&
					getEngineVolume() == otherSedan.getEngineVolume() &&
					roofType == otherSedan.roofType);		
		}
	}
	
	public String toString() {
		String returnString = "Vehicle: Sedan " + super.toString();
		return returnString;
	}
}
