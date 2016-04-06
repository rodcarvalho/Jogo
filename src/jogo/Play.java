package jogo;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.ShapeRenderer;
import org.newdawn.slick.state.*;
import org.newdawn.slick.tiled.TiledMap;


public class Play extends BasicGameState {
    protected TiledMap mapa;
    protected Boolean sair = false;
    protected Animation vidor, cima,baixo,andandoPraEsquerda,andandoPraDireita;
    protected int [] duracao = {150, 150,150};
    protected float x=0;
    protected float y=0;

    public Play(int state){}
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        mapa = new TiledMap("data/casa.tmx");
        Jogador j = new Jogador();
        Image [] deFrente = {new Image("data/VidorFrente1.png"),new Image("data/VidorFrente2.png"),new Image("data/VidorFrente3.png")};
        Image [] deCostas = {new Image("data/VidorCostas1.png"),new Image("data/VidorCostas2.png"),new Image("data/VidorCostas3.png")};
        Image [] direita = {new Image("data/VidorDireita1.png"),new Image("data/VidorDireita2.png"),new Image("data/VidorDireita3.png")};
        Image [] esquerda = {new Image("data/VidorEsquerda1.png"),new Image("data/VidorEsquerda2.png"),new Image("data/VidorEsquerda3.png")};
        
        cima = new Animation(deCostas,duracao,false);
        baixo = new Animation(deFrente,duracao,false);
        andandoPraDireita = new Animation(direita,duracao,false);
        andandoPraEsquerda = new Animation(esquerda,duracao,false);
        vidor = baixo;
        
        
    }
    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        mapa.render(0, 0);
        vidor.draw(x,y);
        
    }
    public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        Input input = gc.getInput();
        if(input.isKeyDown(Input.KEY_S)){
            vidor = baixo;
            vidor.update(delta);
            y+=0.5;
        }
        else if(input.isKeyDown(Input.KEY_W)){
            vidor=cima;
            vidor.update(delta);
            y-=0.5;
        }
        else if(input.isKeyDown(Input.KEY_D)){
            vidor = andandoPraDireita;
            vidor.update(delta);
            x+=0.5;
        }
        else if(input.isKeyDown(Input.KEY_A)){
            vidor = andandoPraEsquerda;
            vidor.update(delta);
            x-=0.5;
        }
    } 
    @Override
    public int getID(){
        return 1;
    }
}
