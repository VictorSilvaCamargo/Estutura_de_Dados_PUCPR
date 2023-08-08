package Aula03;

import java.util.Arrays;

public class Moda {

    public static void moda(int[] lista){
        int modaAtual = 1;
        int numeroModa = lista[0];
        int contador = 1;

        for(int i = 0; i < lista.length;i++){
            for(int j = i + 1; j < lista.length;j++){
                if(lista[i] == lista[j]){
                    contador +=1;
                }

                if(contador > modaAtual){
                    numeroModa = lista[i];
                    modaAtual = contador;
                }
            }

        }
        if(modaAtual == 1){
            System.out.println("Não à nenhum número que se repete mais de uma vez");

        } else {
            System.out.println(numeroModa);
        }


    }

    public static void main(String[] args) {

        int[] numeros = {2,3,4,5,6,3};
        System.out.println(Arrays.toString(numeros));
        moda(numeros);



    }
}
