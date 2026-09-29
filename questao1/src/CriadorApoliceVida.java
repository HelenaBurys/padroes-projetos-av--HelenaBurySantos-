package questao1.src;
import java.math.BigDecimal;

public class CriadorApoliceVida extends CriadorApolice {
    @Override
    protected Apolice criarApolice(String nomeSegurado, BigDecimal valorSegurado) {
        return new ApoliceVida(nomeSegurado, valorSegurado);
    }
}