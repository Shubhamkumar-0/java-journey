// What is Scanner?
// Scanner is a predefined Java class used to take input from the keyboard.
// import java.util.Scanner;--->This tells Java that we want to use the Scanner class.

import java.lang.reflect.Method;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        // Scanner is a class in java.util package that allows us to read input from various sources, including the keyboard, files, and streams.
        // It provides methods to read different types of data, such as integers, strings, and floating-point numbers.

        // To use the Scanner class, we need to create an instance of it. This is done using the new keyword followed by the Scanner constructor.
        // The constructor takes an InputStream as an argument, which specifies where the input will come from. In this case, we use System.in to read input from the keyboard.

        // Example:
    Scanner sc = new Scanner(System.in);
    // Scanner--> is a class name
    // sc --> is an object of Scanner class(you can choose any valid name)
    // new Scanner(System.in)---> is used to create a new Scanner object that reads input from the standard input stream (keyboard).
    // sc.close();--->This closes the Scanner when you're finished using it.

    // Scanner Methods
    // Method-->	  Reads
    // next()-->	  One word
    // nextLine()	  Complete line
    // nextInt()->	  Integer
    // nextDouble()-> Decimal
    // nextFloat()	  Float
    // nextLong()	  Long
    // nextBoolean()	true or false
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.println("Age = " + age);

        System.out.print("Enter Name: ");
        String name = sc.next(); //mr bean
        System.out.println("Name = " + name); //mr
        
        System.out.print("Enter Name: ");
        String name1 = sc.nextLine(); //mr bean here
        System.out.println("Name = " + name1); // mr bean here
        sc.close();
    }

    
}
