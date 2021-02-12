

public class Ninja extends Human {
	
	public Ninja(String name) {
	this.name = name;
	this.stealth = 10;
	}
	
	public void steal(Human human) {
		int drain = this.stealth;
		human.health -= drain;
		this.health += drain;
		System.out.println(this.name + " stole " + drain + " health from " + human.name);
		this.displayStats();
		human.displayStats();
	} 
	
	public void runAway() {
		int damage = 10;
		this.health -= damage;
		System.out.println(this.name + " took off, removing " + damage + " damage ");
		this.displayStats();
	}
}
