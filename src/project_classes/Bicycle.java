package project_classes;

public class Bicycle extends Vehicle {
	private String chainType;
	private String seatPost;
	public final int BASE_PRICE = 10000;

	public Bicycle() {
		this(null, null, null, null, null, null, null);
	}
	
	public Bicycle(String vehicleID,String monthOfSale, String cityOfSale, String productionYear,String chainType,String seatPost, String vat) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat);
		this.chainType = chainType;
		this.seatPost = seatPost;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public Bicycle(Bicycle theObject) {
		super(theObject);
		this.chainType = theObject.chainType;
		this.seatPost = theObject.seatPost;
		setSct(sctCalculator());
		setTotalPrice(totalPriceCalculator());
	}
	
	public String getChainType() {
		return chainType;
	}
	
	public String getSeatPost() {
		return seatPost;
	}
	
	public void setChainType(String _inputChainType) {
		chainType = _inputChainType;
	}
	
	public void setSeatPost(String _inputSeatPost) {
		seatPost = _inputSeatPost;
	}
	
	public double sctCalculator() {
		if (getVehicleID() == null)
			return 0;
		double tempSct = 0;
		double chainSct = 0;
		double seatSct = 0;
		
		if (chainType.equals("derailleur"))
			chainSct = 1.1;
		else if (chainType.equals("onechain"))
			chainSct = 1.2;
		else if (chainType.equals("doublechain"))
			chainSct = 1.3;
		
		if (seatPost.equals("carbonfiber"))
			seatSct = 0.8;
		else if (seatPost.equals("steel"))
			seatSct = 0.7;
		else if (seatPost.equals("aluminum"))
			seatSct = 0.9;
		else if (seatPost.equals("titanium"))
			seatSct = 0.6;
		
		tempSct = (chainSct * seatSct * 0.1) + monthSctCalculator();
		return tempSct;
	}
	
	public double totalPriceCalculator() {
		double tempPrice = (BASE_PRICE * 0.9) * (1 + getSct()) + (1 + getVat()/100);
		return tempPrice;
	}

	public boolean equals(Object _otherObject) {
		if (_otherObject == null)
			return false;
		else if (getClass() != _otherObject.getClass())
			return false;
		else {
			Bicycle otherBicycle = (Bicycle) _otherObject;
			return (getVehicleID().equals(otherBicycle.getVehicleID()) &&
					getMonthOfSale().equals(otherBicycle.getMonthOfSale()) &&
					getCityOfSale().equals(otherBicycle.getCityOfSale()) &&
					getProductionYear() == otherBicycle.getProductionYear() &&
					getVat() == otherBicycle.getVat() &&
					getSct() == otherBicycle.getSct() &&
					getTotalPrice() == otherBicycle.getTotalPrice() &&
					chainType.equals(otherBicycle.chainType) &&
					seatPost.equals(otherBicycle.seatPost));		
		}
	}
	
	public String toString() {
		String returnString = "Vehicle: Bicycle " + super.toString();
		return returnString;
	}
}
