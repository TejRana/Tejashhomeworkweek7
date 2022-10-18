package javahomeworkweek7;

import java.util.Scanner;

public class FineSale_Q7 {

    public static void main(String[] args) {

        double sale,comm = 0.0;
        int rate;
        Scanner obj = new Scanner(System.in);
        String salesId,sellerName,BasicSalary;
        System.out.println("Enter your Id :- ");
        salesId = obj.nextLine();
        System.out.println("Enter your Name :- ");
        sellerName = obj.nextLine();
        System.out.println("Enter your Basic salary :- ");
        BasicSalary = obj.nextLine();
        System.out.println("Sales Id :- " + salesId );
        System.out.println("SellerName :- " +sellerName);
        System.out.println("Basic Salary :-" + BasicSalary);

        System.out.println("Enter the sale:- ");
        sale = obj.nextDouble();
        if (sale>=50000){
            rate = 35;
            comm = sale*0.35;
        }
        if (sale>=30000){
            rate = 20;
            comm = sale*0.20;
        }
        if (sale>=20000){
            rate = 10;
            comm = sale*0.10;
        }
        if (sale>=10000){
            rate = 5;
            comm = sale*0.5;
        }
        if (sale<10000){
            rate = 2;
            comm = sale*0.2;
        }
        System.out.println("Commission amount =" + comm);
    }
}
