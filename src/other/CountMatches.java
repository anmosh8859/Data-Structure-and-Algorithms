package other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        String item= items.toString();
        System.out.println(item);
        System.out.println(items);
        char[] key=ruleKey.toCharArray();
        for(int i=0;i<items.size();i++){
            if(ruleKey.equals("type")){
                if(items.get(i).get(0).equals(ruleValue))
                    count++;
            }
            else if(ruleKey.equals("color")){
                if(items.get(i).get(1).equals(ruleValue))
                    count++;
            }
            else{
                if(items.get(i).get(2).equals(ruleValue))
                    count++;
            }
        }
        return count;
//        int x;
//        if (ruleKey.equals("type"))
//            x = 0;
//        else if (ruleKey.equals("color"))
//            x = 1;
//        else x = 2;
//        int k = 0;
//        for (List<String> l : items) {
//            if (l.get(x).equals(ruleValue))
//                k++;
//        }
//        return k;
    }

    public static void main(String[] args) {
        List<List<String>> listed=new ArrayList<>();
        listed.add(new ArrayList<>(
                Arrays.asList("phone","blue","pixel")
        ));
        listed.add(new ArrayList<>(
                Arrays.asList("computer","silver","lenovo")
        ));
        listed.add(new ArrayList<>(
                Arrays.asList("phone","gold","iphone")
        ));
        System.out.println(countMatches(listed,"type","phone"));
    }
}
