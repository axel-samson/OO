package OO._1_Relacao_1_para_1;

public class Carro {

    Motor motor = new Motor();
    /*condição do IF que impede que o carro
     RECEBA mais de 1(injecao) e acelere d+ o motor*/
    void acelerar() {
        if (motor.fatorInjecao < 2.5) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
    /*condição do IF para evitar que o carro desligue
    caso haja freios a mais que gerem a injeção a zerar
    (desligar o carro)*/
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaligado() {
        return motor.ligado;
    }
}
