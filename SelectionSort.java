public class SelectionSort {

    public static void main(String[] args) {
        // Selection sort is a sorting algorithim that keeps track of the minimum value during each iteration 
        // At the end of each itreation all we do is swap variables 
        
        // we loop through an array find the minium and store its index in a variable called minimum 
        // then when that iteration is finished we put the minium at the first index and put what is in the first index 
        // and then we put what was at the first index where the actual minimum was
        // we then ignore the first index and repreat the process 

        // empty boxes in an attic with a flashlight. You can only look at one box at a time and recall the minimum 

        // the selection sort algorthim as a runtime complexity of O(n^2) quadratic time 
        // The larger the dataset the more inefficient using the selection sort algorithim is gonna be. 
        // but its okay for small datasets 
        // same as bubble sort 

        int[] array = {9, 1, 8, 3, 4, 5, 2 ,0};
        
        for(int i : selectionSort(array)){
            System.out.print(i + " ");
        }

    }

    static int[] selectionSort(int[] array){

        int temp = 0; 
        int min = 0; 

        for(int i = 0; i < array.length-1; i++){
            min = i; 
            for(int j = i+1; j < array.length; j++){
                if (array[i] > array[j]) {
                    min = j; 
                }
            }

            temp = array[i]; 
            array[i] = array[min];
            array[min] = temp; 

        }


        return array;
    }
}