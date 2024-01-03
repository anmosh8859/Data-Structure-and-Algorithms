package other;

public class LengthOfLastWord {
     public static int lengthOfLastWord(String s) {
//         int length=0;
//         boolean flag=false;
//         for(int i=s.length()-1;i>=0;i--){
//             System.out.println("I am in the loop");
//             byte j= (byte) s.charAt(i);
//             if((j>=65&&j<=90)||(j>=97&&j<=122)){
//                 System.out.println("I am in if");
//                 length++;
//                 flag=true;
//             }
//             if(i==0||s.charAt(i-1)==' '&&flag)
//                 return length;
//         }
//         System.out.println("I am at last second");
//         return length;
         String []s1=s.split(" ");
         return s1[s1.length-1].length();
    }

    public static void main(String[] args) {
        System.out.println("Length: "+LengthOfLastWord.lengthOfLastWord("Fly to the moon   "));
    }
}
