package javahomeworkweek7;

import java.util.Arrays;

public class NumericAndStringArray_Q17 {


    public static void main(String[] args) {

        int[] arraydata1 = {30, 10, 60, 40, 50, 20, 70, 80};
        String[] arraydata2 = {"Tej", "Rana", "Jack", "Book", "Deep", "Car", "Alpha"};

        System.out.println("Value of arraydata : " + Arrays.toString(arraydata1));
        Arrays.sort(arraydata1);
        System.out.println("Sorted Value of arraydata : " + Arrays.toString(arraydata1));
        System.out.println("String of arraydata : " + Arrays.toString(arraydata2));
        Arrays.sort(arraydata2);
        System.out.println("Sorted String of arraydata : " + Arrays.toString(arraydata2));
    }
}
