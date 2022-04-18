package Java101;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        
    float kdvTutari, tutar, kdvliTutar, kdvOran;

    Scanner scan = new Scanner(System.in);
    System.out.print("Tutarı giriniz: ");
    tutar = scan.nextFloat();

    kdvOran = tutar > 1000 ? 8.0f : 18.0f;

    kdvTutari =  tutar * kdvOran / 100;
    kdvliTutar = tutar + kdvTutari;

    System.out.println("Kdv Tutarı: " + kdvTutari);
    System.out.println("Kdv\'li Tutar: " + kdvliTutar);
    
    scan.close();
    }
}
