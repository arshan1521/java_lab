import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r){ this.r=r; }

    public void area(){ System.out.println("Area: "+3.14*r*r); }
    public void perimeter(){ System.out.println("Perimeter: "+2*3.14*r); }
}

class Rectangle implements Shape {
    double l,b;
    Rectangle(double l,double b){ this.l=l; this.b=b; }

    public void area(){ System.out.println("Area: "+l*b); }
    public void perimeter(){ System.out.println("Perimeter: "+2*(l+b)); }
}

class interface {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Circle 2.Rectangle");
        int ch=sc.nextInt();

        if(ch==1){
            System.out.print("Enter radius: ");
            Circle c=new Circle(sc.nextDouble());
            c.area(); c.perimeter();
        } else {
            System.out.print("Enter l,b: ");
            Rectangle r=new Rectangle(sc.nextDouble(),sc.nextDouble());
            r.area(); r.perimeter();
        }
    }
}