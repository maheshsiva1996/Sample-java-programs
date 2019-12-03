package RestAPI.model;

public class FordCars {
	
	private String modelName;
	private double price;
	private double mileage;
	private int capacity;
	private String color;
	private double ratings;
	
	
	
	public FordCars(String modelName, double price, double mileage, int capacity, String color, double ratings) {
		this.modelName = modelName;
		this.price = price;
		this.mileage = mileage;
		this.capacity = capacity;
		this.color = color;
		this.ratings = ratings;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getMileage() {
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}	

}
