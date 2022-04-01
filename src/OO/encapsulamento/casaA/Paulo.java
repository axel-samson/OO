package OO.encapsulamento.casaA;

public class Paulo extends Ana {

    void testeAcessos() {
        Ana esposa = new Ana() {
            System.out.println(esposa.segredo);//o segredo está em private, não pode ser acessado
            System.out.println(esposa.facoDentroDeCasa);
            System.out.println(esposa.formaDeFalar);
            System.out.println(esposa.todosSabem);
        };
    }
}
