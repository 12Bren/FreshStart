import java.util.*;
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

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

        HelloWorld.printConversion(10.5); //called method from a class I made!
        //Seconds and Minutes Challendge
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945)); // passed test
        //---------------------------------------------------------------------
        //Switch statement Test
        char polp = 'E';
        switch (polp) {
            case 'A' -> System.out.println("A");
            case 'B' -> System.out.println("B");
            case 'C' -> System.out.println("C");
            case 'D' -> System.out.println("D");
            case 'E' -> System.out.println("E");
            default -> System.out.println("Not found");
        } //passed test
        //-----------------------------------------------------------------------
        //Day of the week challenge
        printDayOfWeek(-4);
        // pased test + bonus test
        //-----------------------------------------------------------------------
        // for test

        for(int l = 0; calculateInterest(10000, l) <= 0; l++){
            System.out.println(Math.round(calculateInterest(10000, l)));
        }//wrong way of doing it
        for(int l = 0;  l <= 0; l++){
            System.out.println("10,000 at "+l+"% interest = "+
                    String.format("%.1f",calculateInterest(10000, l))); //convert number and
            // output to 1 decimal point
        }//correct way of doing it
        // for test part 2
        for(int l = 0; l >= 0; l--){
            System.out.println("10,000 at "+l+"% interest = "+
                    String.format("%.1f",calculateInterest(10000, l))); //convert number and
            // output to 1 decimal point
        } // pass
        //-----------
        //for challenge
        int count = 0;
        for (int kol = 15; kol <= 25; kol++){
            boolean lop = isPrime(kol);
            if (lop) {
                count++;
                System.out.println("is prime "+ kol);
                if (count == 3){
                    System.out.println("Exting for loop");
                    break;
                }
            }
        }//failed test
        //-------------------
        //another for loop challenege
        int a = 0;
        int sum = 0;
        for (int i = 1; i<=1000;i++ ){
            if(i % 3 == 0 && i % 5 == 0){ //check if number is divisible by 3 and 5
                a++; //add to do a break
                sum+= i; // sum to print when exit for loop
                System.out.println("found number "+ i);
            }
            if (a == 0) {
                break;
            }
        }
        System.out.println("sum = "+sum); //failed
        //---------------------
        // loop test
        int nuh = 4;
        int finishNum = 20;
        int caught = 0;  // variables must be declared outside of the while loop
        while(nuh <= finishNum){
            nuh++;
            if(!isEvenNumber(nuh)){
                continue;  // continues to next itteration of the loop after this
                // executes without reading anything below it
            } // test part two
            caught ++;
            if (caught == 5)
                break;

        }System.out.println("Total Even numbers = " + caught); //pass*
        //--------------------
        // do while loop
        // do { statements} while (condition is/isn't true); simi-colon is required
        // do while loops will always run at least once since the code itself is above the
        // while (condition)
        do {
            System.out.println("potato");
            continue;
        }while(caught == 2);
        while(caught == 2){
            System.out.println("potato2");
            continue;
        }// challenge digit sum

        System.out.println("sum of digits is "+sumDigits(1202545));
        //-----------------------------------------------
        //next challenge Reading User input challenge
        Scanner scanner = new Scanner(System.in);
        /*
        int passingNum = 1;
        int numCount = 1;
        int test ;
        int sumAll = 0;
        while(passingNum <= 10) { // make true to account for invalid characters...
            // Alternatively, could keep passingNum as <= 10 and account for invalid characters
            // in the else statement... or get rid of break and add passingNum++;
            passingNum++;
            System.out.println("enter number #"+numCount+":");

            if (scanner.hasNextInt()) {
                 test = scanner.nextInt();
                sumAll += test; // read sumAll = sumAll + test(user input) doing this allows sumAll to
                // store all user input data even after the loop
                if(numCount == 10){
                    break;
                }numCount++;
            } else {
                passingNum = numCount;
                System.out.println("invalid number");
            }
            scanner.nextLine();// if user inputs invalid number the else statement would run.
            // however since the user did enter a valid number it would need to be read and
            // removed from the scanner before additional content is entered
            // since the NextLine() call reads input but doesn't store said input or something.........
        }
        System.out.println("sum = "+sumAll);
        scanner.close(); // frees up the memory space the Scanner class used
        //failed again unfair test
        */
        //---------------------------------------
        //MinMax input challenge probably more bullshit :(
        /*
        int counter = 0;
        int userNumber;
        int min = 0, max = 0;
        boolean first = true;
        while (true){
            System.out.println("Enter number:");
            if(scanner.hasNextInt()){
                 userNumber = scanner.nextInt();
                 if(first){ // check if first number flag is set to true
                     first = false; // after user enters first number first becomes false
                     // so when the loop runs again first will equal false and
                     // both min and max will show user inout instead of 0
                     min = userNumber;
                     max = userNumber;// alternatively could set min to the max number primitive type int can
                     // hold and vis-versa
                 }
               if (userNumber > max){
                   max = userNumber;
               }else if(userNumber < min){
                   min = userNumber;
               }
                counter++;
                if(counter == 1){
                    System.out.println("Exiting at "+ counter);
                    break;
                }
            }else {
                System.out.println("invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min "+min+" max "+max);
        scanner.close();
*/
        //------------------------------------------------------------------------------------
        //challenge  passed
        BankAccount bankAccount = new BankAccount(25484, 5, "Brandon K",
                "lop@yahoo.com", "(301)-554-2594");// BankAccount() is a constructor
        bankAccount.deposit(11);
        bankAccount.withdraw(15);
        // challenge 2


    }

    public static int sumDigits(int number) {
        if ( number < 10 )
            return -1;
        int summmm = 0;  // ideal equation 125 -> 125/10 = 12-> 12 * 10 = 120-> 120 -125 = 5
        while (number > 0){
            //extract least significant digit
            int digit = number % 10;
            summmm += digit; //add digit to summmm
            // increment (interation step) drop the least significant digit
            number /= 10; //numbr = number / 10
        }return summmm; //then return summm
    }//failed unfair test

    public static boolean isPrime(int n) { // determins if n is a prime number
        if(n == 1){
            return false; //prime number an only be divided by 1 or by itself.
            // Must be a whole number greater than 1
        }
        for(int i=2; i <= (long) Math.sqrt(n); i++){ // canhed to square root instead of dividing n by 2
            if(n % i == 0){
                return false;
            }
        }return true;
    }

    public static boolean isEvenNumber(int evenTest) {
        if (evenTest % 2 == 0){
            return true;
        }
        return false;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static void printDayOfWeek(int day){
        switch (day){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wensday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Please enter a number between 0 and 6");
        }
        if(day == 0){
            System.out.println("Sunday");
        }else if(day == 1){
            System.out.println("Monday");
        }else if(day == 2){
            System.out.println("Tuesday");
        }else if(day == 3){
            System.out.println("Wensday");
        }else if(day == 4){
            System.out.println("Thursday");
        }else if(day == 5){
            System.out.println("Friday");
        }else if(day == 6){
            System.out.println("Saturday");
        }else System.out.println("Please enter a number between 0 and 6");
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int minCap = minutes % 60; // calculated how many mins remains in 1 hour ex 61min = 1h 1m
        return hours + " hours, " + minCap + " minutes, " + seconds + " seconds";
    }
    public static String getDurationString( int seconds){
        if (seconds >= 0){
            int minInSecond = seconds / 60;
            int secRemaining = seconds % 60;
            return getDurationString(minInSecond,secRemaining);
        }
        return "Invalid Value";
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
