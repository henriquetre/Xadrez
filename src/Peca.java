import java.util.ArrayList;

public  abstract class Peca {
    private String cor="";
    private Posicao posicao;


    public Posicao getPosicao() {
        return posicao;
    }

    public void mover(Tabuleiro tabuleiro, Posicao posicao){
        ArrayList<Posicao> possiveisPosicoes = possiveisMovimentos(tabuleiro);

        for (Posicao posicao1: possiveisPosicoes) {
            if (posicao1 == posicao) {
               posicao.setPeca(this);
               // Atribuindo a peça para a nova posição no tabuleiro
                this.posicao.setPeca(null);
                // Removendo a peça da posição anterior
                this.posicao = posicao;
                // Trocando a posição atual da peça
                break;
            }
        }

    }

    public abstract ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro);

//    public abstract char icone ();


    public String getCor() {
        return cor;
    }

    public boolean verificaPeca(Posicao posicao, ArrayList<Posicao> possiveisMovimentos) {

        if (posicao.getPeca() == null) {
            possiveisMovimentos.add(posicao);
            return false;
        } else if (!posicao.getPeca().getCor().equals(this.getCor())) {
                possiveisMovimentos.add(posicao);
            }
            return true;
        }

}

