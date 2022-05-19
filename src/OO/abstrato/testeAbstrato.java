package OO.abstrato;

import OO.abstrato.Animal;
import OO.abstrato.Cachorro;

public class testeAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(((Cachorro) a).mover());
        System.out.println(((Cachorro) a).mamar());
        System.out.println(((Cachorro) a).respirar());
    }
}
