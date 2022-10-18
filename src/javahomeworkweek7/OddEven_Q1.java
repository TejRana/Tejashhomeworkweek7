package javahomeworkweek7;

import java.util.Scanner;

public class OddEven_Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = scanner.nextInt(); // store only integer
        // % modular
        //: else // ? if
        // any number going to divide by 2 and the reminder became 0

        String result = (num % 2 == 0)? "Even" : "Odd";
        System.out.println("Number is  :" + result);
        // if (num % 2 ==0){
        //   System.out.println("Number is even :" + num);
        //}else {
          //  System.out.println("Number is Odd :" + num);
        }
    }

