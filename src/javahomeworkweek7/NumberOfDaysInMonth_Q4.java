package javahomeworkweek7;


import java.util.Scanner;

public class NumberOfDaysInMonth_Q4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //isLeapYear(-1600);// → should return false since the parameter is not in range (1-9999)
        //isLeapYear(1600); ////→ should return true since 1600 is a leap year
        //isLeapYear(2017);// → should return false since 2017 is not a leap year
        isLeapYear(2020);

        getDaysInMonth(2,2020);

        
    }

    public static void isLeapYear(int year) {
        //Should lie between 1  && 9999
        //If the year is evenly divisible by 4, go to step 2. ...
        //If the year is evenly divisible by 100, go to step 3. ...
        //If the year is evenly divisible by 400, go to step 4. ...
        //The year is a leap year (it has 366 days).
        //The year is not a leap year (it has 365 days).

        boolean isLeap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap == true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");

        {

        }
    }

    public static void getDaysInMonth(int month, int year){


       // Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String MonthOfName=" " ;

        /*System.out.print("Input a month number: ");
        month = input.nextInt();

        System.out.print("Input a year: ");
        year = input.nextInt();*/

        switch (month) {
            case 1:
                MonthOfName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthOfName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }

}



