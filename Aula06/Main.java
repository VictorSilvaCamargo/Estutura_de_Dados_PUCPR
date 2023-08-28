package Aula06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        int choice = 0;

        do {
            System.out.println("Menu:");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Procurar elemento");
            System.out.println("3. Remover elemento");
            System.out.println("4. Mostrar lista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Digite o elemento a ser inserido: ");
                    int elementToAdd = scanner.nextInt();
                    listaEncadeada.add(elementToAdd);
                    System.out.println("Elemento inserido.");
                    break;

                case 2:
                    System.out.print("Digite o elemento a ser procurado: ");
                    int elementToSearch = scanner.nextInt();
                    Node foundNode = listaEncadeada.procurar(elementToSearch);
                    if (foundNode != null) {
                        System.out.println("Elemento encontrado: " + foundNode.getInformacao());
                    } else {
                        System.out.println("Elemento não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o elemento a ser removido: ");
                    int elementToRemove = scanner.nextInt();
                    listaEncadeada.remove(elementToRemove);
                    System.out.println("Elemento removido.");
                    break;

                case 4:
                    System.out.println("Conteúdo da lista:");
                    listaEncadeada.imprimir();
                    break;

                case 5:
                    System.out.println("Saindo do programa.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
