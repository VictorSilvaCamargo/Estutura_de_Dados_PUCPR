package Aula05;
import java.util.Arrays;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int total;

    public Fila(int capacidade){
        this.primeiro = 0;
        this.ultimo = -1;
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.total = 0;
    }

    public boolean vazia(){
        return total == 0;
    }

    public boolean cheia(){
        return total == capacidade;
    }

    public void inserir(int numero){
        if (!cheia()) {
            ultimo = (ultimo + 1) % capacidade;
            dados[ultimo] = numero;
            total++;
        } else {
            System.out.println("Fila cheia! Não é possível inserir.");
        }
    }

    public void remover() {
        if (!vazia()) {
            primeiro = (primeiro + 1) % capacidade;
            total--;
        } else {
            System.out.println("Fila vazia! Não é possível remover.");
        }
    }

    public void imprimir(){
        int indiceAtual = primeiro;
        for (int i = 0; i < total; i++) {
            System.out.print(dados[indiceAtual] + " ");
            indiceAtual = (indiceAtual + 1) % capacidade;
        }
        System.out.println();
    }

}
