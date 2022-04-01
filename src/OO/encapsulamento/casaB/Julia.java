package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Julia {
    void testeAcessos() {
        Ana sogra = new Ana() {
            System.out.println(sogra.segredo);//o segredo está em private, não pode ser acessado
            System.out.println(sogra.formaDeFalar);//não sabe devido ao protected (n tem EXTENDS = não herda)
            System.out.println(sogra.todosSabem);//public todos sabem
            System.out.println(sogra.facoDentroDeCasa);//defult ou pacote só quem está no pacote.



        }
    }
}
