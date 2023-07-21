package GerenciadorEscolar;

public class Escola {

    public String nome;
    public int idade;
    public String turma;
    public String Escolanome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public  int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getTurma(String turma) {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getEscolanome(String Escolanome){
        return Escolanome;
    }

    public void setEscolanome(String Escolanome) {
        this.Escolanome = Escolanome;
    }
}
