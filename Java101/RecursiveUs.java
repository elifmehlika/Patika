package Java101;

import java.util.Scanner;

public class RecursiveUs {

    static int power(int base, int exponent){
        if(exponent == 0){
            return 1;
        }else if(base == 0){
            return 0;
        }
        return (base * power(base, exponent - 1));
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
