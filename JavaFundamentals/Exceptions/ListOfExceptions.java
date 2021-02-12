import java.util.ArrayList;

public class ListOfExceptions{
    public static void main(String[] args){
        listOfExceptions();
    }
    public static void listOfExceptions(){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("13");
        list.add("hello world");
        list.add(48);
        list.add("Goodbye World");
        for(int i = 0; i < list.size(); i++){
            try{
                Integer castedValue = (Integer) list.get(i);
            } catch(Exception e){
                System.out.println("Error at index(" + i + "); Value of object: " + list.get(i));
            }
        }
    }
}