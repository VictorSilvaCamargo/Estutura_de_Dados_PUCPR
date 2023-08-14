package Aula04;

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;


    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }


    public void inserir() {
        if(!cheia()){
            topo = topo + 1;
            dados[topo] = 10;

        } else {
            System.out.println("A ilha esta cheia!");
        }
    }

    public boolean cheia() {
        if(topo == capacidade -1){
            return true;

        } else {
            return false;
        }
    }


    public boolean vazia() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void remove() {
        if(!vazia()){
            dados[topo] = 0;
            topo = topo -1;
        } else {
            System.out.println("A pilha esta vazia");
        }
    }



    public void imprime(){
        for(int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
    }

}
