package ArraysCollections;

import java.util.Arrays;

public class ExemploMatriz {
    public static void main(String[] args) {

        double[][] matriz1 = new double[3][3];
        double[][] matriz2 = {{1, 2}, {3, 4}};

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1.length; j++) {
                matriz1[i][j] = i + j +3;
            }
        }

        for (int i = 1; i < matriz2.length; i++) {
            for (int j = 1; j < matriz2.length; j++) {
                matriz2[i][j] = i * j * 4;
            }
        }

        System.out.println(Arrays.deepToString(matriz1));
        System.out.println(Arrays.deepToString(matriz2));

    }
}
