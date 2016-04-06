package jogo;
import org.newdawn.slick.*;

public class Jogador extends Personagem  {
    protected int quantidadeDeVidas;
    protected Animation vidor, andandoPraFrente,andandoPraTras,andandoPraEsquerda,andandoPraDireita;
    protected SpriteSheet cima, baixo, esquerda, direita;
    
    public Jogador() throws SlickException{
        quantidadeDeVidas=3;
        super.setPosicaoX(100);
        super.setPosicaoY(100);
        super.setPontosDeVida(6);
        super.setDano(1);
        cima = new SpriteSheet("data/ParaFrente.png", 29, 28);
        baixo = new SpriteSheet("data/ParaTras.png", 29, 28);
        esquerda = new SpriteSheet("data/ParaEsquerda.png", 29, 28);
        direita = new SpriteSheet("data/ParaDireita.png", 29, 28);
        
        andandoPraFrente = new Animation(cima, 200);
        andandoPraTras = new Animation(baixo, 200);
        andandoPraEsquerda = new Animation(esquerda, 200);
        andandoPraDireita = new Animation(direita, 200);
    }
    
        public void movendoPraCima(){
            vidor = andandoPraFrente;
            super.posicaoY+=5;
        }
        public void movendoPraBaixo(){
            vidor = andandoPraTras;
            super.posicaoY-=5;
        }
        public void movendoPraDireita(){
            vidor = andandoPraDireita;
            super.posicaoX+=5;
        }
        public void movendoPraEsquerda(){
            vidor = andandoPraEsquerda;
            super.posicaoX-=5;
        }

    public int getQuantidadeDeVidas() {
        return quantidadeDeVidas;
    }

    public void setQuantidadeDeVidas(int QuandoDeVidas) {
        this.quantidadeDeVidas = QuandoDeVidas;
    }

    public Animation getVidor() {
        return vidor;
    }

    public void setVidor(Animation Vidor) {
        this.vidor = Vidor;
    }

    public Animation getAndandoPraFrente() {
        return andandoPraFrente;
    }

    public void setAndandoPraFrente(Animation andandoPraFrente) {
        this.andandoPraFrente = andandoPraFrente;
    }

    public Animation getAndandoPraTras() {
        return andandoPraTras;
    }

    public void setAndandoPraTras(Animation andandoPraTras) {
        this.andandoPraTras = andandoPraTras;
    }

    public Animation getAndandoPraEsquerda() {
        return andandoPraEsquerda;
    }

    public void setAndandoPraEsquerda(Animation andandoPraEsquerda) {
        this.andandoPraEsquerda = andandoPraEsquerda;
    }

    public Animation getAndandoPraDireita() {
        return andandoPraDireita;
    }

    public void setAndandoPraDireita(Animation andandoPraDireita) {
        this.andandoPraDireita = andandoPraDireita;
    }

}