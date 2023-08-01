package Aula01;

public class Altura {
    public static void main(String[] args) {

        //Código para detectar a maior altura de um array e depois imprimi-la

        double[] altura = {1.23, 1.20, 1.80, 1.70};

        double alturaMaior = 0;
        for (double v : altura) {
            if (v > alturaMaior) {
                alturaMaior = v;
            }
        }
        System.out.println(alturaMaior);
    }
}
