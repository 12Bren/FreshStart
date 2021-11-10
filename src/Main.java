import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        INub.sayHi();
        int kool = (int) 9.0;
        byte hop = (byte) 1254;
        int hope = hop;
        int joop = 5;
        double coop = joop;
        int co = (int) coop;
        //        int amount, digit1, digit2;
//
//        System.out.println("Please Enter any Number that you wish: ");
//        int user = sc.nextInt();
//        digit1 = user;
//        digit2 = user;
//        while (digit1 >= 10){
//            digit1 = digit1 / 10;
//        }
//        while(digit2 >= 100){
//            digit2 = digit2 / 10;
//        }
//        amount = digit1 + digit2;
//
//        System.out.println("The sum of the first two " +
//                "Digits of the given number " + user + "  =  " + amount);

//        System.out.println("Enter number");
//        int lop = sc.nextInt();
//        System.out.println("enter second number");
//        int lp = sc.nextInt();
//        System.out.println("Sum: "+ (lop + lp));
        /*
        Arithmetic operators
        add +
        subtract -
        multiply *
        divide /

        increment variables
        plus 1 ++
        plus 2(or more) += 2   c+=2 | c = c + 2
        divide (same^)  /= 2   c = c / 2
        multiply(same^) *=     c = c * 2

        casting
        int kool = (int) 9.0;
        narrowing type casting: switching between bigger and smaller data sets loses data
        byte hop = (byte) 1254;
        Widening type casting: Switching information from a smaller data type to a larger one (doesn't lose data)
        int hope = hop;
        wrapper classes
        double a = 7L; (7Long considered widening casting Long to double)
        implicit casting: casting small too big (since small to big transitions properly Java automatically casts)
        int joop = 5
        double coop = joop;
        explicit casting: casting from big to small (since big doesn't fit into small Must manually add cast)
        int co = (int) coop;

        byte(number, 1 byte from memory)
        short(number, 2 bytes from memory)
        int(number, 4 bytes from memory)
        long(number, 8 bytes from memory)
        float(number, 4 bytes from memory)
        double(number, 8 bytes from memory)

        Java Statements: if, else, else if
        */
//        System.out.println("enter number");
//        int you = sc.nextInt();
//        if (you < 50){
//            System.out.println("your number is smaller than 50");
//
//        }else{
//            System.out.println("your number is greater than 50");
//        }

//        # 🚨 Don't change the code below 👇
//        int two_digit_number = sc.nextInt();
//        //# 🚨 Don't change the code above 👆
////
//        //####################################
//        //#Write your code below this line 👇
//       int kpo = two_digit_number;
//       int plk = two_digit_number;
//        while(plk >= 10){
//            plk = plk/ 10;
//        }while (kpo >= 100){
//            kpo = kpo / 100;
//        }
//
//        int var = two_digit_number +  kpo;
//
//        System.out.println("the sum of your num is "+ var);

        displayHighScorePosition("poser12", 1500);
        displayHighScorePosition("poser12", 1000);
        displayHighScorePosition("poser12", 900);
        displayHighScorePosition("poser12", 400);
        displayHighScorePosition("poser12", 50);
        //The other way to do this is by making a variable for positionInHighScoreTable
        // int positionInHighScoreTable = calculateHighScorePosition(int 1500) then pass the arguments
        //displayHighScorePosition("poser12",positionInHighScoreTable);
    }

    public static void displayHighScorePosition(String playersName, int positionInHighScoreTable){
        System.out.println(playersName + " managed to get into position " +
                calculateHighScorePosition(positionInHighScoreTable)+" On the high score table!" );
    }

    public static int calculateHighScorePosition(int playerScore){
//        if (playerScore >= 1000){
//            return 1;
//        }else if (playerScore >=500 ){
//            return 2;
//        }else if (playerScore >=100 ){
//            return 3;
//        }
//        return 4;
        //Another way of doing this without multiple return statements is by switching return with a variable.
        // By assuming the variable will return 4. This makes it easier to read

        int Position = 4;
        if (playerScore >= 1000){
            Position = 1;
        }else if (playerScore >=500 ){
            Position = 2;
        }else if (playerScore >=100 ){
            Position = 3;
        }
        return Position;
    }

}
