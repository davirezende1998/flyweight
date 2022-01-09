import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class ClubeTest {
    @Test
    void deveRetornarAtletas() {
        Clube clube = new Clube();
        clube.cadastrar("Davi", "Futebol", "Diurno");
        clube.cadastrar("Pedro", "Volei", "Diurno");
        clube.cadastrar("Laura", "Basquete", "Noturno");
        clube.cadastrar("Rafael", "Futebol", "Diurno");

        List<String> saida = Arrays.asList(
                "Atleta{nome='Davi', modalidade='Futebol', horario='Diurno'}",
                "Atleta{nome='Pedro', modalidade='Volei', horario='Diurno'}",
                "Atleta{nome='Laura', modalidade='Basquete', horario='Noturno'}",
                "Atleta{nome='Rafael', modalidade='Futebol', horario='Diurno'}");

        assertEquals(saida, clube.obterAtletas());
    }

    @Test
    void deveRetornarTotalModalidades() {
        Clube clube = new Clube();
        clube.cadastrar("Davi", "Futebol", "Diurno");
        clube.cadastrar("Pedro", "Volei", "Diurno");
        clube.cadastrar("Laura", "Basquete", "Noturno");
        clube.cadastrar("Rafael", "Futebol", "Diurno");

        assertEquals(3, ModalidadeFactory.getTotalModalidades());
    }
}