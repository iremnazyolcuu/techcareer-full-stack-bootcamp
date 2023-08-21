package javaSE;

import java.util.Arrays;

public class _10_Arrays {
    
    public static void main(String[] args) {
        int[] dizi = new int[6];
        dizi[0] = 99;
        dizi[1] = 2;
        dizi[2] = 3;
        dizi[4] = 50;
        dizi[5] = 1;

        System.out.println(dizi[0]);
        System.out.println(dizi.length);

        for (int i = 0; i < 5; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\n*********");

        Arrays.sort(dizi);

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        System.out.println("\n**********");

        /////////////////////////////////////////////////////
        /**/
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[1][1] = 2;
        matrix[2][2] = 3;
        matrix[3][3] = 4;
        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println(" ");
        }
    }
}