import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Posicao> listaDePosicoes= new ArrayList<>();


    public Tabuleiro(){
        for (int i = 0; i < 64 ; i++) {
            listaDePosicoes.add(new Posicao());
         if(i >= 8 && i<= 15){
             listaDePosicoes.get(i).setPeca(new Peao("Preto"));
         }
            if(i >= 48 && i<= 55){
                listaDePosicoes.get(i).setPeca(new Peao("Branco"));
            }
            if(i==0 || i==7){
                listaDePosicoes.get(i).setPeca(new Torre("Preto"));
            }
            if(i==56 || i==63){
                listaDePosicoes.get(i).setPeca(new Torre("Branco"));
            }
            if(i==1 || i==6){
                listaDePosicoes.get(i).setPeca(new Cavalo("Preto"));
            }
            if(i==57 || i==62){
                listaDePosicoes.get(i).setPeca(new Cavalo("Branco"));
            }
            if(i==2 || i==5){
                listaDePosicoes.get(i).setPeca(new Bisbo("Preto"));
            }
            if(i==58 || i==61){
                listaDePosicoes.get(i).setPeca(new Bisbo("Branco"));
            }
            if(i==3){
                listaDePosicoes.get(i).setPeca(new Rainha("Preto"));
            }
            if(i==59){
                listaDePosicoes.get(i).setPeca(new Rainha("Branco"));
            }
            if(i==4){
                listaDePosicoes.get(i).setPeca(new Rei("Preto"));
            }
            if(i==60){
                listaDePosicoes.get(i).setPeca(new Rei("Branco"));
            }

        }


    }
    public void removerPeca(Posicao posicao){

    }

    public ArrayList<Posicao> getListaDePosicaoes() {
        return listaDePosicoes;
    }
}
