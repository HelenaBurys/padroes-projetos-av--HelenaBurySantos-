package questao1.src;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        CriadorApolice criadorAuto = new CriadorApoliceAuto();
        CriadorApolice criadorResidencial = new CriadorApoliceResidencial();
        CriadorApolice criadorVida = new CriadorApoliceVida();

        criadorAuto.emitir("Helena Bury", new BigDecimal("70000"));
        criadorResidencial.emitir("Aline Matoso", new BigDecimal("500000"));
        criadorVida.emitir("Pedro Henrique", new BigDecimal("900000"));
    }
}