package Java101;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        
    int mat=0, fizik=0, turkce=0, kimya=0, muzik=0, toplam=0, dersSayisi=0;
    int[] notlar = {mat, fizik, turkce, kimya, muzik};
    String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
    float avg;

    Scanner input = new Scanner(System.in);

    for (int i=0; i<5; i++){
        System.out.println(dersler[i] + " notunuz: ");
        notlar[i] = input.nextInt();
        if (notlar[i] >= 0 && notlar[i] <= 100) {
            dersSayisi ++;
            toplam += notlar[i];
        }  
    }

    input.close();

    avg = toplam / dersSayisi;

    if(avg < 55){
        System.out.println("Sınıfta kaldınız! Ortalama: " + avg);
    }else{
        System.out.println("Sınıfı geçtiniz! Ortalama: " + avg);
    }
}
}