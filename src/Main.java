// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    // Green -> arrows on left for start of code to run
    // Class just like in C#
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //Commenting out code is the same as C#
        // Methods in Java are lowercase instead of uppercase in C#
        printExample1(); //Runs the method1 I created below the Main class
        printExample2(); //Runs the method2 that introduces number variables
        //printExample3();
        IfStatementFunction();


        // Memory has 2 types: a stack or a heap.

        // Arrays



        // Use a for-loop if you have a finite amount of data
        // Use a while-loop if you want the data to run infinitely when the criteria is true








    } // main



    // Classwork practice Java Functions from teacher: https://github.com/WCramRTC/Prog_225_S23_L10_Intro_To_Java_Part2/blob/main/src/com/wcram/Main.java

    public static void printExample1() {
        System.out.println("Hello World! (testing println)"); //println goes to the next line
        System.out.printf("testing printf (DOESN'T GO TO NEXT LINE!) ");
        System.out.println("");
        System.out.print("testing the minimal wording 'print' ");
    }

    public static void printExample2(){

        String name = "Bander";
        System.out.println(name); // Shortcut for println is -->

        System.out.println();
        // whole numbers
        // byte, short, int, long ( hold different ranges of values
        // java does not have unsigned variables )
        int grade = 100;
        System.out.println(name + " - Grade: " + grade);

        // decimal numbers
        // float, double
        double percentage = 5.9;
        System.out.println(percentage);


    }



    public static void IfStatementFunction(){

        // Menu
        // 1 - Print Numbers
        // 2 - Do Math
        // 3 - Exit
        // println goes to next line
        System.out.println("Welcome to our menu");
        System.out.println("1 - Print Numbers");
        System.out.println("2 - Do Math");
        System.out.println("3 - Exit");
        // print() stays on the same line
        System.out.print("__________________");


        var test = "Hello World! We are testing the Switch/Case/Break/Default Statement";


        // switch, case, break , default
        switch(test) {
            case "1":
                System.out.println("You want to print numbers");
                break;
            case "2":
                System.out.println("You want to do some math");
                break;
            case "3":
                System.out.println("You want to exit the app");
                break;
        } // End of switch

    }


    public static void LoopsFunctions(){
        // Loops

        // for
        // foreach
        // while
        // do / while

        // while (condition) { while the condition is true , this code runs }

        int start = 0;
        int end = 10;
        while(start < end) {
            System.out.println("Print this");
        }



    }






//    public static void printExample3(){
//        System.out.println("Testing method #3");
//
//        // Creating a scanner object to ask the user for their information
//        Scanner scanner = new Scanner(System.in); // <-- FIX CODE STARTING HERE
//
//        System.out.println("What is your name? ");
//        String name = scanner.nextLine(); // Returns the users typed response as a string
//
//        System.out.println("Your name is " + name);
//
//        System.out.println("How long have you taught: ");
//
//        String userNumber = scanner.nextLine();
//        // In C# you would parse with int.Parse();
//        // In Java you parse with Integer.parseInt();
//        // Java does not have a built in try parse
//
//          // Used a Try Catch so that our project doesn't crash
//        try {
//            int userYearsTaught = Integer.parseInt(userNumber);
//
//        } catch (Exception ex) {
//            System.out.println("Caught an error");
//        }
//
//    }


}