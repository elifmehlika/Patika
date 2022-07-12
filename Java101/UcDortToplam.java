package Java101;

import java.util.Scanner;

public class UcDortToplam {
    public static void main(String[] args) {

        int num, sum=0, counter=0;
        double avg;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        num = input.nextInt();
        input.close();

        for (int i=0; i<num; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                counter++;
            }
        }

        avg = sum / counter;
        System.out.println("Ortalama: " + avg);
    }
}
