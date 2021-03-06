import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Character;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        //The public java keyword is a access modifier: access modifier allows us to define
        // the scope or how other parts of peoples code can access your code

        //class:
        //method: A collection of statements (one or more) that perform an operation
        //static: a java keyword that needs an understanding of other concepts.
         //void a java keyword used to indicate that the method will not return anything
        System.out.println("Hello loop"); //this is considered a statement
        //statement: A complete command to be executed and can include one or more expressions
        //declaration statement: defines a variable by indicating the data type, and the name,
        // and optionally to set the variable to a certain calue
        int iop = 5;//data type int
        //expression: A construct that evaluates to a single value.
        int op = 5; //When java reads  this statement it alocates a place in memory to store
        // a single whole number and will assign the variables name to that area of memory.
        // allowing us to call the stored value (from a area in memory) by the assigned variable name
        System.out.println(op);
        System.out.println(""); // when things are placed between "" it is called a string literal
        //String Literal: Any sequence of characters surrounded by double quotes is a string literal
        // in java. It's value cannot be changed, it's a expression not a variable.
        //Primative type: the most basic data types. The int is one of eight primitive types.
        //The eight primitive data types are boolean, byte, char, short, int, long, float, and double.
        int intmin = Integer.MIN_VALUE; // int primitive type that only defines a variable.
        int intmax =  Integer.MAX_VALUE; // "Integer" is defined as a Wrapper class.
        // Java uses the concept of a wrapper class for all eight primitive types. In the case of an
        // int we can use Integer, by doing so it gives us ways to perform operations on a ine.
        System.out.println("Integer Minimum Value = " + intmin);
        System.out.println("Integer Maximum Value = " + intmax);
        System.out.println("Busted Integer Maximum Value = " + (intmin - 1));
        System.out.println("Busted Integer Maximum Value = " + (intmax + 1));
        //If you put a value larger than the maximum/minimum value of a data type in java you will get
        // an overflow. In the case of the maximum value or an underflow in the case of the minimum.
        // The computer will skip back to the minimum or maximum number.

        int no = 2_147_483_647; // this ok too for java 7 and up
        byte vaild = 23;
        short val = 12322;
        int lop = 521222211;
        long moo = lop + val + vaild + 50000;
        System.out.println(moo);
        String po = "12";
        int l = 35;
        System.out.println(po + l + "dse");
        // Strings in java are immutable, you can't change a string after it's created. Instead, what
        // happens is a new string is created. Strings aren't primitive types they are classes
        float la = (float) 5.230;
        float laa = 5.230f; //faster to place f at the end
        double as = 12.3; //Java defaults to double. for floating point numbers
        double type = 1;
        double typ  =type * .45359237;
        System.out.println(typ);
        //in general float and double are great for floating point operations. But both are not great
        // to use where precise calculations are required. This is due to a limitation with how
        // floating point numbers are stored.
        //Java has a class called bigDecimal that overcomes said limitation. But for big calculations
        // float and double are just fine.

        //char is much more useful than it seems uses 16bits of data allowing the store of unicode
        // characters. Unicode: is a international encoding standard for use with different languages
        // and scripts. By which each letter, digit, or symbol is assigned a unique numeric value
        // that applies across different platforms and programs.
        //Unicode allows us to represent these languages by using a combination of the two bytes
        // that a char takes up in memory it can represent and one of 65535 diffent characters.
       // char myunicode = '\u00A9'; //specify unicode convention characters by using \ u in java
       // System.out.println(myunicode); no why no work
         
         //it is best practice to name booleans with is then question.
        boolean ishegay = false;

        //Appending values using String. is inefficient and not recommended. Instead using s StringBuffer
        // is recommended.

        //Expressions are formed by combining variable, literals method return values, and operators.
        // in the line below 15 + 12 is the expression which has (or returns) 27 in this case.
        int myVal = 15 + 12;

        //if-then statement is the most basic of all the control flow statements. It tells your program to execute a
        // certain section of code only if a particular test evaluates to true. AKA Conditional logic
        //Conditional logic uses specific statements in java to allow us to check a condition and execute certain code
        // based on whether that condition is true or false.
        boolean is = false;
        if (is == false) //not using a code block on an if statement only allows 1 line of code to be read at a time.
            System.out.println("koop is!!!!");
        //Code block: Allows more than one statement to be executed - a block of code.
        // Proper format of a if statement -->
        if (is == false){
            System.out.println(is);
        }
        // && logical and operator
        // & bitwise and operator working on the bit level
        // || logical or operator
        // | bitwise or operator working on the bit level

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is an error");
        }
        boolean wda = false;
        if (wda = true)
            System.out.println("neat");
        // ! NOT operator AKA logical complement operator

        //Ternary operator (?:): A shortcut to assigning one of two values to a variable depending
        // on a given condition. It's a shortcut of the if-then-else statement.
        int age = 20;
        boolean isEighteenOrOver = age == 20? true:false;
        // operand one -  age == 20 in this case is the condition we are checking.
        // It needs to return true or false
        // Operand two - true here is the value to assign to the variable isEighteenOrOver if the
        // condition in operand one is true.
        // Operand three - false here is the value to assign to the variable isEighteenOrOver if the
        // condition in operand one was false

        //Operator Challenge:
        double doub = 20.00;
        double dum = 80.00;
        double result = (doub + dum) * 100.00;
        double remain = result % 40.00;
        boolean istu = remain == 0? true:false;
        System.out.println(istu);
        if (!istu){
            System.out.println("Got some remainder");
        }
        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;
        int highScore;
        highScore = calculateScore(true, 800, levelComplete, bonus); //call method  with no arguments
        //passing information to a method = creating parameters
        // arguments are the actual values to be placed withing the methods parameters

        System.out.println("your high score is " + highScore);

         highScore = calculateScore(true,10000,8,200);
        System.out.println("your high score is " + highScore);

        //method challendge check main...

        //DiffMerge Tool: compare a single file or even the whole folder to visually see
        // the differences side by side (external application)

        System.out.println(toMilesPerHour(25.42));
        printConversion(10.25);

        //Method Overloading: The option where the same methods name is used but with differnt parameters
        int newScore = calculateScore("joop",45); //runs calculateScore for some reason
        System.out.println("new score is "+newScore);
        calculateScore(45);
        calculateScore();
        calcFeetAndInchesToCentimeters(100);
        // Method overloading improves code readability and re-usability.
        // It's easier to remember one method name instead of multiple methods names
        // archives consistency in naming. One name for methods that are commonly used
        // overloaded methods give programmers the flexibility to call a similar method
        // with different types of data based on the arguments/parameters your define.

        //constants: variable that cannot be changed once assigned
        //------------

        //Control Flow Statements Switch statement, for statement, while statement, and do while statement
        // switch statement: can only test for 1 variable uses 6 datatypes byte,char,short,int,string, and enum
        int swhtd = 90;
        switch (swhtd){ //value to test for (vari able name or expression)
            case 1: // testing for if swhtd == 1
               System.out.println("hello 1");
               break; // closes the case 1 statment must always close with break
            case 3:
                System.out.println("case 3");
                break;
                case 4: case 5:case 90:
                System.out.println("This case test for multiple solutions all in one line. very limited");
                break;
            default: // If no case is true then...
                System.out.println("all else failed");
                break;
        }
        //for loop statement: loops until a condition is satisfied
        // for (init; termination; increment) init = initialization terminator = run until false/exit point
        // increment = expression involked every loop
        for (int s = 1; s < 0; s++){
            System.out.println(s);
        }
        //----------------------
        // while loop
        int whool = 0;
        while(whool != 900){
            whool ++;
            if (whool == 8){
                System.out.println("Get whooled " + whool);
                break;}
        }
        //do while loop
        do {
            System.out.println("Whoolie!");
            whool++;
            if (whool == 9){
                break;
            }
        }while(whool != 7);
        //---------------------------------------------------------------------------------------
        //Parsing values from String to int
        // one way of converting string to number is by use parsing method. Using said methods converts
        // data types into various primitive types depending on the parse method used
        String numas = "2018";
        System.out.println("num string " + numas);
        int numter = Integer.parseInt(numas);  // Class Integer is a wrapper class for the primitive type int
        // wrapper class Integer contains methods such as parseInt.
        // in oder to parse the appropriate data type must be stated in this case it's "Int"
        //parsing is useful when need to convert a string into a number for calculations
        numas += 15; // java automatically converts int data type to string and concatenates it
        System.out.println(numas);
        numter += 15;
        System.out.println(numter);
        double oop = Double.parseDouble(numas); // pasre for doubles
        System.out.println( oop);
        //----------------------------------------------
        //Reading user input
         /*
        Scanner scanner = new Scanner(System.in); // System.in allows text to be types into the console
        // which then gets returned back to the program
        // new is used to create an instance of scanner AKA creating a new object of type Scanner
        System.out.println("enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt(); // hasNextInt check to see if next input is a number
        // returns false if anything besides int is inputed
        if(hasNextInt) { // if true (only number were input) run the code
            int year = scanner.nextInt();
            scanner.nextLine();  // handle nextline character -> enter-key
            System.out.println("ener name:");
            String name = scanner.nextLine();
            int age1 = 2021 - year;
            if (age1 >= 0 && age1 <= 120) {
                System.out.println("your name is " + name + ", you are " + age1 + " years old");
            } else
                System.out.println("invalid year of birth");
        }else
            System.out.println("Input only numbers");
        scanner.close();*/
        //-------------------------------------------------------------------------------------------
        //OOP Java
        // real world objects have 2 characteristics states and behavior...
        // i.e state = ram, operating system, HDD, monitor.
        // behavior = booting, shutting down, beeping, sound, printing, drawing something on screen.
        // software object stores it's state in "fields" where fields = variables and
        // behavior = methods... state + behavior = object
        // Classes are blueprints for creating objects
        // Public Class main = a statement which creates a new class in java
        // a class could be thought of as a powerful user defined data type
        // AKA an extra data type
        // i.e classes enable you to have a powerful user defined data type where you can
        // create something more powerful than a regular primitive-type

        // variables inside a method is called local variables since they belong to that methode only
        // classes allows you to create variables that can be seen and are accessible from anywhere
        // within the created class. These are known as class or member variables but most commonly
        // referenced too as "fields"
        // when creating a field for a class you have to specify an access modifier that works the
        // same way as the access modifier for a class definition did/would
        // in general when defining fields in java use the access modifier private instead of public
        // the access modifier private uses encapsulation which is just hiding the fields and methods
        // from access publicly. AKA hidden from view outside of the objects definition (class)

        // since a class is a blueprint and using private variables and methods (usually)
        // to get to the fields of a class you must first initialize the class as an object
        // i.e Car car = new Car; key word "new" (This must be done in the main class)
        Car porsche = new Car(); // build an object (Car) and based it on porsche (also read..line275)
        // when a class is created and fields are added when called in main() java sees the class as
        // a data type and treats it as such
        // also read: defined an object of type Car called porsche
        // when creating a new class you have to initialize it using the key word "new" + type (Car())
        // created a new data type "porsche" of type "Car" i.e created a new object called porsche
        // based on the blueprint called Car

        // when calling the data type porsche instead of directly modifying the fields defined in the
        // class "Car" (via changing a private field to public) it's better to keeps it private and
        // pass the updated information through a public/protected method created in the class Car
        porsche.setModel("model name"); // instead of porsche.model = "model name";
        // also, when passing "model name" to the variable "model" you must use the keyword "this."fields name""
        // instead of the method to be called i.e "setModel"...
        // "this."fields name"" is a keyword in java for passing a methods parameters information to the
        // desired field

        // setters and getters: setters are methods that set a fields value i.e setModel (takes a parameter)
        // where as getters take no parameters but rather return a value

        // why use getters and setters: When setting a value to a field, you can check the input of the user
        // to validate if the input is proper and is correct.
        //--------------------------------
        //challenge

        System.out.println("model is "+porsche.getModel());
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 || inches <0 || inches > 12){

            System.out.println("invalid perameters");
            }

        double confeet =  30.48 * feet;
        double coninche = 2.54  * inches;
        double sum = coninche + confeet;
        System.out.println(feet+" feet, "+inches+" inches = "+sum+"cm");
        return sum;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            double feet1 = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet1, remainingInches);
        }
        return -1;
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" scored "+score+" points");  // always runs
        return score * 1000;  // only runs if the above ^^^ statements return false.
    }
    public static int calculateScore( int score){ //overloaded method by removing a parameter
        System.out.println("Unnamed Player "+" scored "+score+" points");  // always runs
        return score * 1000;  // only runs if the above ^^^ statements return false.
    }
    public static int calculateScore( ){ //overloaded method by removing all parameters
        System.out.println("Unnamed Player "+" scored "+" points");  // always runs
        return 0;  // only runs if the above ^^^ statements return false.
    }


    public static long toMilesPerHour(double kilometersPerHour){
        long roundedValue = -1;
        double milePerHour;
        if (kilometersPerHour > 0){
           milePerHour = kilometersPerHour * 0.6213711922;
           roundedValue = Math.round(milePerHour);
        }
        return roundedValue;
    }

    public static void printConversion(double kilometersPerHour){
        long milePerHour;
        milePerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(+kilometersPerHour + " Km/h = " + milePerHour+" Mi/h");
    }


    public static int calculateScore(boolean gameOver,int score,int levelComplete,int bonus){
    //If the method is to return something instead of defining void define the return type of the method
        if (gameOver) {
            int finalScore = score + (levelComplete * bonus);
            finalScore += 100;;
            return finalScore; // when returning a value of anykind. All variations of the return
            // must be accounted for. In this can the method needs to return something if true and if false.
        }
        else
            return -1; //return must return the same type in information. -1 is known as error in general
    }

}
