package OO_orientação_ao_objeto.heranca;

public class Jogador {
    int life = 100;
    int x;
    int y;

    boolean atacar(Jogador oponente) {

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.life -= 10;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.life -= 10;
        } else {
            return false;
        }
        return true;
    }

    boolean andar(Direcao direcao) {
        switch (direcao) {
            case NORTE -> y++;
            case SUL -> y--;
            case OESTE -> x--;
            case LESTE -> {
                x++;
                break;
            }
        }

        return true;
    }


}
