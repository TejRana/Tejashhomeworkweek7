package javahomeworkweek7;

public class SumOfArray_Q18 {

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 22;
        a[1] = 25;
        a[2] = 35;
        a[3] = 20;
        a[4] = 44;

        int sum = 0;
        int lengthOfArray = a.length;

        for (int i = 0; i < lengthOfArray; i++){
            sum = sum + a[i];
            System.out.println(sum);
        }
    }
}


