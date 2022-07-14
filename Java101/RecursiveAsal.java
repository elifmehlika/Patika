package Java101;

import java.util.Scanner;

public class RecursiveAsal {
    static boolean isPrime(int a, int i){
        if (a <= 2){
            return (a == 2) ? true : false;
        }
        if (a % i == 0){
            System.out.println(a + " sayısı ASAL değildir !");
            return false;
        }
        if (i == a/2){
            System.out.println(a + " sayısı ASALDIR.");
            return true;
        }
        
        return isPrime(a, i + 1);
    }
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        num = scan.nextInt();
        scan.close();

        isPrime(num,2);
    }
}
