package recursion.recursionSubset;

public class RemoveWord {
    public static String rw(String word, String giv){
        if(giv.substring(0,(word.length())).equals(word)){
            return giv.substring((word.length()));
        }
        return giv.charAt(0)+rw(word, giv.substring(1));
    }
    public static void main(String[] args) {
        String s = rw("apple","pineappleeater");
        System.out.println(s);
        System.out.println(rw("Anand", "The Anand M Sharma"));
        System.out.println(rw("emant", "Hemant Bharadwaj"));
    }
}