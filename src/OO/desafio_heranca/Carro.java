package OO.desafio_heranca;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta = 5; /*prestar sempre atenção nesta variável*/

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += getDelta();
        }

    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + " Km/h";
    }

}

