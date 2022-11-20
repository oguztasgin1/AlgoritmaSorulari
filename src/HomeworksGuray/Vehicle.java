package HomeworksGuray;

public abstract class Vehicle {
	public String type;
	public int lenght;
	public int height;
	public int weight;
	
	
	public Vehicle(String type, int lenght, int height, int weight) {
		this.type = type;
		this.lenght = lenght;
		this.height = height;
		this.weight = weight;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getLenght() {
		return lenght;
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}


	public abstract void move();
}
