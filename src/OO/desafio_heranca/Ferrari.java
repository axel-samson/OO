package OO.desafio_heranca;


import OO.desafio_heranca.Teste.Esportivo;
import OO.desafio_heranca.Teste.Luxo;

public class Ferrari extends Carro implements Esportivo, Luxo {
    private boolean ligarTurbo;
    private boolean ligarAr;

    public Ferrari() {
        super(200);
    }


    public Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(30);
//        delta = 30;
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;

    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
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
        if (ligarTurbo && !ligarAr) {
            return 50;
        } else if (ligarTurbo && ligarAr) {
            return 40;
        } else if (!ligarTurbo && ligarAr) {
            return 35;
        }
        return 30;
    }
}
/* se o @OVERRIDE estiver ativo, vai ignorar a função
    acelerar da classe Carro e
    criar uma função ACELERAR própria para FERRARI*/

  /*  @Override
    void acelerar() {
        velocidadeAtual += 48;
    }*/

