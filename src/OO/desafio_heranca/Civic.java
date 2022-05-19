package OO.desafio_heranca;

import OO.desafio_heranca.Teste.Luxo;

public class Civic extends Carro implements Luxo {
    boolean ligarAr;

    public Civic() {
        super(205);
    }

    public Civic(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(38);
//        delta = 38;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;

    }

    @Override
    public void desligarAr() {
        ligarAr = false;

    }

    @Override
    public int getDelta() {

        if (ligarAr) {
            return 30;
        } else return 38;
    }
}
    /*    @Override
    void acelerar() {
        velocidadeAtual += 38;
    }*/

