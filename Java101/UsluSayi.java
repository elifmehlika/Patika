package Java101;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int n,k,sonuc=1;
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı: ");
        k = input.nextInt();
        input.close();

        for(int i=k;k>0;k--){
            sonuc *= n;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
