package Java101;

public class Palindrom {
    static boolean isPalindrom(int num){
        int temp = num, lastNum, reverseNum = 0;
        while(temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10; 
        }

        if(num == reverseNum){
            System.out.println(num + " bir palindrom sayıdır.");
            return true;
        }else{
            System.out.println(num + " bir palindrom sayı değildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        isPalindrom(263);
    }    
}
