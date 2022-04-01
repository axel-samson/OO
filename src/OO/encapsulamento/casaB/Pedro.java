package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
    void testeAcessos() {
        Ana mae = new Ana() {
            System.out.println(mae.segredo);//o segredo está em private, não pode ser acessado
            System.out.println(mae.facoDentroDeCasa);//defult ou pacote só quem está no pacote.
            System.out.println(mae.formaDeFalar);//extends faz com que PEDRO herde de ANA
            System.out.println(mae.todosSabem);


        }
    }
}
