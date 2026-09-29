package questao1.src;
import java.math.BigDecimal;

public class CriadorApoliceAuto extends CriadorApolice {
    @Override
    protected Apolice criarApolice(String nomeSegurado, BigDecimal valorSegurado) {
        return new ApoliceAuto(nomeSegurado, valorSegurado);
    }
}