package OrientacaoObjetos.Heranca;

public class Jogador {

    int x, y;
    int vida = 100;

    void andar(Direcao direcao){
        if(direcao == Direcao.NORTE && (y >= 0 && y <= 100)) y--;
        else if(direcao == Direcao.SUL && (y >= 0 && y <= 100)) y++;
        else if(direcao == Direcao.LESTE && (x >= 0 && x <= 100)) x++;
        else if(direcao == Direcao.LESTE && (x >= 0 && x <= 100)) x--;
        else{
            x = 0;
            y = 0;
        }
    }

    void atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltay = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltay == 1) oponente.vida -= 10;
        else if(deltaX == 1 && deltay == 0) oponente.vida -= 10;

    }

}
