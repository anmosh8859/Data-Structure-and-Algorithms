package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("Pakistan", 23);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 155);

        System.out.println(map);

        if(map.containsKey("Indonesia")) System.out.println("present");
        else System.out.println("Not present");

        System.out.println(map.get("Nepal"));
        System.out.println(map.get("India"));

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.print(e.getKey() + ": ");
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for (String key: keys) System.out.println(key + ": " + map.get(key));
    }
}
