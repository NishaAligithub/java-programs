import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
      System.out.println("Hello and welcome to a new calculator app!");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        double num1=sc.nextDouble();

        System.out.print("enter the operator:(+,-,/,%,*):");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the second number:");
        double num2=sc.nextDouble();

        double result =0;
        switch (operator){
            case '+': result=num1+num2;break;
            case '-': result=num1-num2;break;
            case '/': result=num1/num2;break;
            case '%': result=num1%num2;break;
            case '*': result=num1*num2;break;
            default:
                System.out.println("invalid operation");
                return;


        }
        System.out.println("result:"+result);
        sc.close();

    }
}