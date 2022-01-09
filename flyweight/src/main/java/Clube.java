import java.util.ArrayList;
import java.util.List;
public class Clube {
    private List<Atleta> atletas = new ArrayList<>();

    public void cadastrar(String nomeAtleta, String nomeModalidade, String horario) {
        Modalidade modalidade = ModalidadeFactory.getModalidade(nomeModalidade, horario);
        Atleta atleta = new Atleta(nomeAtleta, modalidade);
        atletas.add(atleta);
    }

    public List<String> obterAtletas() {
        List<String> saida = new ArrayList<String>();
        for (Atleta atleta : this.atletas) {
            saida.add(atleta.obterAtleta());
        }
        return saida;
    }
}