package package1;

public class Car {

	private String carId;
	private String brand;
	private String model;
	private double basepriceperday;
	private boolean isAvailable;

	public Car(String carId,String brand,String model, double basepriceperday) {
		this.carId=carId;
		this.brand=brand;
		this.model=model;
		this.basepriceperday=basepriceperday;
		this.isAvailable=true;
	}

	public String getCarId() {
		return carId;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public double calculatePrice(int rentalDays) {
		return basepriceperday* rentalDays;
	}

	public boolean isAvailable() {
		return isAvailable;
	}
	public void rent() {
		isAvailable=false;
	}
	public void returnCar() {
		isAvailable=true;
	}

}
