import java.util.Arrays; 

public class binarySearch {

    public static void main(String[] args) {
        
        // Binary search is an search algortihim that finds the position of a target value within a sorted array 
        // half of the array is elimnated during the first step

        // binary search isnt to efficent when working with small datasets 
        // however if you are working wiht a large dataset like 1m elements than a binary search is fantastic because 
        // we are elimanting half of the elements during each phase
        
        // run time complexity is O(log n)
        // the larger the dataset a binary search becomes more and more efficent compared to other algorithims 

        // A huge disadvantage of binary search is that you have to sort the array first

        // The Arrays class has a built in Binaray search function. 

        int[] array = new int[100];  

        for(int i = 0; i < array.length; i++){
            array[i] = i; 
         }

        // returns index 
        System.out.println(Arrays.binarySearch(array, 50));
        // returns -101 if not found 
        System.out.println(Arrays.binarySearch(array, 400));
        System.out.println();

        System.out.println(ownBinarySearch(array, 50));
        System.out.println(ownBinarySearch(array, 400));

    }

    // Im going to code my own Binary Seacrh from scratch
    static int ownBinarySearch(int[] array, int target){

        int start = 0;
        int end = array.length-1; 
        Arrays.sort(array);

        while (start <= end) {

            int middle = start + (end-start) / 2;

            if(array[middle] == target){
                return middle; 
                
            }
            else if(target > array[middle]){
                start = middle +1 ; 
            }
            else if(target < array[middle]){
               end = middle - 1;
            }

        }

        return -1;
    }
}