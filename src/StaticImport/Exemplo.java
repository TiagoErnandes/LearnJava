package StaticImport;

import static java.lang.Math.pow;


public class Exemplo {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double c = 4;

        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(c));

        System.out.println(pow(b,c));

        System.out.println();
    }
}
