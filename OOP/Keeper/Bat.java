public class Bat extends Mammal{
	
	public Bat(){
	energy = 300;
	}
	
	public void fly() {
		energy -= 50;
		System.out.println("Bat Takes off, Flap, Flap, Flap");
		displayEnergy();
		
	}
	
	public void eatHumans() {
		energy += 25;
		System.out.println("The Bat ate another human");
		displayEnergy();
	}
	
	public void attackTown() {
		energy -= 100;
		System.out.println("Fire! Fire! Fire! Fire everywhere!");
		displayEnergy();
	}
}

