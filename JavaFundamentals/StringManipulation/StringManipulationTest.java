public class StringManipulationTest{
    public static void main(String[] args){
        StringManipulation manipulation = new StringManipulation();
        String str = manipulation.trimAndConcat("    Hello    ", "    World         ");
        String word ="Hello";
        String subString = "llo";
        String notSubString = "world";
        String word2 = manipulation.concatSubstring("Hello" , 1, 2, "world");
        char letter = 'o';
        int a = manipulation.getIndexOrNull("Coding", letter);
        int b = manipulation.getIndexOrNull("Hello World", letter);
        int c = manipulation.getIndexOrNull("Hi", letter);
        int a2 = manipulation.getIndexOrNull(word, letter);
        int b2 = manipulation.getIndexOrNull(word, letter);
        int[] output = {a, b, c, a2, b2};
        System.out.println(str);
        for(int i = 0; i < output.length; i++){
            if(output[i] >= 0){
                System.out.println(output[i]);
            }
            else {
                System.out.println("null");
            }
        }
        System.out.println(word2);
    }
}