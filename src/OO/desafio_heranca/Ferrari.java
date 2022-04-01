package OO.desafio_heranca;


public class Ferrari extends Carro {
    public Ferrari() {
        super(100);
    }


    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 48;
    }

    /* se o @OVERRIDE estiver ativo, vai ignorar a função
    acelerar da classe Carro e
    criar uma função ACELERAR própria para FERRARI*/

  /*  @Override
    void acelerar() {
        velocidadeAtual += 48;
    }*/
}
