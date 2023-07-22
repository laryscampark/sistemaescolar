import GerenciadorEscolar.Cria_escola;
import GerenciadorEscolar.Cria_turma;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cria_escola escola = new Cria_escola();
        Cria_turma turmas = new Cria_turma();

        Scanner ler = new Scanner(System.in);

        final String [] aluno = {"Naruto","Sakura","Sasuke"};
        final String [] turma = {"Turma-1", "Turma-2", "Turma-3"};

        System.out.println(Arrays.toString(aluno));
        System.out.println(Arrays.toString(turma));
    }
}