
public class Samurai extends Human{
	static int counter;
	{counter += 1;}
	public Samurai(String name) {
		this.name = name;
		this.health = 200;
	}
	
	public void deathBlow(Human human) {
		human.health -= human.health;
		int damage = this.health / 2;
		this.health -= damage;
		System.out.println(this.name + " smacked around " + human.name + " until he bled, but managed to take " + damage + " damage along the way.");
		human.displayStats();
		this.displayStats();
	}
	
	public void meditate() {
		int feelBetter = this.health / 2;
		this.health =+ feelBetter;
		System.out.println(this.name + " is feeling better " + feelBetter + " health ");
		this.displayStats();
	}
	
	public void howMany() {
		System.out.println(" I can see " + counter + " Samurai here.");
	}
}
