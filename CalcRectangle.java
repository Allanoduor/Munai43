import java.util.Scanner;

class CalcRectangle
{
   public static void main(String args[])
   {
      Scanner s = new Scanner(System.in);
      double width,length,area,perim;

      System.out.print("\nEnter the width of the rectangle:> ");
      width = s.nextDouble();
      System.out.print("Enter the length of the rectangle:> ");
      length = s.nextDouble();

      area = length * width;
      perim = 2 * (length + width);

      System.out.println("\nThe area of the rectangle is " + area);
      System.out.println("The perimeter of the rectangle is " + perim);
   }
}
