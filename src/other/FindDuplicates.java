package other;

import java.util.*;

public class FindDuplicates {
//    public static int [] fd(int [] arr){
//        for(int num: arr){
//
//        }
//
//        HashMap<Integer,Integer> ha = new HashMap<>();
//        for(int a: arr){
//            if(ha.containsKey(a))
//                ha.put(a,(ha.get(a)+1));
//            else ha.put(a,1);
//        }
//        for(int value: ha.values()){
////            if(value==2)
////                arr[0]=ha;
//        }
//        return arr;
//    }

    public static void main(String[] args) {
//        int [] arr = {4,3,2,7,8,2,3,1};
//        arr = fd(arr);
//        System.out.println(arr);
//        List<Integer> li = new ArrayList<>();
//        li.add(1);
//        li.add(2);
//        li.add(3);
//        li.add(4);
//        System.out.println(li);
//        li.remove(2);
//        System.out.println(li);
//        arr.
        Stack<Integer> st = new Stack<>();
        st.push(55);
        st.push(66);
        st.push(99);
        Object[] arr = st.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
