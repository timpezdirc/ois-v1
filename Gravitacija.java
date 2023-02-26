import java.util.Scanner;

public class Gravitacija {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int nadmorskaVisina = sc.nextInt();

        final double C = 6.674e-11;
        final double M = 5.972e24;
        final double r = 6.371e6;

        izpis(nadmorskaVisina, izracun(nadmorskaVisina, C, M, r));

    }

    public static double izracun(int visina, double C, double M, double r) {
        return (C * M) / (Math.pow(r + visina, 2));
    }

    public static void izpis(int visina, double pospesek) {
        System.out.println(visina);
        System.out.println(pospesek);
    }

}