package OO.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", "Arnaldo", -45);

        p1.setIdade(230); //altera o valor da idade
        System.out.println(p1.getIdade()); //ler
        System.out.println(p1); //toString
        System.out.println(p1.getNomeCompleto());
    }
}
