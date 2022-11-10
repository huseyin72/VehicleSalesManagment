package project_classes;

public class Bicycle extends Vehicle {
	private String chainType;
	private String seatPost;

	public Bicycle() {
		super();
		
	}
	public Bicycle(String vehicleID,String monthOfSale, String cityOfSale, String productionYear, String vat,String chainType,String seatPost) {
		super(vehicleID,monthOfSale, cityOfSale,productionYear,vat);
		this.chainType = chainType;
		this.seatPost = seatPost;
		
		
	}
	public Bicycle(Bicycle theObject) {
		super(theObject);

		this.chainType = theObject.chainType;
		this.seatPost = theObject.seatPost;
		
		
	}
	// override it will be here for some methods
	
	

}
