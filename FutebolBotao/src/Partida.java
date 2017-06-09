import java.util.Scanner;

public class Partida {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
	    int n;
	    String m;

	    Gol placar = new Gol();
	    Jogador goleiro = new Jogador("Magrão",1,"A");
	    Jogador zagueiroD = new Jogador("Ronaldo Alves",2,"A");
	    Jogador zagueiroE = new Jogador("Durval",4,"A");
	    Atacante atacanteC = new Atacante("André",9,"A");
	    
	    System.out.printf("Começa o jogo!\n");
	    System.out.printf("O goleiro %s está com a bola!\n",goleiro.getNome());
	    System.out.printf("%s vai tocar a bola para: digite 1 para %s, ou 2 para %s \n", goleiro.getNome(), zagueiroD.getNome(), zagueiroE.getNome());
	    n = ler.nextInt();
	    
	    if (n == 1){
	    	System.out.printf("%s tocou para %s \n", goleiro.getNome(), zagueiroD.getNome());
	    }
	    if (n == 2){
	    	System.out.printf("%s tocou para %s \n", goleiro.getNome(), zagueiroE.getNome());
	    }
	    
	    atacanteC.chutarGol(placar);
	    m = placar.placar();
	    
	    System.out.printf(m);
	    
	  }
}
