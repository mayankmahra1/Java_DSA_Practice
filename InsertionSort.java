public class InsertionSort {

    public static void main(String[] args) {
        
        // For insertion we start at index 1 
        // we store the value of index 1 in a temp variable 
        // We than compare all values to the left of index 1 
        // if the first value to the left of index 1 is greater than temp we move it one step forward a
        // if not we stop
        // we than start at index 2 and do same
        // store the value at index 2 in temp
        // if the first value to the left of index 2 is greater than temp than we move it up one 
        // if it were not greater than we would stop
        // than we do the second value to the left of index 2. if thats greater than temp we move it up one if not we stop
        // this process repeats till our array is sorted
        

        // Insertion sort has a run time complexity of O(n^2) quadratic time 
        // It's okay ish with small datasets but bad with large datasets 
        
        // its similar to bubble and selection sort. but: 

        // it uses less steps than bubblesort 
        // And in best case scenario insertion sort can run in O(n) linear time compared to selection sort where the 
        //  best case scenario  is O(n^2) Quadreatic time 



        int[] array = {5, 3, 6, 2, 7, 1 ,8 ,9};

        for(int i : insertionSort(array)){
            System.out.print(i + " ");
        }
    }

    static int[] insertionSort(int[] array){

        for(int i = 1; i < array.length; i++){

            int temp = array[i]; 
            int j = i-1; 

            while(j >= 0 && array[j] > temp){
                array[j+1] = array[j]; 
                j--; 
            }
            array[j+1] = temp; 
        }
    
        return array; 
    }
}