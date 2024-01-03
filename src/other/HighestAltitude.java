package other;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int i=0,j=gain[0];
        for(int k=1;k<gain.length;k++){
            j+=gain[k];
            if(i<j)
                i=j;
        }
        return i;
    }

    public static void main(String[] args) {
        int []gain= {-4,-3,-2,-1,4,3,2};
        System.out.println("Highest Gain: "+largestAltitude(gain));
    }
}
//  1 1 0
//  1 0 1
//  0 0 0
//
//