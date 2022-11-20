package HomeworksGuray;

public class Plane extends Vehicle implements ICanFly{
	public int engine;
	public String brand;
	public String models;
	public int wings;
	
	public Plane(String type, int lenght, int height, int weight, int engine, String brand, String models, int wings) {
		super(type, lenght, height, weight);
		this.engine = engine;
		this.brand = brand;
		this.models = models;
		this.wings = wings;
	}
	

	public int getEngine() {
		return engine;
	}


	public void setEngine(int engine) {
		this.engine = engine;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModels() {
		return models;
	}


	public void setModels(String models) {
		this.models = models;
	}


	public int getWings() {
		return wings;
	}


	public void setWings(int wings) {
		this.wings = wings;
	}


	@Override
	public void move() {
		System.out.println("Plane moving.");
		
	}


	@Override
	public String toString() {
		return "Plane [engine=" + engine + ", brand=" + brand + ", models=" + models + ", wings=" + wings + ", type="
				+ type + "]";
	}


	@Override
	public void movingOnSky() {
		System.out.println("Plane just fly as always can do");
		
	}
	
	
}
