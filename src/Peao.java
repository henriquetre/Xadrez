import java.util.ArrayList;

public class Peao extends Peca {
    private boolean primeiroMovimento;

    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList<Posicao> possiveisMovimentos = new ArrayList<>();
        Posicao posicaoAtual= this.getPosicao();
        int posicaoNoTabuleiro = tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);
        if(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro+ 8).getPeca()== null) {
            if (this.getCor().equals("Preto")) {
                possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro + 8));
                if (this.primeiroMovimento) {
                    if(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro+ 16).getPeca()== null) {
                        possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro + 16));
                    }
                }
            }
            if(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro + 9) .getPeca().getCor().equals("Branco")){
                possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro + 9));
            }
        }else {
            if (tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro - 8).getPeca() == null) {
                if (this.getCor().equals("Branco")) {
                    possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro - 8));
                    if (this.primeiroMovimento) {
                        if (tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro - 16).getPeca() == null) {
                            possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(posicaoNoTabuleiro - 16));
                        }
                    }
                }
            }
        }

        return null;
    }
}
