package Java101;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        n = input.nextInt();
        input.close();

        for(int i = n; i > 0; i--){
            for(int j = (n - i); j > 0; j--){
                System.out.print(" ");
            }
            for(int k = (2*i -1) ; k > 0; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
