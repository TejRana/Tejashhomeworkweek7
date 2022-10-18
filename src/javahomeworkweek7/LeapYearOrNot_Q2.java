package javahomeworkweek7;

public class LeapYearOrNot_Q2 {
   // any year that is divisible by 400 is definitely a leap year
   // if divisible by 4 and not divisible by 100 then a leap year
    public static void main(String[] args) {
        int year = 2022;
        if (year%400 == 0){
            System.out.println("Leap Year");
        }else if (year % 4 == 0 && year % 100!=0){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a leap Year");
        }

    }
}
