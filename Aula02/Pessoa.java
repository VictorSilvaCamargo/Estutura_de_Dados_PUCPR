package Aula02;
import java.util.Scanner;

abstract class Pessoa {
    Scanner scanner = new Scanner(System.in);

    protected String nome;
    protected String cpf;
    protected String telefone;

    public Pessoa() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    abstract public Pessoa cadastrarPessoa();

    abstract public void imprimirPessoa();


}
