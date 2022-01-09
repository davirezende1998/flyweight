public class Modalidade {
    private String nome;
    private String horario;

    public Modalidade(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }
}