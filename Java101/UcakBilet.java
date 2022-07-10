package Java101;

import java.util.Scanner;

public class UcakBilet {
    public static void main(String[] args) {
        int yolculukTipi, yas;
        double mesafe, tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Mesafeyi km cinsinden giriniz : ");
        mesafe = input.nextFloat();

        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş) : ");
        yolculukTipi = input.nextInt();

        input.close();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)){

            tutar = mesafe * 0.10;

            if (yas < 12){
                tutar = tutar * 0.5;
            }else if (yas >= 12 && yas < 24){
                tutar = tutar * 0.9;
            }else if (yas > 65){
                tutar = tutar * 0.70;
            }

            if (yolculukTipi == 2){
                tutar = (tutar * 0.80) * 2;
            }

            System.out.println("Toplam Tutar = " + tutar + " TL" );

        }else{
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
