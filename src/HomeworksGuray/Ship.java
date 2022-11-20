package HomeworksGuray;

public class Ship extends Vehicle implements ICanSwim{
	public int engine;
	public int anchor;
	public int crew;
	public Ship(String type, int lenght, int height, int weight, int engine, int anchor, int crew) {
		super(type, lenght, height, weight);
		this.engine = engine;
		this.anchor = anchor;
		this.crew = crew;
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public int getAnchor() {
		return anchor;
	}
	public void setAnchor(int anchor) {
		this.anchor = anchor;
	}
	public int getCrew() {
		return crew;
	}
	public void setCrew(int crew) {
		this.crew = crew;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Ship [engine=" + engine + ", anchor=" + anchor + ", crew=" + crew + ", type=" + type + "]";
	}
	@Override
	public void movingOnWater() {
		System.out.println("Ship just swim as always can do");
		
	}
	
	
}
