import java.util.Scanner;

class Area {

    void area(double r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    void area(int l, int b) {
        System.out.println("Area of Rectangle: " + (l * b));
    }

    void area(float b, float h) {
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

public class overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();

        System.out.println("Enter radius:");
        a.area(sc.nextDouble());

        System.out.println("Enter length & breadth:");
        a.area(sc.nextInt(), sc.nextInt());

        System.out.println("Enter base & height:");
        a.area(sc.nextFloat(), sc.nextFloat());
    }
}