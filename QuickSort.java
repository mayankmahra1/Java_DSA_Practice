public class QuickSort {

    public static void main(String[] args) {

        // quick sort moves smaller elements to the left of a pivot.
        // It recursively divides array in 2 partitions 

        // run time complexity: 
        // Best case: O(n log n) quasilinear time
        // Average case: O(n log n) quasilinear rime
        // worst case: O(n^2) quadratic time only occurs if array is already sorted or close to being sorted

        // space complexity: 
        // O(log n) logarithmic space this is due to recursion 
        // it uses more space than bubblesort, selectionsort, insertionsort - O(1) constant time even though it sorts in
        // place
        // the reason is the quicksort algorithim uses recursion, we are adding frames to the call stack which 
        // takes memeory 
        
        // We pass our unsorted array or other collection into a quicksort function 
        // Then we need to choose a pivot. There is different variations of quicksort 
        // some choose pivot at beginning some at the middle or some at the end 

        // But with most standard quicksort algorithims we set our pivot to be at the end of the array 
        // We need to find the final resting place of this pivot 
        // where should it be located in the final sorted array 

        // to find the final resting place we implement the following steps 
        // declare two indices j and i
        // j will begin at the start of our array and i will begin at one position behind the start of our array 
        // we will also need the help of a temporary variable so we can swap values 

        // all we are doing is checking if our value at j is less than our pivot 
        // if its greater or equal to our pivot we ignore it 
        //     8 2 4 7 3 1 9 6 5    
        //   i j               P
        // 8 is greater than 5 so we ignore this value and incremenet j 
        // during that iteration i did not come into play 


        //     8 2 4 7 3 1 9 6 5    
        //   i   j             P
        // again we check to see if our value of j is less than our pivot 
        // it is here so what we do is increment i. And then swap i and j 
        // with the help of the temp variable 
        // take the value at i assign it to temp. Take the value at j assing it to i.
        // take the value at temp assign to j.

        // then increment j and move onto the next iteration 
        
        // we repeat this process until j reaches our pivot 
        // once our index j reaches our pivot we know where our final resting place of the value within our pivot should be
        // and that is where i currently is + 1
        
        // our pivot is know in the right place. The way to tell is all elements to the left should be less than our pivot 
        // and all elements to the right of our pivot should be greater than or equal to the pivot 

        // we are than going to create 2 partitions two sections 
        // The first partition will be all elements from the beginning of our array to the left of our pivot 
        // The second partition will be all the elemnts from right of our pivot to the end of the array 

        // quicksort is a recursive algortihim. We need to pass these partitions as arguments into the quick sort function 
        // The quicksort algorithim is a recursive divide and conquer algrithim, but unlike with merge sort where we create
        // new subarrays with quicksort we will be sorting these arrays in place. 
        // but we need to keep track of the beginning and ending indices of these partitions 
        // then its repeating that i and j approach but now with these partitions of our array 






    }
}