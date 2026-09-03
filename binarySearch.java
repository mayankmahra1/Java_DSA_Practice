import java.util.Arrays; 

public class binarySearch {

    public static void main(String[] args) {
        
        // Binary search is an search algortihim that finds the position of a target value within a sorted array 
        // half of the array is elimnated during the first step

        // binary search isnt to efficent when working with small datasets 
        // however if you working wiht a large dataset like 1m elements than a binary search is fantastic because 
        // we are elimanting half of the elements during each phase
        
        // run time complexity is O(log n)
        // the larger the dataset a binary search becomes more and more efficent compared to other algorithims 

        // builit in ArrayList binary search 

        int[] array = new int[100]; 
        int target = 42; 

        for(int i = 0; i < array.length; i++){
            array[i] = i; 
         }

        // returns -1 if not found
        int index = Arrays.binarySearch(array, target); 

        System.out.println(index);



        // our own binary search 
        

    }
}