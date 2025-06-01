/* Question1:Print the sum, difference and product of two complex numbers by creating a 
class named 'Complex' with separate methods for each operation whose real and imaginary 
parts are entered by the user. */

import java.util.Scanner;

public class OOPSQ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Real Part of First number : ");
        int a = scanner.nextInt();
        System.out.print("Enter Imaginary Part of First number : ");
        int b = scanner.nextInt();
        System.out.print("Enter Real Part of Second number : ");
        int x = scanner.nextInt();
        System.out.print("Enter Imaginary Part of Second number : ");
        int y = scanner.nextInt();

        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(x, y);

        Complex cadd = Complex.add(c1, c2);
        Complex cdiff = Complex.diff(c1, c2);
        Complex cproduct = Complex.product(c1, c2);
        System.out.print("Sum : ");
        cadd.printComplex();
        System.out.print("Difference : ");
        cdiff.printComplex();
        System.out.print("Product : ");
        cproduct.printComplex();
    }
}

class Complex {
    int real;
    int img;

    Complex(int r, int i) {
        this.real = r;
        this.img = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.img) + (a.img * b.real)));
    }

    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img + "i");
        } else if (img == 0 && real != 0) {
            System.out.println(real);
        } else {
            System.out.println(real + " + " + img + "i");
        }
    }
}