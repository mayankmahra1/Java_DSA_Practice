import java.util.Stack;

public  class Stacks {

    public static void main(String[] args) {
        // a stack is a last in first out data structure 
        // Stores objects into sort of a vertical tower 
        // push() to add to the top 
        // pop() to remove from the top 

        // after declaring our stack we can add objects to our stack such as videogames 
        // to add objects to our stack we use the push method. stack.push(minecraft)
        // to remove objects from our stack we use the pop method. stack.pop()

        // now lets create a stack in java 
        // now to first push objects onto our stack we have to declare our stack and instantiate it 

        // list the data type of objects we will be adding to our stack
        // luckily strings are a type of object and theyre fairly simple 
        // dont need to list the data type in the second diamond brackets 
        // import the stack class
        // () is the constructor 
        Stack<String> stack = new Stack<>();  

        // stacks have 5 unique methods in java 
        
        // we can push an item onto our stack
        // we can pop an item of the top of our stack 
        // we can peek at the item on the top of our stack 
        // we can check to see if our stack is empty 
        // and we can search our stack for an item 


        // lets first see if our stack is empty 
        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());
        System.out.println();

        // lets push some games onto our stack 
        stack.push("GTA V"); 
        stack.push("FIFA 20"); 
        stack.push("NBA 2k");
        stack.push("Fall guys"); 
        stack.push("Rocket league");


        // lets see if empty or nah
        // no its not 
        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());
        System.out.println();

        // prints items in stack surronded by round braces and commas 
        System.out.println(stack);
        System.out.println();

        // now lets pop the top most item from our stack 
        // and we dont need to list an object because pop will always remove the top most item from our stack 
        stack.pop(); 
        System.out.println(stack);
        System.out.println();

        // and again
        stack.pop(); 
        System.out.println(stack);
        System.out.println();

        // returns item on top of stack without removing it 
        System.out.println(stack.peek());
        System.out.println();

        String gameIAlwaysBeatManishOn = stack.pop();
        System.out.println(gameIAlwaysBeatManishOn);

        System.out.println(stack);
        System.out.println();

        // lets make our stack full again 
        stack.push("NBA 2k");
        stack.push("Fall guys"); 
        stack.push("Rocket league");
        System.out.println(stack);
        System.out.println();


        // now lets search for an object within our stack 
        // we get a index of 5. which means its 5th in the stack
        // the first item is first and GTA V is fifth 
        // it returns an index 
        // youd think first object in stack is zero but its 1 
        System.out.println(stack.search("GTA V"));
        System.out.println();


        // if you search for an item not in the stack it returns -1 
        System.out.println(stack.search("ARK"));


        // with stacks we can actually run out of memory 
        // lets say we push a mill copies of gta 6 on our stack using a for loop
        // well it did work but when i went to print it i guess my laptop crashed 
        // may or may not work idk
      /*  for(int i = 0; i < 1000000; i++){
            stack.push("GTA VI"); 
        }
        System.out.println(stack);
     */ 

        // uses of stacks 
        // 1. its good for undo redo features in text editors like word. 
        // 2. its good for moving back or forward through browser history like chrome 
        // 3. we can implement them in back tracking algorithims. Like if we need to navigate a maze or search through 
        // file directories
        // 4. Another is we use them when callling functions. Whenever we call a function we add what is known as a frame 
        // to the call stack.   








    }
}