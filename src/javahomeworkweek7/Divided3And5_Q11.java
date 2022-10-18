package javahomeworkweek7;

public class Divided3And5_Q11 {
    static void result(int input)
    {
        // from 0 to input
        for (int num = 0; num < input; num++)
        {
            // operator is used
            if (num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
        }
    }
    // Driver code
    public static void main(String []args)
    {
        // input goes here
        int input  = 100;
        // Calling function
        result(input);
    }
}

