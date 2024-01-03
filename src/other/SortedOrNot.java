package other;

public class SortedOrNot {
    static boolean son(int [] arr, int start){
        if(start==arr.length-1)
            return true;
        else if (arr[start]<arr[start+1]&&son(arr,start+1)) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        int [] arr= {0,1,2,3,4,5,75,7,8,9};
        System.out.println("Result: "+son(arr,0));
    }
}
