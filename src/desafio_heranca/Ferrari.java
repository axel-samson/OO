package desafio_heranca;


public class Ferrari extends Carro {
    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }
}
