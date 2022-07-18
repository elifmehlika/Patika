package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {

    static String printArray(int[] arr){
        String str = "";
        for(int i = 0; i < arr.length; i++){
            str += arr[i] + " ";
        }
        return str;
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i = 0; i < n; i++){
            System.out.print((i+1) + ". Elemanı : ");
            arr[i] = scan.nextInt();
        }
        scan.close();

        Arrays.sort(arr);
        System.out.print("Sıralama : " + printArray(arr));
    }
}
