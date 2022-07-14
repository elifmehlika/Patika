package Java101;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            int flag = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    flag ++;
                }
            }
            if (flag == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
