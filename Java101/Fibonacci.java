package Java101;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, temp1 = 0, temp2 = 1, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Eleman sayısını giriniz: ");
        n = input.nextInt();
        input.close();

        for(int i = 0; i < n; i++){
            System.out.print(temp2 + " ");
            sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
    }   
}
