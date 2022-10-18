package javahomeworkweek7;

import java.util.Scanner;

public class Wap_Input_Q5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Id : ");
        int empId = scanner.nextInt();
        System.out.println("Employee Name : ");
        String empName = scanner.next();
        System.out.println("Basic salary : " );
        double Basicsalary = scanner.nextInt();
        double HRA = Basicsalary * 10/100;
        System.out.println("HRA :" + HRA);
        double TA = Basicsalary * 8/100;
        System.out.println("TA  :" + TA);
        double DA = Basicsalary * 9/100;
        System.out.println("DA  :" + DA);
        double PF = Basicsalary * 20/100;
        System.out.println("PF  :" + PF);
        // double Salary = Basicsalary = 25000 ;
        double total = Basicsalary + HRA + TA + DA - PF;
        System.out.println("Gross salary : "+ total);

        System.out.println("---------------------------");
        System.out.println("|      Salary Slip        |");
        System.out.println("|-------------------------|");
        System.out.println("|Employee Id    :     2564|");
        System.out.println("|Employee Name  :     Jay |");
        System.out.println("|-------------------------|");
        System.out.println("|Basic Salary   : Salary  |");
        System.out.println("|HRA 10%       :  2500.0  |");
        System.out.println("|TA 8%         :  2000.0  |");
        System.out.println("|DA 9%         :  2250.0  |");
        System.out.println("|PF 20%        :  5000.0  |");
        System.out.println("|-------------------------|");
        System.out.println("|Gross Salary  :  26750.0 |");
        System.out.println("|=========================|");
    }
}
