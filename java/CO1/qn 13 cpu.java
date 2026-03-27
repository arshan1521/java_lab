  1 import java.util.Scanner;
  2
  3 class CPU
  4 {
  5     int price;
  6
  7     class Processor
  8     {
  9         int cores;
 10         String manufacturer;
 11     }
 12
 13     static class RAM
 14     {
 15         int memory;
 16         String manufacturer;
 17     }
 18 }
 19
 20 public class cpuram
 21 {
 22     public static void main(String args[])
 23     {
 24         Scanner sc = new Scanner(System.in);
 25
 26         CPU cpu = new CPU();
 27         System.out.print("Enter CPU price: ");
 28         cpu.price = sc.nextInt();
 29
 30         CPU.Processor p = cpu.new Processor();
 31         System.out.print("Enter number of cores: ");
 32         p.cores = sc.nextInt();
 33         System.out.print("Enter processor manufacturer: ");
 34         p.manufacturer = sc.next();
 35
 36         CPU.RAM r = new CPU.RAM();
 37         System.out.print("Enter RAM memory: ");
 38         r.memory = sc.nextInt();
 39         System.out.print("Enter RAM manufacturer: ");
 40         r.manufacturer = sc.next();
 41
 42         System.out.println("CPU Price: " + cpu.price);
 43         System.out.println("Processor Cores: " + p.cores);
 44         System.out.println("Processor Manufacturer: " + p.manufacturer);
 45         System.out.println("RAM Memory: " + r.memory + "GB");
 46         System.out.println("RAM Manufacturer: " + r.manufacturer);
 47     }
 48 }
