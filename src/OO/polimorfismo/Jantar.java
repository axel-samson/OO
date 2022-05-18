package OO.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.50);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijao ingrediente2 = new Feijao(0.15);

        System.out.println("convidado está pesado " + convidado.getPeso());

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.println("convidado come " + ingrediente1.getPeso() + "g de " + ingrediente1.getClass().getSimpleName() + " com " + ingrediente2.getPeso() + "g de " + ingrediente2.getClass().getSimpleName());
        System.out.println("convidado está pesado " + convidado.getPeso());
        System.out.println();

        Sorvete sobremesa = new Sorvete(0.4);

        convidado.comer(sobremesa);
        System.out.println("convidado come " + sobremesa.getPeso() + "g de " + sobremesa.getClass().getSimpleName());
        System.out.println("convidado está pesado " + convidado.getPeso());
    }
}
