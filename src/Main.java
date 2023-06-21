import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Romario", "123");
        Jogador j2 = new Jogador("Roberto", "456");
        Tabuleiro tabuleiro= new Tabuleiro();
        j1.setCor("Branco", tabuleiro);
        j2.setCor("Preto", tabuleiro);
        // Escolha peça
        System.out.println(j1.getPecas());
        int escolha= sc.nextInt();
        Peca peca= j1.getPecas().get(escolha);
        System.out.println(peca);

        // Escolha a posição do movimento
        ArrayList<Posicao> posicoes= peca.possiveisMovimentos(tabuleiro);
        System.out.println(posicoes);
        int escolhaPosicao= sc.nextInt();
        Posicao posicao= posicoes.get(escolhaPosicao);

        // Movimentação da peça escolhida para a posição desejada
        j1.moverPeca(peca,posicao,tabuleiro,j2);

        validarVitoria(j2);


    }
    private static boolean validarVitoria(Jogador adversario){
        for (Peca peca: adversario.getPecas()) {
            if(peca instanceof Rei){
                return false;
            }
        }
        return true;
    }
}
