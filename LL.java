import java.util.LinkedList;

public class LL {

    public static void main(String[] args) {
        
        // lets compare to Arrays and ArrayLists
        // with what we know these data structures store elements in contiguous memory locations 
        // in this demo we are storing letters of alphabet in an array or array list 
        // // a b c d e f g h 
        // each element in this array has a unique memory address 
        // Arrays are great at randomly accessing elements becasue they have an index.
        // But they are not so good at inserting or deleting elenments espcially when those elements are clsoer to the 
        // beginning 
        // supose i need to insert an element at index 3 thats where d cuurently is 
        // i would neet to shift every element to the right of d including d to the right. 
        // this process is cumbersum. and once index 3 is empty then i can insert a value 
        // its not bad for this dataset but imagine one with a thousand elements. I would need to shift my data
        // up to that many times depending on the location of the insertion. 
        // and the same concept applies with deletion we would shift our elements to the left to close the gap

    
        // where arrays have difficulty inserting and deleting. LinkedLists have the advantage. 
        // A linkedlist is made up of a long chain of nodes. Each node contains two parts: some data we need to store 
        // and an address to the next node in line. Also referred to as a pointer
        // think of a node as a individual piece of domino set. One said contains the data and the other side contains the pointer
        // LinkedLists do not have a index like an array what they have is a pointer which contains an address to the next index
        // These nodes are non-contiguous. They can be any where in your computers memory 
        // Each node knows where the next node resides 
        // A Linkedlist has a head and a tail. Head being where the linkedlist starts and tail being where it ends
        // Therefore the tail should always have a pointer which is set to null. 
        
        // Inserting a node is easy in a linkedlist and theres no shitfting of elements involved
        // Where we need to place a new node. 
        // c - 666 crime cr, D null  
        // so i want to insert a node in between c and d. 
        // So the pointer of c becomes the pointer of of our new node. Lets say it has Data called Mayank
        // now the new node has data mayank and points to 666 crime cr which is the actual address of node with data d
        // then we assign the pointer of c to be the actual address of the Mayank node 
        // no shifting of elements is required 
        
        // Deleting nodes are easy too wherever we need to delete a node we have the previous node point to the next node
        // after the one we want to delete
        // b = 404 nowhere lane, c - 666 crime cr, d - null
        // so if we want to remove the node with data c. we just set the node with data b to have the same pointer
        // as the node with data c which is the actual address for the node with data d. 
        // again no shifting of eleemnts is neccessary 

        // but here is were linkedlists are inferior to arrays. 
        // they are bad at searching. We can randomly access an element of an array because we have an index
        // With a linkedlist that is not the case. For a linkedlist we have to begin at the head and work our way through
        // to the tail until we find the element we are looking for. 
        // this itsefl takes time. infact it takes linear time o(n). 
        // But making an insertion or deletion of a node is constant. o(1). 
        // This variation of a linkedlist is a singly linked list. 
        // There a single links to each node. 


        // However there is another variation called a doubly linked list. 
        // A doubly linked list requires even more memory to store two addresses in each node not just one
        // one address for the next node and one for previous node
        // The benefit of our doubly linkedlist is we can traverse our doubly linkedlist from head to tail
        // or tail to head. Each node knows where the next and previous node is. 
        // But the downside is a doubly linkedlist uses even more memory then a singly linkedlist
        

        // lets now create a linked list 

        // what data type will we be storing in the linkedlist
        // if we hover over we can see it says this a doubly linked list 
        // Each node knows where the previous and next nodes are
        // now if we looked at the actual LinkedList class we can see our linkedlist stores the memory
        // location of our first and last nodes. These aka head and tail of our linkedlist. 
        // and there also a innner class named node. Each node knows the memory address of the next and previous nodes 
        // within this linkedlist. 
        // If we look at our linkedlist class definition it implements the Deque(deck) interface.
        // And a Deque is more less a double ended queue. So with the Deque interface we implement 12 additional 
        // methods. so we can add to the first(head) add to the last(tail). remove the head, remove the tail. 
        // peak at the head, peak at the tail. some will throw exceptions, some a special value, so use any comb of them 
        // Not only do we have these methods but we can also treat our ll as a stack or a queue, we can push,  
        // pop we can poll and we can off


        LinkedList<String> linkedList = new LinkedList<>(); 
        LinkedList<String> linkedList1 = new LinkedList<>(); 



        // lets first treat our linkedlist as a stack, and push some elements on it as if it were a stack. 
        // now within our ll which is behaving as a stack, we have f on top all the way down to a and we are missing e.
        // we can also pop
        linkedList.push("a");
        linkedList.push("b");
        linkedList.push("c");
        linkedList.push("d");
        linkedList.push("f"); 
        linkedList.push("g");
        linkedList.pop();

        System.out.println(linkedList);
        System.out.println();

        // now lets treat our linkedlist as a queue
        // as we can see we can use a linked lits to mimic a stack or queue
        linkedList1.offer("a");
        linkedList1.offer("b");
        linkedList1.offer("c");
        linkedList1.offer("d");
        linkedList1.offer("f"); 
    

        System.out.println(linkedList1);
        System.out.println();


        // now in our linkedlist that we are treating as queue we have a b c d f 
        // Were linkedlists are really good is insertion or deleting of nodes. 
        // Lets say for eg i need to add a node between d and f that contains the letter e
        // thats really easy to do with a linkedlist 
        // type the name of our linkedlist .add and the list an index and the data in this case e 
        linkedList1.add(4, "e");
        System.out.println(linkedList1); 
        System.out.println();

        // then to remove a node you woudl type linkedList.remove and then what u want to remove
        // as we said earlier. ll better at insertion and deletion of nodes. 
        // But theres one disadv. with ll we still need to traverse the entire ll to find where we need to go 
        // unlike arrays and arraylists. 
        linkedList1.remove("e");
        System.out.println(linkedList1); 
        System.out.println();

        // searching is straightforward too
        System.out.println(linkedList1.indexOf("f"));

        // heres a few methods 
        System.out.println(linkedList1.peekFirst());
        System.out.println(linkedList1.peekLast());
        System.out.println();


        // to add to the head
        linkedList1.addFirst(" ABOVE A");
        System.out.println(linkedList1);
        System.out.println();

        // to add to the tail 
        linkedList1.addLast("BELOW F");
        System.out.println(linkedList1);



        // in conclusion linkedlist is data structure which stores a series of nodes. 
        // Each node contains two or three parts. some data and one/two addresses 
        // Nodes are stored in non consecutive memory locations 
        // each node can have any memory address
        // elements are linked via pointers 
         
        // Advs 
        // 1. Dyanmic data structure. They can allocate memory while the programme is currently running 
        // 2. Insertion and deletion is easy. O(1) 
        // 3. No/Low memory waste 

        //DISADVS
        // 1. Greater memeory using because we have to store an additional pointer 
        // 2. no random access of eleemnts like arrays or arraylists 
        // 3. Acessing/searching elementing is more time consuming o(n).


        // uses
        // stacks or queues 
        // gps navigation.  Lets say u have a starting pos and final dest. Each step or stop along the way 
        // is kind of like a node. and if u need to add or remove a stop you can add or delte them like a node
        // music playlist. each song in a playlist might not be next to eachother within your computers memory
        // but playlists follow a certain order of songs. so that could be another use of ll 







    }
}