package Aula07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        Scanner scanner = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("Menu:");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Procurar elemento");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> {
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int elementoAdicionar = scanner.nextInt();
                    lista.add(elementoAdicionar);
                }
                case 2 -> {
                    System.out.print("Digite o elemento a ser removido: ");
                    int elementoRemover = scanner.nextInt();
                    Node nodeProcuradoRemover = lista.procurar(elementoRemover);
                    if (nodeProcuradoRemover != null) {
                        lista.remove(elementoRemover);
                        System.out.println("Elemento " + elementoRemover + " removido.");
                    } else {
                        System.out.println("Elemento " + elementoRemover + " não encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Digite o elemento a ser procurado: ");
                    int elementoProcurado = scanner.nextInt();
                    Node nodeEncontrado = lista.procurar(elementoProcurado);
                    if (nodeEncontrado != null) {
                        System.out.println("Elemento " + elementoProcurado + " encontrado.");
                    } else {
                        System.out.println("Elemento " + elementoProcurado + " não encontrado.");
                    }
                }
                case 4 -> {
                    System.out.println("Lista:");
                    lista.imprimir();
                }
                case 5 -> System.out.println("Saindo do programa.");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 5);

        scanner.close();
    }
}
