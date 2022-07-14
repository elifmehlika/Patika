package Java101;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();
        input.close();

        int i = n1;
        while(i > 0){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
                break;
            }
            i--;
        }

        ekok = (n1 * n2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
