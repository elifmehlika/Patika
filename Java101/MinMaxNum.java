package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNum {
    public static void main(String[] args) {

        int[] arr = {15, 12, 788, 1, -1, -788, 2, 0};
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Dizi : {" + Arrays.toString(arr) +"}");
        System.out.print("Girilen Sayı : ");
        n = scan.nextInt();
        scan.close();

        int min = arr[0];
        int max = arr[0];
        int minFark = 10000;
        int maxFark = 10000;

        for(int i=0; i<8; i++){
            if(n-arr[i] < minFark && n-arr[i] > 0){
                min = arr[i];
                minFark = n-arr[i];
            }else if(arr[i] - n < maxFark && arr[i]-n > 0){
                max = arr[i];
                maxFark = arr[i]-n;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
