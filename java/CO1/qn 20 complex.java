import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        result.display();

      
    }
}
