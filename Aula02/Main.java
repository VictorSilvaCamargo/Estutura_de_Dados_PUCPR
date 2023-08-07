package Aula02;

public class Main {
    public static void main(String[] args) {
        int numCadastros = 1;
        Pessoa[] pessoas = new Pessoa[numCadastros];

        for (int i = 0; i < numCadastros; i++) {
            Funcionario pessoa = new Funcionario();
            pessoas[i] = pessoa.cadastrarPessoa();
        }

        for (Pessoa pessoa : pessoas) {
            pessoa.imprimirPessoa();
        }
    }
}
