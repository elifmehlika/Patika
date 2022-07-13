package Java101;

import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        int num, sum=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        num = input.nextInt();
        input.close();

        while(num >= 1){
            sum += (num % 10);
            num /= 10;
        }

        System.out.println("Basamak sayıların toplamı: " + sum);
    }
}
