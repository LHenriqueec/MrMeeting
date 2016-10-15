/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Estudante {
    String nome, assunto, turma;

    public Estudante(String nome, String assunto, String turma) {
        this.nome = nome;
        this.assunto = assunto;
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
