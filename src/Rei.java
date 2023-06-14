import java.util.ArrayList;

public class Rei extends Peca{

    private boolean primeiroMov;


    public Rei(String cor){
        super(cor);
    }

    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {

        Posicao posicaoAtual= this.getPosicao();
        int posicaoDoTabuleiro= tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);
        ArrayList<Posicao>possiveisMovimentos = new ArrayList<>();

        for (Posicao posicao: tabuleiro.getListaDePosicaoes()) {
            int indice = tabuleiro.getListaDePosicaoes().indexOf(posicao);
            if(indice == posicaoDoTabuleiro -9 || indice == posicaoDoTabuleiro -8 || indice == posicaoDoTabuleiro - 7
            || indice == posicaoDoTabuleiro -1 || indice == posicaoDoTabuleiro + 1 || indice == posicaoDoTabuleiro + 7
                    ||indice == posicaoDoTabuleiro + 8 || indice == posicaoDoTabuleiro + 9
            ){
                if (verificaExtremidade(posicaoDoTabuleiro+1) && !(
                        indice == posicaoDoTabuleiro -7 ||
                                indice == posicaoDoTabuleiro +1||
                                indice == posicaoDoTabuleiro + 9
                )) {
                  verificaPeca(posicao,possiveisMovimentos);
                }
                //Coluna A
                else if (verificaExtremidade(posicaoDoTabuleiro) && !(
                        indice == posicaoDoTabuleiro + 7 ||
                                indice == posicaoDoTabuleiro - 1 ||
                                indice == posicaoDoTabuleiro - 9
                )
                ) {
                    verificaPeca(posicao,possiveisMovimentos);
                }
            }


        }
        return possiveisMovimentos ;
    }
}
