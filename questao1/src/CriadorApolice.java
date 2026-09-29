package questao1.src;
import java.math.BigDecimal;

public abstract class CriadorApolice {
    public final void emitir(String nomeSegurado, BigDecimal valorSegurado) {
        Apolice apolice = criarApolice(nomeSegurado, valorSegurado);
        apolice.definirPremioMensal(apolice.calcularPremioMensal());
        apolice.imprimirResumo();
    }

    protected abstract Apolice criarApolice(String nomeSegurado, BigDecimal valorSegurado);
}