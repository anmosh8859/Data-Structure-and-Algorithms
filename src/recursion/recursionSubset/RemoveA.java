package recursion.recursionSubset;

public class RemoveA {
    public static void ra(String res, String giv){
        if(giv.isEmpty()){
            System.out.println(res);
            return;
        }
        char ch = giv.charAt(0);
        if(ch=='a'||ch=='A')
            ra(res, giv.substring(1));
        else
            ra(res + ch, giv.substring(1));
    }
    public static String returnablera(String giv){
        if(giv.isEmpty()){
            return "";
        }
        char ch = giv.charAt(0);
        if(ch=='a'||ch=='A')
            return returnablera(giv.substring(1));
        else
            return ch + returnablera(giv.substring(1));
    }

    public static void main(String[] args) {
        ra("", "The Anand M Sharma");
        System.out.println(returnablera("The Anand M Sharma"));
    }
}
