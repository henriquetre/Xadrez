import java.util.ArrayList;

public class Jogador {
    private String nome="";
    private String cor="";
    private double pontos;
    private String senha="";
    private ArrayList<Peca> pecas ;


    public Jogador (String nome, String senha){
        this.nome= nome;
        this.senha= senha;
        this.pecas= new ArrayList<>();
    }

    public boolean moverPeca( Peca peca, Posicao posicao, Tabuleiro tabuleiro, Jogador jogadorAdversario){


        Peca pecaAdverseraria=posicao.getPeca();
        boolean valida=  peca.mover(tabuleiro,posicao);
        if(pecaAdverseraria != null && valida){

            jogadorAdversario.pecas.remove(pecaAdverseraria);
        }

        return valida;
    }
    public boolean proporEmpate(Jogador jogador){
        return true;
    }
    public void desistir(){

    }


    public void setCor(String cor, Tabuleiro tabuleiro) {
        this.cor=cor;

        for (Posicao posicao:tabuleiro.getListaDePosicaoes()) {
            if(posicao.getPeca()!=null && posicao.getPeca().getCor().equals(this.cor)){
              this.pecas.add(posicao.getPeca());

            };

        }
    }

    private String getCor() {
        return cor;
    }

    public ArrayList<Peca> getPecas() {
        return pecas;
    }

}
