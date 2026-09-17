public class MergeSort {

    public static void main(String[] args) {
        // MegreSort is a divide and conquer algorithim 
        // We'll divide our array in 2 a leftArray and rightArray 
        // These will be subarrays and we'll copy our elements over from the original to the subarrays 
        
        // MergeSort is a recusrive function so at the end of MegreSort will call Megre sort again 
        // and pass in the subarrays we created 

        // we will do this until our arrays only have a size of 1 

        // we will than create a helper function of merge which will accept three arguments 
        // our left subarray, right subarray and the original subarray in which these elements came from 

        // Merge is going to take these arrays and merge them back into the original array they came from 
        // but in order of smallest ot largest
        // and repreat this process until we get our original array but now sorted 

        // we tackle one branch at a time 

        // MergeSort has a run time complexity of O(n log n) quasilinear time 
        // Along with quicksort and heapsort 

        // So when working with large datasets mergesort is faster than sorting algorithims with 
        // runtime complexity of O(n^2) quadratic time such as insertion/selection/bubble sort

        // But the mergesort algorithim uses more space because we need to create more subarrays 
        // it has space complexity of O(n) linear space 

        // compared to insertion/selection/bubble sort which has space complexity of O(1) constant space 
        // because they sort in place and so they u a constant amount of space to do their sorting 

        int[] array = {8,2,5,3,4,7,6,1};

        mergeSort(array);
        


        
    }

    static void mergeSort(int[] array) {

        int length = array.length;

        if (length <= 1) {
            return;
        }

        int middle = length/2; 

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        
        for(int i = 0; i < leftArray.length; i++){
            leftArray[i] = array[i];
        }

        int temp = middle;

        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = array[temp];
            temp++; 
        }

        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i : leftArray){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i : rightArray){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        mergeSort(leftArray);
        mergeSort(rightArray);
        
        
        
    }

    static void merge(int[] leftArray, int[] rightArray, int[] array){



    }


}