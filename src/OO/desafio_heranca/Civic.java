package OO.desafio_heranca;

public class Civic extends Carro {
    public Civic() {
    super(205);
    }

    public Civic(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 38;
    }

/*    @Override
    void acelerar() {
        velocidadeAtual += 38;
    }*/
}
