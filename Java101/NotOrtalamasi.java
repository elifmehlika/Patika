package Java101;

import java.util.Scanner;

public class NotOrtalamasi{
    public static void main(String[] args) {
        float turkce,mat,fizik,kimya,tarih,muzik;
        float sonuc = 0F;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scan.nextFloat();
        sonuc += mat;

        System.out.print("Türkçe Notunuz: ");
        turkce = scan.nextFloat();
        sonuc += turkce;

        System.out.print("Fizik Notunuz: ");
        fizik = scan.nextFloat();
        sonuc += fizik;

        System.out.print("Kimya Notunuz: ");
        kimya = scan.nextFloat();
        sonuc += kimya;

        System.out.print("Tarih Notunuz: ");
        tarih = scan.nextFloat();
        sonuc += tarih;

        System.out.print("Müzik Notunuz: ");
        muzik = scan.nextFloat();
        sonuc += muzik;

        System.out.println("Ortalamanız: " + sonuc/6.0);

        String str = sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(str);

        scan.close();
    }
}