package Java101;

import java.util.Scanner;

public class Taksimetre {
   public static void main(String[] args) {

       float startPrice = 10.0f, perKm = 2.20f, km, total;
       Scanner scan = new Scanner(System.in);

       System.out.print("Mesafeyi KM cinsinden giriniz: ");
       km = scan.nextFloat();

       total = startPrice + (km * perKm);
       total = total < 20 ? 20 : total;

       System.out.println("Tutar: " + total);

       scan.close();
   } 
}
