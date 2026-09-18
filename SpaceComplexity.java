public class SpaceComplexity {

    // Cheat rule 
    // Subtracting? → O(n) contsant space
    // Dividing? → O(log n) logarithmic space
    // Space complexity describes how much additional memeory an algorithim needs as input grows.
    
    // The key difference between Time and Space complexity is: 
    // Time complexity: is how the number of operations grows
    // Space complexity: is how the amount of memeory grows 

    // Memory can come from: 
    // New arrays, lists, maps or sets
    // Variables 
    // Objects and nodes 
    // The recursion call stack 

    // O(1) constant space
    // Uses a fixed amount of extra memory 
    // An example is linear search 
    // The reason is it only needs an index or loop variable 
    // Cheat phrase: fixed variables O(1) constant time


    // O(log n) Logarihimic time 
    // An algorithim has O(log n) space complexity when its memory usage grows slowly becasue the problem 
    // is repeatdley divided usually in half.  
    // As input size increases memory(space) usage increases but very slowly 
    // Cheat phrase: dividing in each recursive call = O(log n) logarithmic time

    // Quicksort has an average space complexity of O(log n) because it repeatdley divides the array into smaller sections 
    // Each call is reducing the problem by half so the space is O(log n) logarihtimc space
    // if its unbalanced partitons it can be O(n) constant space    


    // O(n) linear space 
    // An algorithim has O(n) linear space when its memory usage grows the same rate as the input 
    // if the input doubles the required memory doubles 
    // same if triples, quadruples, increases by one, memory increases linearly with input 
    // Cheat phrase: one extra item or call for every input means O(n) linear space 

    // an example is copying an array 

    // O(n log n) quasilinear space 
    // Very uncommon 
    // This occurs when an algorithm stores approximately n pieces of information at each of log n levels.
    // cheat phrase: the full input stored at every divison level 

    
    // O(n^2) quadratic space 
    // The algorithm stores information for every pair of input elements or creates an \(n \times n\) table.

    // An example is graph adjacency matrix 
    
    // cheat phrase: A grid or every pair = O(n^2) 


    


}