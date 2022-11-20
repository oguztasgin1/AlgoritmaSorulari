package HomeworksGuray;

public class OOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICanFly boing747 = new Plane("Plane", 15, 5, 182, 4, "Airliner", "Boeing 747-400", 4);
		boing747.movingOnSky();
		System.out.println(boing747.toString());
		
		System.out.println("===========================");
		
		ICanSwim aidaNova = new Ship("Ship", 337, 42, 182000, 4, 1, 1646);
		aidaNova.movingOnWater();
		System.out.println(aidaNova.toString());
		
		
	}

}
