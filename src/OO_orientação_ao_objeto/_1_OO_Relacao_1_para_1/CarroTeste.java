package OO_orientação_ao_objeto._1_OO_Relacao_1_para_1;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.estaligado();
        System.out.println(c1.estaligado());

        c1.ligar();
        System.out.println(c1.estaligado());

        System.out.println(c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println(c1.motor.giros());
    }
}
