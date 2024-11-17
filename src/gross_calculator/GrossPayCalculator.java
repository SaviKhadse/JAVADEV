package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
//        System.out.println("Hello World");
        //1. Get the number of hours worked
//        int hours = 40;
        int hours =0;
        System.out.println("What is the number of hours worked?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
//        double payRate = 25.50;
        double payRate = 0;
        System.out.println("What is your pay rate?");
                payRate= scanner.nextDouble();
        scanner.close();
        double grossPay = hours * payRate;
        System.out.println("Gross Pay: " + grossPay);
    }
}
