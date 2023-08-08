package Aula03;

import java.util.Arrays;

public class MediaAritimetrica {

    public static int MA(int[] lista){
    int media = 0;
    for (int j : lista) {
        media = j + media;
    }
    return media / 2;

}
    public static void main(String[] args) {

        int[] numeros = {2,3,4,5,6};
        System.out.println(Arrays.toString(numeros));
        int media = MA(numeros);
        System.out.println(media);



    }
}
