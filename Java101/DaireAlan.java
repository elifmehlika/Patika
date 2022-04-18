package Java101;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        float pi = 3.14f;
        float a, r;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dilimin yarıçapını giriniz: ");
        r = scan.nextFloat();
        System.out.print("Dilimin merkez açısını giriniz: ");
        a = scan.nextFloat();

        float sonuc = pi*r*r*a/360.0f;
        System.out.println("Daire diliminin alanı: " + sonuc);
    }
}
