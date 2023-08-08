package Aula03;

import java.util.Arrays;

public class Ordenador {

    public static void main(String[] args) {
        int[] a = {10, 25, 5, 3, 50, 14};
        System.out.println(Arrays.toString(a));
        crescente(a);
        System.out.println(Arrays.toString(a));
    }

    public static void crescente(int[] lista) {
        int n = lista.length;
        boolean trocou;

        for (int i = 0; i < n - 1; i++) {
            trocou = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }
        }
    }
}
