import java.util.ArrayList;

public class Bisbo extends Peca{


    @Override
    public ArrayList<Posicao> possiveisMovimentos(Tabuleiro tabuleiro) {
        Posicao posicaoAtual= this.getPosicao();
        int posicaoDoTabuleiro= tabuleiro.getListaDePosicaoes().indexOf(posicaoAtual);
       ArrayList<Posicao>possiveisMovimentos = new ArrayList<>();

        for (int i = (posicaoDoTabuleiro % 8==0 ? 64 : posicaoDoTabuleiro + 7 ); i < tabuleiro.getListaDePosicaoes().size() ; i+=7) {
            possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(i));
            if(i % 8 ==0){
                break;
            }


        }
        for (int i = (posicaoDoTabuleiro % 8==0 ? -1: posicaoDoTabuleiro - 7 ); i >=0 ; i-=7) {
           possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(i));

            if(i % 8 ==0){
                break;
            }

            verificaPeca(posicaoAtual,possiveisMovimentos);

        }
        for (int i = (posicaoDoTabuleiro % 8==0 ? 64 : posicaoDoTabuleiro + 9 ); i < tabuleiro.getListaDePosicaoes().size() ; i+=9) {
            possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(i));
            if((i+1) % 8 ==0){
                break;
            }

        }
        for (int i = (posicaoDoTabuleiro % 8==0 ? -1 : posicaoDoTabuleiro -9 ); i >= 0 ; i-=9) {
            possiveisMovimentos.add(tabuleiro.getListaDePosicaoes().get(i));
            if(i % 8 ==0){
                break;
            }
        }

//        for (Posicao posicao1:tabuleiro.getListaDePosicaoes()) {
//            int cont = tabuleiro.getListaDePosicaoes().indexOf(posicao1);
//
//
//           if((cont - posicaoDoTabuleiro)% 7 ==0){
//               possiveisMovimentos.add(posicao1);
//
//           }
//           else if((cont - posicaoDoTabuleiro)% 9 ==0){
//                possiveisMovimentos.add(posicao1);
//
//            }
//
//
//        }
        return null;
    }



}
