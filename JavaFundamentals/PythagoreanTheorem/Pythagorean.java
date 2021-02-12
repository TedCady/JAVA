
public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        int sqA = legA * legA;
        int sqB = legB * legB;
        int AB = sqA + sqB;
        double legC = Math.sqrt(AB);
        return legC;

    }
}
