import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerClassPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println(scan.next());
//        System.out.print("Please enter a number from 1 to 100: ");
//        int num = scan.nextInt();
//        System.out.println("You entered " + num);
//        System.out.print("Please enter color of applle: ");
       // String apple = scan.next();
//        System.out.println("Apple is " + apple);
//        System.out.print("Please enter first letter of your name: ");
        //char nameLetter = scan.next().charAt(0);
       // System.out.println("First letter of your name is: " + nameLetter);


        double num1 = 10;
        double num2 = 3;
        double result = num1/num2;
        System.out.println(result);
        result = Math.round(result*100.0)/100.0;
        System.out.println(result);

        System.out.println((1+2+3+4+5+6+7+8+9+10)/10);
        int num[] = new int[5];
        num[0]=5;
        num[2]=3;
        System.out.println(num[2]);
        System.out.println(Arrays.toString(num));


    }
}
