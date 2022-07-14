package Java101;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int min, max, n, temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? ");
        n = input.nextInt();

        System.out.print("1. sayıyı giriniz: ");
        temp = input.nextInt();
        min = temp;
        max = temp;

        for(int i = 2; i <= n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            temp = input.nextInt();
            if (temp > max){
                max = temp;
            }
            if (temp < min){
                min = temp;
            }
        }
        input.close();

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı " + min);
    }
}
