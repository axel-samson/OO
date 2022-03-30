package OO_orientação_ao_objeto._1_OO_Relacao_1_para_1;

public class Motor {

    boolean ligado = false;
    double fatorInjecao = 1;

    int giros() {
        if (!ligado) {
            return 0;
        } else {
            return (int) Math.round(fatorInjecao * 3000);
        }
    }
}
