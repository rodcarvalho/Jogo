//Autores: Francisco Anderson Lopes de Sousa, Gustavo Diniz Targino, Rodrigo Barreto de Carvalho
package jogo;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Jogo extends StateBasedGame {
    public static final String gamename = "The Sword Of Vidor";
    public static final int menu = 0;
    public static final int play = 1;
    public Jogo(String gamename){
	super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
    }
    
    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(menu).init(gc, this);
        this.getState(play).init(gc, this);
        this.enterState(menu);
    }
    
    public static void main(String[] args) {
        AppGameContainer appgc;
        try{
            appgc = new AppGameContainer(new Jogo(gamename));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        }catch(SlickException e){
            e.printStackTrace();
        }
        
    }
    
}
