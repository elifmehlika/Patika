package Java101;

import java.util.Scanner;

public class BurcBulma{
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz ay:");
        month = input.nextInt();

        System.out.println("Doğduğunuz gün:");
        day = input.nextInt();

        if (month > 0  && day > 0 && month < 13){

            if (month == 1 && day < 31){
                if (day < 22){
                    System.out.println("Oğlak Burcu");
                }else{
                    System.out.println("Kova Burcu");
                }
            }else if (month == 2 && day < 28){
                if (day < 20){
                    System.out.println("Kova Burcu");
                }else{
                    System.out.println("Balık Burcu");
                }
            }else if (month == 3 && day < 31){
                if (day < 21){
                    System.out.println("Balık Burcu");
                }else{
                    System.out.println("Koç Burcu");
                }   
            }else if (month == 4 && day < 30){
                if (day < 21){
                    System.out.println("Koç Burcu");
                }else{
                    System.out.println("Boğa Burcu");
                }
            }else if (month == 5 && day < 31){
                if (day < 22){
                    System.out.println("Boğa Burcu");
                }else{
                    System.out.println("İkizler Burcu");
                }
            }else if (month == 6 && day < 30){
                if (day < 23){
                    System.out.println("İkizler Burcu");
                }else{
                    System.out.println("Yengeç Burcu");
                }
            }else if (month == 7 && day < 31){
                if (day < 23){
                    System.out.println("Yengeç Burcu");
                }else{
                    System.out.println("Aslan Burcu");
                }
            }else if (month == 8 && day < 31){
                if (day < 23){
                    System.out.println("Aslan Burcu");
                }else{
                    System.out.println("Başak Burcu");
                }
            }else if (month == 9 && day < 30){
                if (day < 23){
                    System.out.println("Başak Burcu");
                }else{
                    System.out.println("Terazi Burcu");
                }
            }else if (month == 10 && day < 31){
                if (day < 23){
                    System.out.println("Terazi Burcu");
                }else{
                    System.out.println("Akrep Burcu");
                }
            }else if (month == 11 && day < 30){
                if (day < 22){
                    System.out.println("Akrep Burcu");
                }else{
                    System.out.println("Yay Burcu");
                }
            }else if (month == 12 && day < 31){
                if (day < 22){
                    System.out.println("Yay Burcu");
                }else{
                    System.out.println("Oğlak Burcu");
                }
            }else{
                System.out.println("Lütfen geçerli bir tarih giriniz!");
            }

        }else{
            System.out.println("Lütfen geçerli bir tarih giriniz!");
        }

        input.close();
    }
}