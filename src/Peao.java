import java.util.ArrayList;

public class Peao extends Peca {
    private boolean primeiroMovimento;


    public Peao(String cor){
        super(cor);

    }
    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro){
        ArrayList<Posicao> possiveisMovimentos = new ArrayList<>();
        Posicao posicaoAtual= this.getPosicao();
        int posicaoNoTabuleiro = tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);

        ArrayList<Posicao> posicaoTabuleiro= tabuleiro.getListaDePosicaoes();

        if( this.getCor().equals("Preto")) {
            System.out.println("entrou");



            if (posicaoTabuleiro.get(posicaoNoTabuleiro + 8).getPeca()== null) {

                possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro + 8));
            }
                if (this.primeiroMovimento) {
                    System.out.println("entrou2");
                    if(posicaoTabuleiro.get(posicaoNoTabuleiro+ 16).getPeca()== null) {
                        possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro + 16));
                    }
                }
                if(posicaoTabuleiro.get(posicaoNoTabuleiro + 9) .getPeca().getCor().equals("Branco") & !verificaExtremidade(posicaoNoTabuleiro+1)){

                    possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro + 9) );
                }
                if(posicaoTabuleiro.get(posicaoNoTabuleiro + 7) .getPeca().getCor().equals("Branco") & !verificaExtremidade(posicaoNoTabuleiro)){

                    possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro + 7));
                }


        }else {

            if (this.getCor().equals("Branco")) {

                if (posicaoTabuleiro.get(posicaoNoTabuleiro - 8).getPeca() == null) {
                    possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro - 8));
                }
                    if (this.primeiroMovimento) {

                        if (posicaoTabuleiro.get(posicaoNoTabuleiro - 16).getPeca() == null) {

                            possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro - 16));
                        }
                    }
                    if(posicaoTabuleiro.get(posicaoNoTabuleiro - 9) .getPeca().getCor().equals("Preto") & !verificaExtremidade(posicaoNoTabuleiro)){

                        possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro - 9));
                    }
                    if(posicaoTabuleiro.get(posicaoNoTabuleiro - 7) .getPeca().getCor().equals("Preto") &  !verificaExtremidade(posicaoNoTabuleiro+1)){

                        possiveisMovimentos.add(posicaoTabuleiro.get(posicaoNoTabuleiro - 7));
                    }

            }
        }

        return possiveisMovimentos;
    }

    @Override
    public String toString() {
        return "Peao{" +
                "primeiroMovimento=" + primeiroMovimento +
                "} " + super.toString();
    }
}
