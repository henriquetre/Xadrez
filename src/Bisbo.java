import java.util.ArrayList;

public class Bisbo extends Peca{

    public Bisbo(String cor){
        super(cor);
    }
    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {
        Posicao posicaoAtual= this.getPosicao();
        int posicaoDoTabuleiro= tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);
       ArrayList<Posicao>possiveisMovimentos = new ArrayList<>();

        for (int i = (verificaExtremidade(posicaoDoTabuleiro) ? 64 : posicaoDoTabuleiro + 7 ); i < tabuleiro.getListaDePosicaoes().size() ; i+=7) {

            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos) || verificaExtremidade(i)  ){
                break;
            }


        }

        for (int i = (verificaExtremidade(posicaoDoTabuleiro+1) ? -1: posicaoDoTabuleiro - 7 ); i >=0 ; i-=7) {


            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos) || verificaExtremidade(i+1)  ){
                break;
            }


        }

        for (int i = (verificaExtremidade(posicaoDoTabuleiro+1) ? 64 : posicaoDoTabuleiro + 9 ); i < tabuleiro.getListaDePosicaoes().size() ; i+=9) {

            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos) || verificaExtremidade(posicaoDoTabuleiro+1)  ){
                break;
            }

        }
        for (int i = (verificaExtremidade(posicaoDoTabuleiro) ? -1 : posicaoDoTabuleiro -9 ); i >= 0 ; i-=9) {

            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos) || verificaExtremidade(i)  ){
                break;
            }
        }

//
        return possiveisMovimentos;
    }



}
