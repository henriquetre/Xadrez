import java.util.ArrayList;

public class Cavalo extends Peca {
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
                if ((posicaoTabuleiro + 1) % 8 == 0 && !(
                        indice == posicaoTabuleiro - 15 ||
                                indice == posicaoTabuleiro - 6 ||
                                indice == posicaoTabuleiro + 10 ||
                                indice == posicaoTabuleiro + 17
                )) {
                    possiveisMovimentos.add(posicao);
                }
                //Coluna A
                else if ((posicaoTabuleiro) % 8 == 0 && !(
                        indice == posicaoTabuleiro - 17 ||
                                indice == posicaoTabuleiro - 10 ||
                                indice == posicaoTabuleiro + 6 ||
                                indice == posicaoTabuleiro + 15
                )
                ) {
                    possiveisMovimentos.add(posicao);
                }
                //Coluna B
                if ((posicaoTabuleiro - 1) % 8 == 0 && (
                        indice == posicaoTabuleiro - 10 ||
                                indice == posicaoTabuleiro + 6
                )) {
                    possiveisMovimentos.add(posicao);
                }

                //Coluna G
                if ((posicaoTabuleiro + 2) % 8 == 0 && !(
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

}
