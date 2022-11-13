package project_classes;

public class PickupTruck extends Vehicle {
	private String cabType;
	private String truckBedType;
	public final int BASE_PRICE = 250000;
	
	public PickupTruck() {
		this(null, null, null, null, null, null, null);
	}
	
	public PickupTruck(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String cabType,String truckBedType, String vat) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat);
		this.cabType = cabType;
		this.truckBedType = truckBedType;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public PickupTruck(PickupTruck theObject) {
		super(theObject);
		this.cabType = theObject.cabType;
		this.truckBedType = theObject.truckBedType;
	}
	
	public String getCabType() {
		return cabType;
	}
	
	public String getTruckBedType() {
		return truckBedType;
	}
	
	public void setCabType(String _cabType) {
		cabType = _cabType;
	}
	
	public void setTruckBedType(String _truckBedType) {
		truckBedType = _truckBedType;
	}
	
	public double sctCalculator() {
		if (super.getVehicleID() == null)
			return 0;
		double tempSct = 0;
		double truckSct = 0;
		double cabSct = 0;
		
		if (truckBedType.equals("regular"))
			truckSct = 0.5;
		else if (truckBedType.equals("tanker"))
			truckSct = 0.8;
		else if (truckBedType.equals("trailer"))
			truckSct = 1.0;
		
		if (cabType.equals("regular"))
			cabSct = 2.5;
		else if (cabType.equals("extended"))
			cabSct = 2.8;
		else if (cabType.equals("crew"))
			cabSct = 3;
		
		tempSct = (truckSct * yearSctCalculator()) / cabSct;
		return tempSct;
	}
	
	public double totalPriceCalculator() {
		double tempPrice = (BASE_PRICE) * (1 + (getSct() * 0.6)) + (1 + getVat()/100);
		return tempPrice;
	}
	
	public boolean equals(Object _otherObject) {
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			PickupTruck otherPickupTruck = (PickupTruck) _otherObject;
			return (getVehicleID().equals(otherPickupTruck.getVehicleID()) &&
					getMonthOfSale().equals(otherPickupTruck.getMonthOfSale()) &&
					getCityOfSale().equals(otherPickupTruck.getCityOfSale()) &&
					getProductionYear() == otherPickupTruck.getProductionYear() &&
					getVat() == otherPickupTruck.getVat() &&
					getSct() == otherPickupTruck.getSct() &&
					getTotalPrice() == otherPickupTruck.getTotalPrice() &&
					cabType.equals(otherPickupTruck.cabType) &&
					truckBedType.equals(otherPickupTruck.truckBedType));		
		}
	}
	
	public String toString() {
		String returnString = "Vehicle: Pickup Truck " + super.toString();
		return returnString;
	}
}
