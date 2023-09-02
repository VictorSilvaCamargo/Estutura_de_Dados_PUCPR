package Aula07;

public class Node {
    private Integer informacao;
    private Node proximo;
    private Node anterior;

    public Node(){
        informacao = null;
        proximo = null;
        anterior = null;
    }

    public int getInformacao(){
        return informacao;
    }

    public void setInformacao(int informacao){
        this.informacao = informacao;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}