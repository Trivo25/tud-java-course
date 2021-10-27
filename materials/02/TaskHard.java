public class TaskHard {
    public static void main(String[] args) {
        /*
        TASK: 
            Remember the size of different data types? e.g short and int?
            Write a program that prints the product (*) of two short only if the product does not exceed the limit of short (32,767) only using variables of type short!
        */

        
        short a = 3123; // any arbitrary number that can be stored inside a short
        short factor = 12; // factor
        short limit = 32767; // defining the limit of type short 

        // Question: Why is this solution not fool proof?
        if((limit / a) >= factor) {
            System.out.println("Can calculate the product!");
            System.out.println(a*b);
        } else {
            System.out.println("Ooopsie wooopsie.. this operation would exceed the limit of type short!");
        }

    }
}