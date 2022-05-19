package OO.abstrato;

public class Cachorro extends Mamifero {
    @Override
    public String mover() {
        return super.mover();
    }

    @Override
    public String mamar() {
        return "Usando Leite";
    }
}
