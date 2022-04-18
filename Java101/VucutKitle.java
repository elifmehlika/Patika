package Java101;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        float boy, kilo;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scan.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scan.nextFloat();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);

        scan.close();
    }
}
