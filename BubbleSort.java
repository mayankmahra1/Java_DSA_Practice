public class BubbleSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
    
        // Bubble sort is a sorting algorthim that checks to see if adjacent elements are in order
        // if they are not in order these elements are switched 
        // We continue that process until all elements are in order 
        // We swap variables using a temp variable 
        // We lap once for each element in the array. So the length of the array is the number of laps

        // Heavy stuff sinks to the end of the array like rocks
        // light stuff rises to the top of the array like bubbles 

        // BubbleSort isn't that efficient even with smaller datasets 
        // In most cases you will use a different sorting algorithim

        // BubbleSort has a run time complexity of O(n^2) Quadratic time 
        // The larger the dataset the more and more efficient this algorithim is gonna be

        int[] array = {9, 1, 8, 2, 7, 3, 6, 5};

        int[] answer = bubbleSort(array);

        for(int key : answer){
            System.out.print(key + " ");
        }

    }
    
    // lets create our own bubbleSort algorithim 

    static int[] bubbleSort(int[] array){

        int temp = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++){
                if (array[j] > array[j+1]) {
                    temp = array[j+1];
                    array[j+1] = array[j]; 
                    array[j] = temp;
                }
            }
        }
        
        return array;

    }
}