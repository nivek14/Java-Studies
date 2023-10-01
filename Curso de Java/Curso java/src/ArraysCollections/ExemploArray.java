package ArraysCollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExemploArray {
    public static void main(String[] args) {

        double[] array1 = new double[3];
        double[] array2 = {1.5, 9.6, 5};

        for(int i=0;i<array1.length;i++) array1[i] = i + 2;
        for(int i=0;i<array2.length;i++) array2[i] -= 1;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        double[] array3 = {1.5, 9.6, 5};

        for (double a: array3) {
            System.out.println(a);
        }

    }
}
