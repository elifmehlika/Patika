package Java101;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int n;
        double sum = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();
        input.close();

        for (double i=1;i<=n;i++){
            sum += (1/i);
        }

        System.out.println("Harmonik seri toplamı: "+ sum);
    }
}
