  1 import java.util.Scanner;
  2 class temp
  3 {
  4     public static void main(String args[])
  5     {
  6         Scanner sc=new Scanner(System.in);
  7         System.out.print("Enter temperature in celcius: ");
  8         double celcius=sc.nextDouble();
  9         double fahren=(celcius*9/5)+32;
 10         System.out.print("Temperature in Fahrenheit: "+fahren);
 11     }
 12 }
