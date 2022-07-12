package Java101;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int n, r, factN=1, factR=1, factNfarkR=1, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("C(n,r) hesaplamak için n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("C(n,r) hesaplamak için r değerini giriniz: ");
        r = input.nextInt();
        input.close();

        for(int i=n; i>0; i--){
            factN *= i;
        }

        for(int i=r; i>0; i--){
            factR *= i;
        }

        for (int i=(n-r); i>0; i--){
            factNfarkR *= i;
        }

        sonuc = factN/(factR * factNfarkR);

        System.out.println("C("+ n +","+ r +") = " + sonuc);
    }
}
