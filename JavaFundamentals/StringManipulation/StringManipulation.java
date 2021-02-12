public class StringManipulation {
    public String trimAndConcat(String s1, String s2){
        return s1.trim().concat(" ".concat(s2.trim()));
    }
    public String concatSubstring(String s1, int i1, int i2, String s2){
        return s1.substring(i1, i2).concat(s2);
    }
    public Integer getIndexOrNull(String word, char chr){
        return word.indexOf(chr);
    }
    public Integer getIndexOrNull(String word, String subString){
        return word.indexOf(subString);
    }
}
