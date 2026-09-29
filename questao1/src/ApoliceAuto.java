package questao1.src;
import java.math.BigDecimal;

public class ApoliceAuto extends Apolice {
    public ApoliceAuto(String nomeSegurado, BigDecimal valorVeiculo) {
        super(nomeSegurado, valorVeiculo);
    }

    @Override public String getLinhaProduto() {
        return "Auto";
    }
    @Override public String getDocumentosExigidos() {
        return "CNH e CRLV";
    }
    @Override public BigDecimal calcularPremioMensal() {
        return getValorSegurado().multiply(new BigDecimal("0.08"))
                .divide(new BigDecimal("12"), 2, java.math.RoundingMode.HALF_UP);
    }
}