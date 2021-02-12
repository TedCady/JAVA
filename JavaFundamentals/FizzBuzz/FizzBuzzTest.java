import java.util.Scanner;

public class FizzBuzzTest {
    public static void main(String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Integer needed here: ");
        int number = scanner.nextInt();
        String output = new FizzBuzz().fizzBuzz(number);
        System.out.println(output);
    }
}
