/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Professor {
    private String nome, materia;
    private float horario_inicial, horario_final;

    public Professor(String nome, String materia, float horario_inicial, float horario_final) {
        this.nome = nome;
        this.materia = materia;
        this.horario_inicial = horario_inicial;
        this.horario_final = horario_final;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getHorario_inicial() {
        return horario_inicial;
    }

    public void setHorario_inicial(float horario_inicial) {
        this.horario_inicial = horario_inicial;
    }

    public float getHorario_final() {
        return horario_final;
    }

    public void setHorario_final(float horario_final) {
        this.horario_final = horario_final;
    }
}
