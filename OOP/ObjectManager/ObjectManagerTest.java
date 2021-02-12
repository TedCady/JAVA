

public class ObjectManagerTest {
	
	public static void main(String[] args) {
		Wizard w = new Wizard("Merlin");
		Wizard w2 = new Wizard("Jesus");
		w.fireball(w2);
		Ninja n = new Ninja("Roku");
		Ninja n2 = new Ninja("Will Smith");
		n.steal(n2);
		n.runAway();
		Samurai s = new Samurai("Tommy");
		Samurai s2 = new Samurai("Lee");
		s.deathBlow(s2);
		s.meditate();
		Samurai s3= new Samurai("Jones");
		s3.deathBlow(w);
		s.howMany();
	}
}
