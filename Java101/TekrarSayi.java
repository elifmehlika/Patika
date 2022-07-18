package Java101;

public class TekrarSayi {

    static boolean isFind(int arr[], int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {6, 3, 45, 6, 6, 2, 2, 8, 7, 10, 8};
        int[] duplicate = new int[list.length];
        int startindex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[startindex++] = list[i];
                        break;
                    }
                }
            }
        }
        for(int value : duplicate){
            if(value != 0){
                System.out.print(value + " ");
            }
        }
    }
}
