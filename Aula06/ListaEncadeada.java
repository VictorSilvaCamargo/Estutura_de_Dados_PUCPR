package Aula06;

public class ListaEncadeada {
    private Node Lista;
    public ListaEncadeada(){
        this.Lista = null;
    }

    public void setLista(Node lista) {
        Lista = lista;

    }

    public Node getLista() {
        return Lista;
    }

    public void add(int i){
        Node node  = new Node();
        node.setInformacao(i);
        node.setProximo(Lista);
        Lista = node;
    }
    public void imprimir(){
        for(Node n = Lista; n != null; n = n.getProximo()){
            System.out.println(n.getInformacao());
            }
        }
    public Node procurar(int i) {
        for (Node n = Lista; n != null; n = n.getProximo()) {
            if (n.getInformacao() == i) {
                return n;
            }
        }
        return null;
    }

    public void remove(int i){

        Node anterior = null;
        Node p = Lista;

        while(p != null && p.getInformacao() != i){
            anterior = p;
            p = p.getProximo();
            }

        if(p == null){
             return;
            }

        if(anterior == null){
            Lista = p.getProximo();
            } else {
            anterior.setProximo(p.getProximo());
            }
        }
}
