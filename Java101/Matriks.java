package Java101;

public class Matriks {
    static void printMatrix(int[][] m){
        for(int i = 0; i < m.length; i++){
            for( int j = 0; j < m[i].length; j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int[][] m = { {2, 3, 4}, {5, 6, 4}};
        int[][] t = new int[m[1].length][m.length];

        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                t[j][i] = m[i][j];
            }
        }

        System.out.println("Matris : ");
        printMatrix(m);
        System.out.println("Transpoze : ");
        printMatrix(t);
    }
}
