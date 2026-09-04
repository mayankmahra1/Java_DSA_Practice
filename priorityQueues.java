import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public  class priorityQueues {

    public static void main(String[] args) {
        
        // Priortiy Queue is a FIFO data structure. Only difference is it serves elements with higher priority first 
        // before we start polling and offering we put them in some sort of order

        // lets place student GPAS in a priorty queue 
        PriorityQueue<Double> queue = new PriorityQueue<>();  

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0); 
        queue.offer(1.5); 
        queue.offer(2.0); 

        // these are all in order now 
        // when working with numbers they are arranged in ascending order
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();

        // but why might we want to put these in order this way
        // lets say whoever pefroms worst gets 1 hour of free tutoring. 2nd worst is 2 hours of free tutoring and so on 
        // and if you need them in descending in order theres one change we must make 
        // within the constructor we can pass in a comparator. but thats a little advanced and we havent discussed that yet
        // so there is a defualt comparator we can use that is found within collections 
        // Collections.reverseOrder()
        // now it would be in descending order 
        // now hihgest gpa would receibe gold medal and etc 
        // PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());  

        // now lets change the datatype to strings and give them grades
        PriorityQueue<String> queue1 = new PriorityQueue<>();  

        queue1.offer("B"); 
        queue1.offer("C"); 
        queue1.offer("A"); 
        queue1.offer("F"); 
        queue1.offer("D"); 

        // here it prints in alphabeltic order if we need reverse alphabetic then 
        // PriorityQueue<String> queue1 = new PriorityQueue<>(Collections.reverseOrder());  
        while(!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }







    }
}