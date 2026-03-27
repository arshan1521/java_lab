  1 import java.util.Scanner;
  2
  3 class Sum
  4 {
  5     void findSum(int num)
  6     {
  7         int sum = 0;
  8
  9         while (num > 0)
 10         {
 11             sum = sum + num % 10;
 12             num = num / 10;
 13         }
 14
 15         System.out.println("Sum of digits = " + sum);
 16     }
 17 }
 18
 19 public class sumdigit
 20 {
 21     public static void main(String args[])
 22     {
 23         Scanner sc = new Scanner(System.in);
 24
 25         System.out.print("Enter a number: ");
 26         int n = sc.nextInt();
 27
 28         Sum s = new Sum();
 29         s.findSum(n);
 30     }
 31 }
