

public class Wizard extends Human {
	
	public Wizard(String name) {
		this.name = name;
		this.health = 50;
		this.intelligence = 8;
		
	}
	
	public void feelBetter(Human human) {
		int feelBetter = this.intelligence;
		human.health += feelBetter;
		System.out.println(this.name + " healed " + human.name+ " for " + feelBetter + " health.");
		human.displayStats();
	}
	
	public void fireball(Human human) {
		int damage = this.intelligence * 3;
		human.health -= damage;
		System.out.println(this.name + " threw a fireball at " + human.name + " 's face for about " + damage+ " damage ");
		human.displayStats();
	}
}
