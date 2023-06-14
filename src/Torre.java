import java.util.ArrayList;

public class Torre extends Peca {
    private boolean primeiroMov;

    public Torre(String cor){
        super(cor);
    }
    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {


        Posicao posicaoAtual= this.getPosicao();
        int posicaoDoTabuleiro= tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);
        ArrayList<Posicao>possiveisMovimentos = new ArrayList<>();


        for (int i = posicaoDoTabuleiro+8; i < tabuleiro.getListaDePosicaoes().size() ; i+=8) {

            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos)){
                break;
            }


        }

        for (int i = posicaoDoTabuleiro-8; i >= 0 ; i-=8) {


            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos)){
                break;
            }


        }

        for (int i = (verificaExtremidade(posicaoDoTabuleiro + 1) ? 64 : posicaoDoTabuleiro ++ ); i < tabuleiro.getListaDePosicaoes().size() ; i++) {

            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos) || verificaExtremidade(i+1) ){
                break;
            }

        }
        for (int i = (verificaExtremidade(posicaoDoTabuleiro) ? -1 : posicaoDoTabuleiro - 1 ); i >= 0 ; i--) {

            if(verificaPeca(tabuleiro.getListaDePosicaoes().get(i),possiveisMovimentos) || verificaExtremidade(i)  ){
                break;
            }
        }

//
        return possiveisMovimentos;
    }
}
