import java.util.Scanner;

class Calculator
{
      public static void main(String [] args)
      {
       System.out.println("\n****Lenny's Calculator****");
       
       Scanner myScanner = new Scanner(System.in);
       double first, second, sum, diff, product, quotient;
       char oper;

       sum = 0;
       diff = 0;
       product = 0;
       quotient = 0;

       System.out.println("\nEnter a number: ");
       first = myScanner.nextDouble();

       System.out.println("\nEnter an operation(+ , -, *, /): ");

       oper = myScanner.next().charAt(0);

       if(oper == '+' || oper == '-' || oper == '*' || oper == '/')
       { 
        System.out.println("\nEnter a second number: ");
        second = myScanner.nextDouble();
         
        if(oper == '+')
         {
          sum = first + second;
          System.out.println("\n" + first + " + " + second + " = " + sum);
         }

        else if(oper == '-')
         {
          diff = first - second;
          System.out.println("\n" + first + " - " + second + " = " + diff);
         }

        else if(oper == '*')
         {
          product = first * second;
          System.out.println("\n" + first + " * " + second + " = " + product);
         }

        else if(oper == '/')
         {
          quotient = first / second;
          System.out.println("\n" + first + " / " + second + " = " + quotient);
         }
        }
   
        else
        {
         System.out.println("\nYou have entered an invalid operator.");
        }
    }
}


       