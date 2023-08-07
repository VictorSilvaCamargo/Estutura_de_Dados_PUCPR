package Aula02;
import java.util.Scanner;

public class Pessoa {
    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String cpf;
    private String telefone;

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

    public Pessoa cadastrarPessoa() {
        Pessoa novaPessoa = new Pessoa();

        System.out.println("Digite seu nome:");
        novaPessoa.nome = scanner.nextLine();
        System.out.println("Digite seu cpf:");
        novaPessoa.cpf = scanner.nextLine();
        System.out.println("Digite seu telefone:");
        novaPessoa.telefone = scanner.nextLine();

        return novaPessoa;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
    }
}
