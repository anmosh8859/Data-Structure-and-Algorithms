package other;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfPangram {
    public static boolean checkIfPangram(String sentence) {
//        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(
//                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
//        ));
        char [] chars={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<sentence.length();i++){
            char ch= sentence.charAt(i);
            chars[ch-97]=' ';
//            if(chars.contains(ch))
//                chars.removeIf(c->c==ch);
        }
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' ')
                return false;
        }
        return true;
//        if(chars.size()==0)
//            return true;
//        return false;

    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
//        int sum = 0;
//        for (int i = 97; i < 123; i++)
//            sum += i;
//        System.out.println(sum);
//        2847
//        ArrayList<Character> chars = new ArrayList<>(Arrays.asList(
//                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'
//        ));
//        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(
//                54,64,85,96
//        ));
//        ints.removeIf(c->c=='c');
//        chars.removeIf(c->c=='c');
//        System.out.println(chars);
    }
}
