package OO_orientação_ao_objeto.desafio_heranca;

public class Civic extends Carro {
    Civic() {
    super(205);
    }

    Civic(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 38;
    }

/*    @Override
    void acelerar() {
        velocidadeAtual += 38;
    }*/
}
