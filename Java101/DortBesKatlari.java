package Java101;

import java.util.Scanner;

public class DortBesKatlari {
    public static void main(String[] args) {
        
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Sınır sayısını giriniz: ");
        n = input.nextInt();
        input.close();

        System.out.println("4 ve 5'in katı olan sayılar: ");

        for (int i=4, j=5; i<n || j<n ; i*=4, j*=5){
            System.out.print(i + "," + j + ",");
        }
    }
}
