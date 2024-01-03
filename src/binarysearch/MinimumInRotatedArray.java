package binarysearch;

public class MinimumInRotatedArray {
    public int mira(int [] nums){
        int start = 0;
        int end = nums.length-1;
        //Let array = 4, 5, 6, 7, 0, 1, 4 or 1,1,2,2,2,3,3,0,0
        while(start<end){
            if(nums[start] < nums[end])
                return nums[start];
            else {
                int mid = start + (end - start)/2;
                if(mid > 0 && nums[mid] < nums[mid-1]) return nums[mid];
                else if(nums[mid] > nums[end]) start = mid + 1;
                else {
                    start++;
                    end--;
                }
            }
        }
        return nums[start];
    }
}
