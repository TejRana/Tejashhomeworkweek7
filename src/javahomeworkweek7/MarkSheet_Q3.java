package javahomeworkweek7;

import java.awt.*;
import java.util.Scanner;

public class MarkSheet_Q3 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        String grade;
        System.out.println(" Enter your Name :- ");
        String Name = obj.next();
        System.out.println("Enter your Roll Number :- ");
        int RollNo = obj.nextInt();
        System.out.println("Enter the marks of Math :- ");
         double math = obj.nextInt();

        System.out.println("Enter the marks of Science :- ");
        double science = obj.nextInt();
        System.out.println("Enter the marks of English");
        double english = obj.nextInt();
        double total = math + science + english;
       // int avg = total / 3;
        System.out.println("Total :- " + total);
        double percentage = total*100 / 300;
        //int per = avg;
        System.out.println("Percentage :- " + percentage);
        //if ((math<100) && (science<100) && (english<100));
        if (percentage>=35) {
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        if (percentage >= 80) {
            //grade = "Pass";
            System.out.println("Grade A+");
        } else if (percentage < 80 && percentage>=60) {
            //grade = "A+";
            System.out.println("Grade A");
        } else if  (percentage < 60 && percentage>50) {
            //grade = "A";
            System.out.println("Grade-B");
        } else if (percentage < 50  && percentage>=35) {
            //grade = "B";
            System.out.println("Grade-C");
        } else if (percentage>=35) {
            //grade = "B";
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        System.out.println("----------------------------");
        System.out.println("|        Mark Sheet        |");
        System.out.println("|--------------------------|");
        System.out.println("|   Name       :       Jay |");
        System.out.println("|   Roll No:   08          |");
        System.out.println("|--------------------------|");
        System.out.println("|   Subjects   :      Marks|");
        System.out.println("|   Math       :       98  |");
        System.out.println("|   Science:   90          |");
        System.out.println("|   English:   85          |");
        System.out.println("|--------------------------|");
        System.out.println("|   Total      :      273  |");
        System.out.println("|--------------------------|");
        System.out.println("|   Percentage :     91.0  |");
        System.out.println("|   Result     :     Pass  |");
        System.out.println("|   Grade      :      A+   |");
        System.out.println("----------------------------");
    }
}

