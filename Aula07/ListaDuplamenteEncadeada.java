package Aula07;

public class ListaDuplamenteEncadeada {
    private Node inicio;
    private Node fim;
    private int tamanho;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public Node getInicio() {
        return inicio;
    }

    public Node getFim() {
        return fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void add(int i) {
        Node node = new Node();
        node.setInformacao(i);

        if (inicio == null) {
            inicio = node;
            fim = node;
        } else {
            node.setAnterior(fim);
            fim.setProximo(node);
            fim = node;
        }

        tamanho++;
    }

    public void imprimir() {
        Node n = inicio;
        while (n != null) {
            System.out.println(n.getInformacao());
            n = n.getProximo();
        }
    }

    public Node procurar(int i) {
        Node n = inicio;
        while (n != null) {
            if (n.getInformacao() == i) {
                return n;
            }
            n = n.getProximo();
        }
        return null;
    }

    public void remove(int i) {
        Node n = inicio;

        while (n != null) {
            if (n.getInformacao() == i) {
                Node nodeAnterior = n.getAnterior();
                Node nodeProximo = n.getProximo();

                if (nodeAnterior != null) {
                    nodeAnterior.setProximo(nodeProximo);
                } else {
                    inicio = nodeProximo;
                }

                if (nodeProximo != null) {
                    nodeProximo.setAnterior(nodeAnterior);
                } else {
                    fim = nodeAnterior;
                }

                n.setAnterior(null);
                n.setProximo(null);

                tamanho--;
                return;
            }
            n = n.getProximo();
        }
    }

}
