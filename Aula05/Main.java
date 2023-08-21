package Aula05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selecionador = -1;
        int capacidade;

        System.out.println("Insira a capacidade da fila:");
        capacidade = scanner.nextInt();
        Fila fila = new Fila(capacidade);

        while (selecionador != 0) {
            System.out.println("Selecione as opções:");
            System.out.println("Opção 1: inserir na pilha");
            System.out.println("Opção 2: Verificar se a pilha está cheia");
            System.out.println("Opção 3: Verificar se a pilha está vazia");
            System.out.println("Opção 4: Remover");
            System.out.println("Opção 5: Imprimir");
            System.out.println("Opção 0: Sair");

            selecionador = scanner.nextInt();

            if(selecionador ==1 ){
                System.out.println("Escreva o numero para adicionar a fila");
                int numero = scanner.nextInt();
                fila.inserir(numero);
                System.out.println("Numero inserido");

            } else if (selecionador == 2) {
                System.out.println(fila.cheia());
            } else if (selecionador == 3) {
                System.out.println(fila.vazia());
            } else if (selecionador == 4) {
                fila.remover();

            } else if(selecionador == 5){
                System.out.println();fila.imprimir();
            } else if (selecionador == 0) {
                System.out.println("Saindo...");
            }
        }

    }
}
