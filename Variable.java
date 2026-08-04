// dataType variableName = value;

// %s → String
// %d → int
// %f → float/double
// %c → char
// %b → boolean
// %n → new line

public class Variable {
        public static void main(String[] args) {
        int age=22;
        double cgpa = 7.46;
        String name="Mr bean";

        System.out.println("age: "+age);
        System.out.println("name: "+name);

        // System.out.println("name: ",name);
        System.out.printf("Name: %s%n", name);


        // printf → print formatted output
        System.out.printf("Age: %d%n", age);
        System.out.printf("CGPA: %.2f%n", cgpa);
    }
}




// Today's Homework.................

// Create a file named Student.java.
// Store these variables:

// Your name
// Registration number (as long)
// Age
// CGPA
// Section (as char)
// Placed (boolean)
// Print all of them.

// output............................
// Enter your name: Shubham
// Enter your age: 22

// Hello Shubham
// Your age is 22



