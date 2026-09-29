package questao1.src;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApoliceVida extends Apolice {
    public ApoliceVida(String nomeSegurado, BigDecimal capitalSegurado) {
        super(nomeSegurado, capitalSegurado);
    }

    @Override
    public String getLinhaProduto() {
        return "Vida";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade e CPF";
    }

    @Override
    public BigDecimal calcularPremioMensal() {
        return getValorSegurado().multiply(new BigDecimal("0.03"))
                .divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP);
    }
}