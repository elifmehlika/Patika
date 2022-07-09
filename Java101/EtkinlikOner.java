package Java101;

import java.util.Scanner;

public class EtkinlikOner{
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Kayak yapabilirsin.");
        }if (heat >= 5 && heat <= 15){
            System.out.println("Sinemaya gidebilirsin.");
        }if(heat >= 15 && heat <= 25){
            System.out.println("Pikniğe gidebilirsin.");
        }if (heat >= 25){
            System.out.println("Yüzmeye gidebilirsin.");
        }

        input.close();
    }
}