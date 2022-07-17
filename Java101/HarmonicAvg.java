package Java101;

public class HarmonicAvg {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        double sum = 0.0, avg;

        for(int i : arr){
            sum += (1.0/i);
        }

        avg = arr.length / sum;

        System.out.println("Harmonik Ortalama: " + avg);

    }
}
