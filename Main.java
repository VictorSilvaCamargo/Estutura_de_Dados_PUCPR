public class Main {
    public static void main(String[] args) {
        double[] altura = {1.23, 1.20, 1.80, 1.70};

        double alturaMaior = 0;
        for (int i = 0; i < altura.length; i++) {
            if (altura[i] > alturaMaior) {
                alturaMaior = altura[i];
            }
        }
        System.out.println(alturaMaior);
    }
}
