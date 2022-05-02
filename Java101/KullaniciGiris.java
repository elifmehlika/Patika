package Java101;
import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String username,password,command,newpassword;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        username = scan.nextLine();

        System.out.print("Şifreniz: ");
        password = scan.nextLine();

        if(username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız!");
        }else{
            System.out.println("Bilgileriniz yanlış!");

            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Y/N)");
            command = scan.nextLine();

            if(command.equals("Y")){
                System.out.print("Yeni şifreyi giriniz: ");
                newpassword = scan.nextLine();
                if(newpassword.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            }
        }
        scan.close();
    }
}
