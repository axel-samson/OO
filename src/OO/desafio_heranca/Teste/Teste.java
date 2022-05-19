package OO.desafio_heranca.Teste;

import OO.desafio_heranca.Carro;
import OO.desafio_heranca.Civic;
import OO.desafio_heranca.Ferrari;

public class Teste {
    public static void main(String[] args) {
        Civic c1 = new Civic(205);

        c1.ligarAr();
        c1.acelerar();
        System.out.println(c1 + " " + c1.getClass().getSimpleName() + " aceleração com ar ativado");

        c1.desligarAr();
        c1.acelerar();
        System.out.println(c1 + " " + c1.getClass().getSimpleName() + " aceleração com ar desativado");

        System.out.println();
        Ferrari c2 = new Ferrari(340);

        c2.ligarTurbo();
        c2.acelerar();
        System.out.println(c2 + " " + c2.getClass().getSimpleName() + " aceleração com turbo ativado");

        c2.ligarAr();
        c2.acelerar();
        System.out.println(c2 + " " + c2.getClass().getSimpleName() + " aceleração com ar e turbo ativado");

        c2.desligarTurbo();
        c2.acelerar();
        System.out.println(c2 + " " + c2.getClass().getSimpleName() + " aceleração com ar ligado e turbo desativado");

        c2.desligarAr();
        c2.acelerar();
        System.out.println(c2 + " " + c2.getClass().getSimpleName() + " aceleração com ar e turbo desativados");
    }
}
