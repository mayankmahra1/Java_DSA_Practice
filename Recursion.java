public class Recursion {

    public static void main(String[] args) {
        // A recursive method call itself 
        // It can be a substitute for iteration 
        // Recursion is used in advanced sorting algorithims and navigating trees 

        // Advs:
        // Easier to read and write
        // Easier to debug 

        // DisAdvs: 
        // Sometimes slower
        // Uses more memory 

        // lets compare an iterative and recursive walk method 

        // Programmes have a data structure called a callStack 
        // A call stack keeps track of the order in which our program needs to function 
        // We call the main method first and thats added to our call stack 
        // so in order to complete our programme we have to complete our main method ie our main method has to run till 
        // completion 
        // with a recursive approach we are adding multiple frames to our call stack so it looks like this 
        // recursiveWalk(0)
        // recursiveWalk(1)
        // recursiveWalk(2)
        // recursiveWalk(3)
        // recursiveWalk(4)
        // recursiveWalk(5)
        // main()

        // so we must wait until the programmes complete in this order 

        // Thats why using recursion is sometimes slower and uses more memory
        // becuase we are adding more frames to the call stack and theres more methods we have to keep track off. 

        // if we try do 1 mill recursive steps we get a stack overflow error
        // When working with recursion its possible to run out of memeory like this 

        walk(5); 
        System.out.println();


        recursiveWalk(5);
        System.out.println();

        System.out.println(factorial(7));
    }

    static int factorial(int num) {

        if (num < 1) { // base case
            return 1; 
        }

        return num * factorial(num -1); // recursive case

    }

    // Heres an iterative walk method 
    static void walk(int steps) {

        for(int j = 0; j < steps; j++){
            System.out.println("You take a step");
        }
    }

    // heres a recursive walk method 
    // for a recurisve method you need a base case and a recusrive case
    // a base case is what we do when we would like to stop. 
    // and recursive case is what do we do if we would like to continue 
    static void recursiveWalk(int steps){

        // base case
        if (steps == 0){
            return; // return breaks out of recursion 
        }

        System.out.println("You take a step");

        // recurisve
        recursiveWalk(steps - 1); 

    }
}