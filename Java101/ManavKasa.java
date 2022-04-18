package Java101;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlıcan = 5.00f;
        float toplam = 0.0f;
        int adet;
        Scanner scan = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        adet = scan.nextInt();
        toplam += adet * armut;

        System.out.print("Elma kaç kilo? : ");
        adet = scan.nextInt();
        toplam += adet * elma;

        System.out.print("Domates kaç kilo? : ");
        adet = scan.nextInt();
        toplam += adet * domates;

        System.out.print("Muz kaç kilo? : ");
        adet = scan.nextInt();
        toplam += adet * muz;

        System.out.print("Patlıcan kaç kilo? : ");
        adet = scan.nextInt();
        toplam += adet * patlıcan;

        System.out.println("Toplam Tutar : " + toplam);

        scan.close();
    }
}
