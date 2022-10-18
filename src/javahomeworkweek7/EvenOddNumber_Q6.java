package javahomeworkweek7;

import java.util.Scanner;

public class EvenOddNumber_Q6 {

    public static void main(String[] args) {
        int a;
        System.out.println("Enter any Number");
        Scanner abc = new Scanner(System.in);
        a = abc.nextInt();
        if (a % 2  == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number ");
        }
    }
}
