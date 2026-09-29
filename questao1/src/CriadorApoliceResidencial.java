package questao1.src;
import java.math.BigDecimal;

public class CriadorApoliceResidencial extends CriadorApolice {
    @Override
    protected Apolice criarApolice(String nomeSegurado, BigDecimal valorSegurado) {
        return new ApoliceResidencial(nomeSegurado, valorSegurado);
    }
}