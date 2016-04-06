package jogo;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.newdawn.slick.SlickException;

public class Menu extends BasicGameState {
    Image menu, menuInicial, jogar, sair;
    public Menu(int state){
    }
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
        menuInicial = new Image("data/menu.jpg");
        jogar = new Image("data/menu1.jpg");
        sair = new Image("data/menu2.jpg");
        menu = menuInicial;
    }
    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
        g.drawImage(menu, 0, 0);
    }
    @Override
    public void update (GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        Input input = gc.getInput();
        if(input.isKeyDown(Input.KEY_ENTER)){menu = jogar;}
        if (menu == jogar || menu == sair){
            if((xpos > 160 && xpos < 240)&&(ypos < 190 && ypos > 150)){
                menu = jogar;
                if(Mouse.isButtonDown(0)){sbg.enterState(1);}
            }
            if((xpos > 400 && xpos < 455)&&(ypos < 190 && ypos > 150)){
                menu = sair;
                if(Mouse.isButtonDown(0)){System.exit(0);}
            }
        }
    }
    @Override
    public int getID(){
        return 0;
    }
}