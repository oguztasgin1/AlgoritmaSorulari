package HomeworksGuray;

import java.util.ArrayList;

public class Car extends Vehicle{
	public int wheel;
	public int door;
	public String engine;
	public String brand;
	public String models;

	public Car(String type, int lenght, int height, int weight, int wheel, int door, String engine, String brand,
			String models) {
		super(type, lenght, height, weight);
		this.wheel = wheel;
		this.door = door;
		this.engine = engine;
		this.brand = brand;
		this.models = models;
	}
	

	public int getWheel() {
		return wheel;
	}


	public void setWheel(int wheel) {
		this.wheel = wheel;
	}


	public int getDoor() {
		return door;
	}


	public void setDoor(int door) {
		this.door = door;
	}


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
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


	@Override
	public void move() {
		System.out.println("Car moving.");
		
	}


	@Override
	public String toString() {
		return "Car [wheel=" + wheel + ", door=" + door + ", engine=" + engine + ", brand=" + brand + ", models="
				+ models + ", type=" + type + "]";
	}
	
	
}
