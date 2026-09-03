import java.util.LinkedList;
import java.util.Queue;

public  class Queues {

    public static void main(String[] args) {
        // Queue are a first in first out data structure(FIFO). EG a line of people 
        // Its a collection designed for holding elements prior to processing. 
        // Its a linear data structure

        // cashier at a supermarket. Whoever comes first you serve them first 
        // the head is the top of the queue and the tail is the bottom 
        // Karen, Chad, Steve, harold 
        // once karen leaves the queue chad becomes the head 
        // harold remains the tail unless someone else joins the queue 
        // if there is only one person in the queue they are both the head and the tail 

        // The concepts of both adding and removing objects from a queue is known is an enqueing(add) and dequeing(remove)
        // you remove people from the head of the queue. and add people to the tail of queue 
        
        // add = enqueue = offer()
        // remove = deque = poll()


        // lets create a queue  
        // list the data type of the objects we are going to add to this queue 
        // Strings again because theyre objects and simple 
        // now look i will try to create a queue object and instantiate it 
        // now we cannot instantiate the type Queue because if we got to the Queue interface we 
        // can see that it is an interface and we cannot create an instance of an interface 
        // an interface is supposed to be a template we can apply to another class 
        // so to utlisie queue technology we need a class that implements queue 
        // Queue<String> queue = new Queue<>(); 

        // there are only 2 classes whcih implement queues. LinkedLists and PriorityQueues 
        // But priortiyQueues rearrange elemenrs based on a certain level of priority so they wouldmt be a good eg 
        // so to utilise features of a queue we are going to create a linkedlist becasue we cannot instantiate a queue itself 
        // because its an interface 

        // now lets change our line of code 
        // we need to import both the queue interface and LinkedList class 
        // here we are only going to cover the features LinkedList will utlise from the queue interface 
        Queue<String> queue = new LinkedList<>(); 

        // now with the queue interface there are three methods we inherit from the collections parent class 
        // add, remove and element
        // this will do the same as poll() remove() and peek() however they throw exceptions and according to the documnetation 
        // its better to use the latter 3. they do not throw exceptions 

        // offer() will enqueue or add an element from the tail 
        // poll() will dequeue or remove an element from the head
        // and peek() will return the element at the head 
        // there are additional methods we will face later that we inherit from the collections class 


        // lets add elements to our queue 
        queue.offer("KSI");
        queue.offer("W2S");
        queue.offer("MM7"); 
        queue.offer("VK123"); 
        queue.offer("ZRK"); 
        queue.offer("TBJZL"); 
        queue.offer("BEHZ"); 

        System.out.println(queue);
        System.out.println();

        // poll() remove someone from the head or dequeue 
        // also returns it 
        System.out.println(queue.poll());
        System.out.println();

        // print queue
        System.out.println(queue);
        System.out.println();

        // returns element or object at head of queue 
        System.out.println(queue.peek());
        System.out.println();


        // the queue class inherits the collection class and subsquently all its methods 
        
        // first we can check to see if our queue is empty 
        System.out.println(queue.isEmpty());
        System.out.println();

        // we can also check the size of our queue same goes for stack 
        System.out.println(queue.size());
        System.out.println();

        // we can also use the contains method 
        // see if our queue has a certain obejce were lookign for and retursn a voolean 
        System.out.println(queue.contains("ZRK"));
        System.out.println();








        


    }
}