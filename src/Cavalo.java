import java.util.ArrayList;

public class Cavalo extends Peca {

    public Cavalo(String cor){
        super(cor);
    }

    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {
        ArrayList<Posicao> possiveisMovimentos = new ArrayList<>();
        Posicao posicaoAtual = this.getPosicao();
        int posicaoTabuleiro = tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);




        for (Posicao posicao : tabuleiro.getListaDePosicaoes()) {
            int indice = tabuleiro.getListaDePosicaoes().indexOf(posicao);

            if (tabuleiro.getListaDePosicaoes().indexOf(posicao) == posicaoTabuleiro - 17 ||
                    indice == posicaoTabuleiro - 15 ||
                    indice == posicaoTabuleiro - 10 ||
                    indice == posicaoTabuleiro - 6 ||
                    indice == posicaoTabuleiro + 15 ||
                    indice == posicaoTabuleiro + 17 ||
                    indice == posicaoTabuleiro + 6 ||
                    indice == posicaoTabuleiro + 10) {


                //Coluna H
                if (verificaExtremidade(posicaoTabuleiro+1) && !(
                        indice == posicaoTabuleiro - 15 ||
                                indice == posicaoTabuleiro - 6 ||
                                indice == posicaoTabuleiro + 10 ||
                                indice == posicaoTabuleiro + 17
                )) {
                    verificaPeca(posicao,possiveisMovimentos);
                }
                //Coluna A
                else if (verificaExtremidade(posicaoTabuleiro) && !(
                        indice == posicaoTabuleiro - 17 ||
                                indice == posicaoTabuleiro - 10 ||
                                indice == posicaoTabuleiro + 6 ||
                                indice == posicaoTabuleiro + 15
                )
                ) {
                    verificaPeca(posicao,possiveisMovimentos);
                }
                //Coluna B
                if (verificaExtremidade(posicaoTabuleiro-1) && (
                        indice == posicaoTabuleiro - 10 ||
                                indice == posicaoTabuleiro + 6
                )) {
                    verificaPeca(posicao,possiveisMovimentos);
                }

                //Coluna G
                if (verificaExtremidade(posicaoTabuleiro+2) && !(
                        indice == posicaoTabuleiro - 15 ||
                                indice == posicaoTabuleiro
                )) {

                }
                // Não é de canto
                else {
                    verificaPeca(posicao, possiveisMovimentos);

                }
            }
        }
            return possiveisMovimentos;
        }

    @Override
    public String toString() {
        return "Cavalo "+ super.toString();
    }
}
