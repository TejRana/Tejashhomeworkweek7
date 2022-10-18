package javahomeworkweek7;

import java.util.Scanner;

public class AverageOfArray_Q19 {

    public static void main(String[] args) {
    // average value of array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many Element you want");
        // store this value in variable
        int a = scanner.nextInt();
        double[] array = new double[a];
        System.out.println("Enter "+a+" elements in an array");
        double sum = 0;
        for (int i = 0;i<a; i++)
        {
            array[i]=scanner.nextDouble();
            sum +=array[i];
        }
        System.out.println("Average value is : "+sum/a);
    }
}
