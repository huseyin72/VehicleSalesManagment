package project_classes;

public class Minivan extends Automobile{
	private int numberOfSeats;
	
	public Minivan() {
		this(null, null, null, null, null, null, null);
	}
	
	public Minivan(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String numberOfSeats, String engineVolume, String vat 	) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat, engineVolume);
		this.numberOfSeats = Integer.parseInt(numberOfSeats);
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public Minivan(Minivan theObject) {
		super(theObject);
		this.numberOfSeats = theObject.numberOfSeats;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	
	public void setNumberOfSeats(int _numberOfSeats) {
		numberOfSeats = _numberOfSeats;
	}
	
	public double sctCalculator() {
		if (getVehicleID() == null)
			return 0;
		double tempSct = 0;
		double seatSct = 0;
		
		if (numberOfSeats == 4)
			seatSct = 0.1;
		else if (numberOfSeats == 5)
			seatSct = 0.4;
		else if (numberOfSeats == 6)
			seatSct = 0.6;
		else if (numberOfSeats == 7)
			seatSct = 0.8;
		
		tempSct = (0.6 * yearSctCalculator()) / (getEngineVolume() + seatSct);
		return tempSct;
	}
	
	public boolean equals(Object _otherObject) {
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			Minivan otherMinivan = (Minivan) _otherObject;
			return (getVehicleID().equals(otherMinivan.getVehicleID()) &&
					getMonthOfSale().equals(otherMinivan.getMonthOfSale()) &&
					getCityOfSale().equals(otherMinivan.getCityOfSale()) &&
					getProductionYear() == otherMinivan.getProductionYear() &&
					getVat() == otherMinivan.getVat() &&
					getSct() == otherMinivan.getSct() &&
					getTotalPrice() == otherMinivan.getTotalPrice() &&
					getEngineVolume() == otherMinivan.getEngineVolume() &&
					numberOfSeats == otherMinivan.numberOfSeats);		
		}
	}
	
	public String toString() {
		String returnString = "Vehicle: Minivan " + super.toString();
		return returnString;
	}

}
