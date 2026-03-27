  1 import java.util.Scanner;
  2
  3 class Reverse {
  4     int n, rev = 0;
  5
  6     void get() {
  7         Scanner sc = new Scanner(System.in);
  8         System.out.print("Enter number: ");
  9         n = sc.nextInt();
 10     }
 11
 12     void revv() {
 13         while (n > 0) {
 14             rev = rev * 10 + n % 10;
 15             n = n / 10;
 16         }
 17         System.out.println("Reversed number = " + rev);
 18     }
 19 }
 20
 21 class rev {
 22     public static void main(String[] args) {
 23         Reverse r = new Reverse();
 24         r.get();
 25         r.revv();
 26     }
 27 }
