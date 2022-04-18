package Java101;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. keanrı giriniz: ");
        a = scan.nextInt();

        System.out.print("2. kenarı giriniz: ");
        b = scan.nextInt();

        System.out.print("3. kenarı giriniz: ");
        c = scan.nextInt();

        float u = (a+b+c) / 2.0f;
        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " + alan);
    }
}
