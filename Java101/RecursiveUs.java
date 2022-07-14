package Java101;

import java.util.Scanner;

public class RecursiveUs {

    static int power(int base, int exponent){
        int num = 1;
        for(int i = exponent; i > 0; i--){
            num *= base;
        }
        return num;
    }
    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban değeri giriniz: ");
        a = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        b = scan.nextInt();
        scan.close();

        System.out.println("Sonuç: " + power(a,b));
    }
}
