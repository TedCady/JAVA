import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
import java.util.List;

public class Puzzling{
    public static void main(String[] args){
        item1();
        item2();
        item3();
        item4();
        item5();
        item6();
        item7();
    }
    public static Character[] allTheLetters(String switchAV){
        if (switchAV == "alphabet"){
            Character[] alphabet ={
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
            };
            return alphabet;
        }
        else {
            Character[] vowel = {'a', 'e', 'i', 'o', 'u'};
            return vowel;
        }
    }
    public static void item1(){
        int[] arr = {3, 5, 1, 2, 7, 9, 8, 13, 25, 32};
        ArrayList<Integer> greaterThan10 = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        if(arr[i] > 10){
            greaterThan10.add(arr[i]);
        }        
    }
    System.out.println("Sum: " + sum + "; Num > 10: " + greaterThan10.toString());
    }

    public static void item2(){
        String[] arr = { "Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        List<String> arrList = Arrays.asList(arr);
        ArrayList<String> greaterThan5 = new ArrayList<String>();
        Collections.shuffle(arrList);
        for(String s: arrList){
            System.out.println(s);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(arr[i].length() >=5){
                greaterThan5.add(arr[i]);
            }
        }
        System.out.println(greaterThan5.toString());
    }

    public static void item3(){
        Character[] alphabet = allTheLetters("alphabet");
        Character[] vowel = allTheLetters("vowel");
        List<Character> alphabetList = Arrays.asList(alphabet);
        Collections.shuffle(alphabetList);
        Character firstLetter = alphabetList.get(0);
        Character lastLetter = alphabetList.get(25);
        System.out.println("Last Letter: " + lastLetter);
        for(int i = 0; i < vowel.length; i++){
            if(firstLetter == vowel[i]){
                System.out.println("First Letter is a vowel: " + firstLetter);
                break;
            }
            else{
                System.out.println("First Letter: " + firstLetter);
                break;
            }
        }
    }

    public static void item4(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 1; i <=10; i++){
            int a = new Random().nextInt(100);
            while(a < 55){
                a = new Random().nextInt(100);
            }
            arr.add(a);
        }
        System.out.println("Random array: " + arr.toString());
    }

    public static void item5(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int min = 100;
        int max = 55;
        for(int i = 1; i <= 10; i++){
            int b = new Random().nextInt(100);
            while(b < 55){
                b = new Random().nextInt(100);
            }
            if(b < min){
                min = b;
            }
            if(b > max){
                max = b;
            }
            arr.add(b);
        };
        Collections.sort(arr);
        System.out.println("Random array(sorted): " + arr.toString() + "; Min: " + min + "; Max: " + max);
    }

    public static void item6(){
        Character[] alphabet = allTheLetters("alphabet");
        char[] chars = new char[5];
        String output = "";
        for(char c: chars){
            int i = new Random().nextInt(25);
            c = alphabet[i];
            output += c;
        }
        System.out.println("Random string: " + output);
    }

    public static void item7(){
        Character[] alphabet = allTheLetters("alphabet");
        char[] chars = new char[5];
        String[] randomTen = new String[10];
        for(int i = 0; i < randomTen.length; i++){
            randomTen[i] = "";
            for(char d: chars){
                int z = new Random().nextInt(25);
                d = alphabet[z];
                randomTen[i] += d;
            }
        }
        System.out.println("Random string (array): " + Arrays.toString(randomTen));
    }
}

