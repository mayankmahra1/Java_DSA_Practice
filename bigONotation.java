public class bigONotation {

    public static void main(String[] args) {
        
        // common phrase used with big O notation is how code slows as data grows

        // BIG O 
        // It describes the performance of an algorithim as the amount of data increases 
        // this notation is machine independet, what we are really focusing on is the # of steps to complete an algorithim 
        // we tend to ignore smaller operations Olog(n+1) -> Olog(n). if we had a task that took n+1 we would reduce it just n 
        // because that +1 doesn't make much of a differnce 

        // heres a few examples of big o notation 
        // O(1)
        // O(n)
        // O(log n)
        // O(n^2)

        // and n is just the amount of data we are passing in its a variable like x 


        int n = 5; 

        System.out.println(addUp(n));
        System.out.println(addUpBetter(n));



    }


    // heres a function name add up we will add up to a certain number depending on what we will pass in as an argument 
    // the for loop will iterate once up to whatever that number n is 
    // if n was a large number like 1000000 well its going to take just above a million steps to complete this function 
    // this function is said to have a run time complexity of O(n)(linear time) as the amount of data increases its going to increase
    // the amount of steps linearly or proportionally 
    static int addUp(int n){

        int sum = 0; 
        for(int i = 0; i <= n; i++){
            sum += i;
        }

        return sum; 
    }

    // now another way in which we could right the same function better
    // so in the case of this function if n was a 1000000 its still only going to take a couple of steps 3 steps 
    // not a million steps 
    // so this function is going to have a run time complexity of O(1)(constant time)
    // the input size does not matter. the amount of data we have really doesn't matter 
    // its going to be always completed in the same amount of steps 3 steps
    // and the reason this isnt O(3) becasue this takes 3 steps is we really dont care about smaller operations in the grand scheme
    // of things they really wont make much of a difference. 
    static int addUpBetter(int n){

        int sum = n * (n + 1) / 2;
        return sum; 


    }


    // O(1) Constant time 
    // any thing that has a run time complexity of O(1) will take the same amount of time regardless of the data size
    // examples include random access of an element in an array 
    // inserting at the beginning of a linked list 
    // so O(1) is extremley fast 

    // O(log n) Logarithimic time 
    // one example is binary search 
    // anything that has a runtime complexity of O(log n) will take increasingly less time to complete 
    // as the data size increases this algortihim will be more and more efficent compared to the early stages with a small dataset


    // O(n) Linear time 
    // as the amount of data increases the item it takes to increase something will increase proportionally 
    // that would include looping through the elements of an array 
    // and searching through a linked list 

    // O(n log n) quasilinear search 
    // this would include quicksort, mergesort and heapsort 
    // so for the most part this is very similar to linear time unless we are working with a large dataset 
    // than its going to start to slow down with larger datasets 

    // O(n^2) quadratic time 
    // examples include insertion sort, selection sort, bubble sort 
    // as the amount of data increases its going to take increasingly more and more time to complete anything  that has a 
    // runtime complexity of O(n^2) 
    // to compare linear time and quadratic time with linear time if our dataset was a 1000 its going to take a 1000 steps
    // they are proportional theyre linear. but if we were using quadratic time if n(our dataset) was 1000 then 1000^2 
    // so if our dataset was a 1000 and we were using quadtratic time its going to take a million steps then 
    // a lot more than linear time 
    // so quadratic time is extremly slow with large datasets but in the case of small dataset it could actually be faster
    // as u can see from the grapj 

    // O(n!) factorial time 
    // used in the travelling salesman problem 
    // its extremly slow 
    // 
    
    



    
}