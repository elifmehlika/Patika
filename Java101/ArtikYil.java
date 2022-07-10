package Java101;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yıl;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        yıl = input.nextInt();
        input.close();

        if (yıl % 4 == 0){
            System.out.println(yıl + " bir artık yıldır !");
            if (yıl % 100 == 0 && yıl % 400 != 0){
                System.out.println(yıl + " bir artık yıl değildir !");
            }
        }else{
            System.out.println(yıl + " bir artık yıl değildir !");
        }
    }
}
