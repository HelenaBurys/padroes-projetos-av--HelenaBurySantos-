package questao1.src;
import java.math.BigDecimal;

public abstract class Apolice {
    private final String nomeSegurado;
    private final BigDecimal valorSegurado;
    private BigDecimal premioMensal;

    protected Apolice(String nomeSegurado, BigDecimal valorSegurado) {
        this.nomeSegurado = nomeSegurado;
        this.valorSegurado = valorSegurado;
    }

    protected BigDecimal getValorSegurado() {
        return valorSegurado;
    }

    public abstract String getLinhaProduto();
    public abstract String getDocumentosExigidos();
    public abstract BigDecimal calcularPremioMensal();

    public final void imprimirResumo() {
        System.out.println("produto: " + getLinhaProduto());
        System.out.println("Segurado: " + nomeSegurado);
        System.out.printf("Prêmio mensal: R$ %.2f%n", premioMensal);
        System.out.println("Documento necessários : " + getDocumentosExigidos());
        System.out.println();
    }

    public final void definirPremioMensal(BigDecimal premioMensal) {
        this.premioMensal = premioMensal;
    }
}