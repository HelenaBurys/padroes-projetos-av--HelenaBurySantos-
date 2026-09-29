package questao1.src;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ApoliceResidencial extends Apolice {
    public ApoliceResidencial(String nomeSegurado, BigDecimal valorImovel) {
        super(nomeSegurado, valorImovel);
    }
    @Override public String getLinhaProduto() {
        return "Residencial";
    }

    @Override public String getDocumentosExigidos() {
        return "Escritura ou contrato de locação";
    }

    @Override public BigDecimal calcularPremioMensal() {
        return getValorSegurado().multiply(new BigDecimal("0.015"))
                .divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP);
    }
}