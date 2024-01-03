package other;

import java.util.Arrays;

public class ReverseString {
    public static void reverseString(char[] s) {
        revstr(s,0);
    }
    public static void swap(char [] s, int a, int j){
        char temp=s[a];
        s[a]=s[j];
        s[j]=temp;
    }
    public static void revstr(char [] s, int index){
        if(index==s.length/2)
            return;
        swap(s,index, s.length-index-1);
        revstr(s,index+1);
    }

    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
}
