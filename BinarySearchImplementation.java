/**
 *  binary search -> return index of target element in sorted array
 */

import  java.util.Arrays;

public class BinarySearchImplementation {

    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 49;

        for (int i = 0 ; i < array.length; i++) array[i] = i;
        int index = binarySearch(array, target);

        System.out.println(index);

    }

    private static int binarySearch(int[] array , int target ) {

        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int middle = low + (high -  low) / 2;
            int value = array[middle];
            if(value > target) high = middle -1; // shift
            else if (value < target)  low = middle +1; // shift
            else  return  middle;
        }

        return -1;
    }
}
