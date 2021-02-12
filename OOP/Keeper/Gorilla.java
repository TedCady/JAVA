public class Gorilla extends Mammal {


	public void throwSomething() {
		energy -= 5;
		System.out.println("The gorilla threw something");
		displayEnergy();
		
	}
	
	public void eatBananas() {
		energy += 10;
		System.out.println(" The power of Bananas!");
		displayEnergy();
		
	}
	
	public void climb() {
		energy -= 10;
		System.out.println("Climbing makes me tired.");
		displayEnergy();
	}
}
