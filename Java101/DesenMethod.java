package Java101;

import java.util.Scanner;

public class DesenMethod {

    static int func(int n, int flag, int first){
        if(flag > 0){
            System.out.print(n + " ");
            if((n-5) <= 0){
                return func(n-5, -1, first);
            }
            return func(n-5, 1, first);
        }else{
            System.out.print(n + " ");
            if(n == first){
                return 0;
            }
            return func(n+5, -1, first);
        }
    }

    
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        n = scan.nextInt();
        scan.close();

        func(n, n, n);

    }
    
}
