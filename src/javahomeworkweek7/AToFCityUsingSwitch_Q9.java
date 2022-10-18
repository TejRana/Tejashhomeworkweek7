package javahomeworkweek7;


public class AToFCityUsingSwitch_Q9 {

    public static void main(String[] args) {


        char country = 'B';

        switch (country) {
            case 'A':
                System.out.println("Arizona");
                break;
            case 'B':
                System.out.println("Brazil");
                break;
            case 'C':
                System.out.println("Canada");
                break;
            case 'D':
                System.out.println("Denmark");
                break;
            case 'E':
                System.out.println("Estonia");
                break;
            case'F':
                System.out.println("Finland");
                break;
            default:
                System.out.println("if any other alphabet should be invalid entry ");
        }
    }
}
