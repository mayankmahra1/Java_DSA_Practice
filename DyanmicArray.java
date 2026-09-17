import java.util.ArrayList;

public class DyanmicArray {

    public static void main(String[] args) {
        // A dyanmic array(ArrayList) is an array with a resizable capcity 
        // If we need extra room for elements we can increase the capacity which is something we cannot normally 
        // do with a standard typical fixed size array
        // Dynamic Array's are known as ArrayLists in java and other terminology in differnt languages 

        // A static array has a fixed capacity that we determine at compile time and we cannot normally change 
        // Within an static array each element is stored within an contiguous memory adress 

        // Acessing elements is easy because we have indexing numbers to work with 
        // We can randmoly access an element in O(1) constant time. The size of our dataset does not matter 
        
        // However searching for a stored value still takes O(n) Linear time because we need to begin at index
        // 0 and iterate over our array until we reach our value or the end of the array 

        // And in the case of inserting a deleting that takes O(n) Linear time, Because you have to shift elements 
        // to create a space or close a space. Unless you are inserting or deleting at the end of the array 
        // in that case no shifting of elements is required 

        // A major disadvantage of static arrays is that they have a fixed capacity. So we cannot increase
        // the capacity of the static array. 
        // The reason we cannot increase the capacity is because the next memory block contains some data 


        // A dyanmic array has its own inner static array with a fixed size.
        // Once the inner static array of our dynamic array reaches capacity, our dyanmic will declare and 
        // instantiate a new array with a increased capacity 
        // Usually the capacity of this new array is twice as big as the previous array 
        // The data from the original array is copied to the new array which has completley different 
        // contiguous memeory addresses. 

        // The advantages of dynamic arrays: 
        // There is Random access of elements O(1) constant time. We can randomly acess an element by the index number 
        // and retrieve the value 
        // There is good locality of refernce and data cache utilization. Essentially its good because elements are stored
        // contiguosly right next to each other. Unlike LL. 
        // Its easy to insert/delte at the end because no shifting of elements is required. 

        // Disadvanatages of dyanimc arrays: 
        // It wastes more memory than a LinkedList because we need to increase the capacity to accomdatae more elements 
        // if we need extra capacity. And we may not need all of the extra capacity just some of it
        // Shifting elements for insertion and delteion is more time consuming O(n) Linear. The close you insert
        // to index 0 the more you have to shift. 
        // Expanding/Shrinking the array is time consuming and takes O(n) Linear time because you have to copy all the elements
        // to a new array 

        // Lets create our own Dynamic array using java
        // we will use the ArrayList class 

        // Create an dynamic Array of which stores strings
        ArrayList<String> list = new ArrayList<>(); 

        // Before we begin working with an ArrayList lets dive into the class to understand it more. 

        // If you do not set a intital capacity for your ArrayList it will be set to 10
        // The ArrayList class contains an integer called size which tells us how many elements are filled
        // within our ArrayList
        // And our ArrayList has it's own inner static fixed size array, and if we ever need to expand the size of this 
        // array we just copy the elements over to a new inner array. 

        // There's plenty of more methods but here's the important ones 

        list.add("Mayank"); 
        list.add("Manish"); 
        list.add("Reshma"); 
        list.add("Vikas");
        list.add("Susi");
        list.add("Ankit"); 

        // removes an element with value
        list.remove("Ankit");

        // Prints out the list in this format [Mayank, Manish, ...]
        System.out.println(list);

        // Prints how many elements are in the list 
        System.out.println(list.size());

        // get the value of the list at index 0 
        System.out.println(list.get(0));

        // returns boolean if size == 0
        System.out.println(list.isEmpty());

        // Check if an element is an array. Returns a boolean 
        System.out.println(list.contains("Vikas"));

        // Returns the index of an element 
        System.out.println(list.indexOf("Reshma"));
        










    }
}