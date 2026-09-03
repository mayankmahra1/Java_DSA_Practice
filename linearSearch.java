public class linearSearch {

    public static void main(String[] args) {

        // linear search =  iterate through a collection one element at a time 
        // Run time complexity O(n)

        // Disadvs: Slow  for large datasets 

        // Advs: 
        // fast for searches of small to medium datasets 
        // does not need to be sorted 
        // Useful for data structures that do not have random acesss (Linked lists )
        
        int[] array = {9,1,8,2,7,6,3,4,5};  
        
        // pass in the array and some value we would like to search for 
        int index = linearSearch(array, 5); 

        System.out.println(index);


    }

    static int linearSearch(int[] array, int target){

        for(int i = 0; i < array.length; i++){
            if (array[i] == target) {
                return i;
            }
        }

        return -1; 
    }
}