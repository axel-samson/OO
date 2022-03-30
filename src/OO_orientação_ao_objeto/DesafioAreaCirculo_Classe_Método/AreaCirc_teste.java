package OO_orientação_ao_objeto.DesafioAreaCirculo_Classe_Método;

public class AreaCirc_teste {

    public static void main(String[] args) {

        AreaCirc_Funcao a1 = new AreaCirc_Funcao(17);
        System.out.println(a1.area());

        AreaCirc_Funcao a2 = new AreaCirc_Funcao(8);
        System.out.println(a2.area());

        System.out.println("\nvalor do PI determinado dentro da CLASSE AreaCirc " + AreaCirc_Funcao.pi);
        System.out.println("valor do PI dentro do MATH do proprio JAVA " + Math.PI);
    }
}
