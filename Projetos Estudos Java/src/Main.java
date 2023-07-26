import GerenciadorEscolar.model.Aluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0, qtd, idade;
        String nome, email, cpf;
        Scanner ler = new Scanner(System.in);

        System.out.println("Informa a quantidade de alunos para cadastrar");
        qtd = Integer.parseInt(ler.nextLine());

        Aluno[] alunos = new Aluno[qtd];

        System.out.println("Informe os dados dos Alunos");

        while (i<alunos.length){
            alunos[i] = new Aluno();

            System.out.println("Informe o nome do Aluno");
            nome = ler.nextLine();
            System.out.println("Informe a idade do Aluno");
            idade = Integer.parseInt(ler.nextLine());
            System.out.println("Informe o cpf do Aluno");
            cpf = ler.nextLine();
            System.out.println("informe o email do Aluno");
            email = ler.nextLine();

            alunos[i].setNome(nome);
            alunos[i].setIdade(idade);
            alunos[i].setCpf(cpf);
            alunos[i].setEmail(email);

            i++;
        }

        System.out.println("Impressão dos dados dos Alunos");
        System.out.println("Alunos");

        for (int j=0; j<alunos.length; j++){
            System.out.println("Nome: "+alunos[j].getNome());
            System.out.println("Idade: "+alunos[j].getIdade());
            System.out.println("CPF: "+alunos[j].getCpf());
            System.out.println("E-mail: "+alunos[j].getEmail());
        }

    }
}