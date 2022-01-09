/*
SIMULANDO UM SISTEMA DE UM CLUBE, ONDE CADA ATLETA TEM CADASTRADO SUA MODALIDADE E SEU HORARIO DE TREINO
 */
public class Atleta {
    private String nome;
    private Modalidade modalidade;

    public Atleta(String nome, Modalidade modalidade) {
        this.nome = nome;
        this.modalidade = modalidade;
    }

    public String obterAtleta() {
        return "Atleta{" +
                "nome='" + this.nome + '\'' +
                ", modalidade='" + modalidade.getNome() + '\'' +
                ", horario='" + modalidade.getHorario() + '\'' +
                '}';
    }
}