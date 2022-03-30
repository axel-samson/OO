package OO_orientação_ao_objeto.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        /*monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.OESTE);
        monstro.andar(Direcao.NORTE);
        monstro.andar(Direcao.OESTE);*/

        System.out.println("monstro tem => " + monstro.life + " de vida");
        System.out.println("heroi tem => " + heroi.life + " de vida\n");

        /*o ataque do heroi será 3x mais forte*/
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        /*o ataque não ocorrerá pois o monstro saiu do "range" ao se movimentar*/
        monstro.andar(Direcao.NORTE);
        monstro.atacar(heroi);
        heroi.atacar(monstro);

        monstro.andar(Direcao.NORTE);
        System.out.println("monstro tem => " + monstro.life + " de vida");
        System.out.println("heroi tem => " + heroi.life + " de vida");


    }
}
