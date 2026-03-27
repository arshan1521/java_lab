  1 import java.util.Scanner;
  2
  3 class Rectangle
  4 {
  5     int side, breadth, len, area, peri;
  6
  7     void get()
  8     {
  9         Scanner sc = new Scanner(System.in);
 10         System.out.print("Enter side of square: ");
 11         side = sc.nextInt();
 12         System.out.print("Enter breadth of rectangle: ");
 13         breadth = sc.nextInt();
 14     }
 15
 16     void calculate()
 17     {
 18         len = (side * side) / breadth;
 19         area = len * breadth;
 20         peri = 2 * (len + breadth);
 21     }
 22
 23     void display() {
 24         System.out.println("Length of rectangle = " + len);
 25         System.out.println("Area of rectangle = " + area);
 26         System.out.println("Perimeter of rectangle = " + peri);
 27     }
 28 }
 29
 30 public class sqrect
 31 {
 32     public static void main(String args[])
 33     {
 34         Rectangle r = new Rectangle();
 35         r.get();
 36         r.calculate();
 37         r.display();
 38     }
 39 }
