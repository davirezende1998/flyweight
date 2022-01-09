import java.util.HashMap;
import java.util.Map;
public class ModalidadeFactory {
    private static Map<String, Modalidade> modalidades = new HashMap<>();

    public static Modalidade getModalidade(String nome, String horario) {
        Modalidade modalidade = modalidades.get(nome);
        if (modalidade == null) {
            modalidade = new Modalidade(nome, horario);
            modalidades.put(nome, modalidade);
        }
        return modalidade;
    }

    public static int getTotalModalidades() {
        return modalidades.size();
    }
}