import java.util.*;
public class Main {
    public static void main(String[] args) {
        INub.sayHi();

        /*
        Arithmetic operators
        add +
        subtract -
        multiply *
        divide /

        increment variables
        plus 1 ++
        plus 2(or more) += 2   c+=2 | c = c + 2

        byte(number, 1 byte from memory)
        short(number, 2 bytes from memory)
        int(number, 4 bytes from memory)
        long(number, 8 bytes from memory)
        float(number, 4 bytes from memory)
        double(number, 8 bytes from memory)
        */
        short intString = Short.parseShort(sc.nextLine());
        int amount, digit1, digit2;

        System.out.println("Please Enter any Number that you wish: ");
        int user = sc.nextInt();
        digit1 = user;
        digit2 = user;
        while (digit1 >= 10){
            digit1 = digit1 / 10;
        }
        while(digit2 >= 100){
            digit2 = digit2 / 10;
        }
        amount = digit1 + digit2;

        System.out.println("The sum of the first two " +
                "Digits of the given number " + user + "  =  " + amount);
    }
    static Scanner sc = new Scanner(System.in);


}
