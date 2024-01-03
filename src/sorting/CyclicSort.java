package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    static int count=0;
    public static List<Integer> cs(int [] nums){
        for (int i : nums) {
            int index = Math.abs(i);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;

//        int len = nums.length;
//        count++;
//        for (int i = 0; i < len; i++) {
//            count+=2;
//            while(nums[i]!=i+1){
//                count+=4;
//                int temp1=nums[i];
//                int temp = temp1;
//                nums[i] = nums[temp1-1];
//                nums[temp1-1]=temp;
//            }
//        }
//        count+=2;
//        OR
//        int i=0;
//        count++;
//        while(i<nums.length){
//            count+=2;
//            int correct = nums[i]-1;
//            if(nums[i]!=nums[correct]){
//                count+=4;
//                int temp= nums[i];
//                nums[i]=nums[correct];
//                nums[correct]=temp;
//            }
//            else {
//                i++;
//                count++;
//            }
//        }
//        count++;
//        System.out.println(count);
//        return nums;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[nums[i]-1]!=nums[i]){
                int temp1=nums[i];
                int temp=temp1;
                nums[i]=nums[temp1-1];
                nums[temp1-1]=temp1;
            }
        }
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums[i])
                li.add(i+1);
        }
        return li;
    }

    public static void main(String[] args) {
        int [] arr={4,3,2,7,8,2,3,1};
        List<Integer> li = new ArrayList<>();
//        li=cs(arr);
//        System.out.println(li);
        li=findDuplicates(arr);
        System.out.println(li);
//        System.out.println(Arrays.toString(arr));
    }
}
