package javahomeworkweek7;

public class ArraySpecificValue_Q20 {

    public static void main(String[] args) {

        int[] userinput = {10, 40, 50, 60, 70, 20};
        int specificElement = 40;
        ArraySpecificValue_Q20.getSpecificValue(userinput, specificElement);
    }
    public static void getSpecificValue(int[] userinput, int specificElement) {
        int[] input = userinput;
        int element = specificElement;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == element) {
                System.out.println("Yes");
            }
        }
    }
}