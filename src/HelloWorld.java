import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Character;
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
       // char myunicode = '\u00A9'; //specify unicode convention characters by using \u in java
       // System.out.println(myunicode); no why no work
         
         //it is best practice to name booleans with is then question.
        boolean ishegay = false;

        //Appending values using String. is inefficient and not recommended. Instead using s StringBuffer
        // is recommended.


    }
}
