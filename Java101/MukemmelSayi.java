package Java101;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        input.close();

        for (int i = 1; i <= n/2; i++){
            if(n % i == 0){
                sum += i;
            }
        }

        if (sum == n){
            System.out.println(n + " bir mükemmel sayıdır.");
        }else{
            System.out.println(n + " bir mükemmel sayı değildir.");
        }
    }   
}
