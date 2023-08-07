package Aula02;
import java.util.Scanner;
public class Funcionario extends Pessoa{
    String matricula;
    Scanner scanner = new Scanner(System.in);
    public Funcionario() {
        super();
        this.matricula = "";
    }

    public Funcionario cadastrarPessoa() {
        Funcionario novaPessoa = new Funcionario();

        System.out.println("Digite seu nome:");
        novaPessoa.nome = scanner.nextLine();
        System.out.println("Digite seu cpf:");
        novaPessoa.cpf = scanner.nextLine();
        System.out.println("Digite seu telefone:");
        novaPessoa.telefone = scanner.nextLine();
        System.out.println("Digite seu número de matricula: ");
        novaPessoa.matricula = scanner.nextLine();

        return novaPessoa;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Matriculia: " + matricula);
    }

}
