package binarysearch;

import java.util.Arrays;

public class BinarySearchDriver {
    public static void driver(){
//        int [] arr = {15,25,85,45,12,36,74,82,69};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        Floor f = new Floor();
//        int floor = f.itterativeFloor(arr, 40);
//        System.out.println(floor);
//        int [] infiniteArray = {3,5,7,9,10,90,100,130,140,160,170}; // It doesn't work with all the length of arrays...
//        InfiniteArray iA = new InfiniteArray();
//        int index = iA.infiniteBinarySearch(infiniteArray,170);
//        int [] pass = {3,4,5,1};
//        PeakOfMountain pom = new PeakOfMountain();
//        int peak = pom.peakIndexInMountainArray(pass);
//        System.out.println(peak);
        int [] rotatedArray = {1,3,5};
        MinimumInRotatedArray mira1 = new MinimumInRotatedArray();
        int min = mira1.mira(rotatedArray);
        System.out.println(min);

    }
}
