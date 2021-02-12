

import java.util.ArrayList;

public class Human {
	String name;
	int strength;
	int stealth;
	int intelligence;
	int health;
	public Human(){
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
}
	public void displayStats() {
		ArrayList<String> stats = new ArrayList<>();
		stats.add("Name: " + this.name);
		stats.add("Health: " + this.health);
		stats.add("Strength: " + this.strength);
		stats.add("Stealth: " + this.stealth);
		stats.add("Intelligence: "+ this.intelligence);
		System.out.println(stats);
	}
	public void attack(Human human) {
		human.health -= this.strength;
		System.out.println(this.name + " attacked " + human.name + " for " + this.strength + "  damage. Heath left: " + human.health);
	}
}
		