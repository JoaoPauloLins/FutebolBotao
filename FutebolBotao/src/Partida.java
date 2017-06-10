import java.util.Scanner;

public class Partida {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
	    int n;
	    String m;

	    Gol gol = new Gol();
	    
	    Goleiro goleiro = new Goleiro("Magrão",1,"A");
	    Zagueiro zagueiroE = new Zagueiro("Durval",4,"A");
	    Zagueiro zagueiroD = new Zagueiro("Ronaldo Alves",2,"A");
	    Lateral lateralE = new Lateral("Mena",6,"A");
	    Lateral lateralD = new Lateral("Samuel Xavier",3,"A");
	    Volante volanteE = new Volante("Fabrício",5,"A");
	    Volante volanteD = new Volante("Ritchely",7,"A");
	    Meia meiaE = new Meia("Diego Souza", 10,"A");
	    Meia meiaD = new Meia("Thomás",8,"A");
	    Atacante atacanteE = new Atacante("Oswaldo", 11, "A");
	    Atacante atacanteD = new Atacante("André",9,"A");
	    
	    Time sport = new Time("Sport",goleiro,zagueiroE,zagueiroD,lateralE,lateralD,volanteE,volanteD,meiaE,meiaD,atacanteE,atacanteD);
	    
	
	    System.out.printf("Começa o jogo!\n");
	    System.out.printf("O goleiro %s está com a bola!\n",sport.goleiro.getNome());
	    sport.goleiro.posseBola = true;
	    System.out.printf("%s vai tocar a bola para: digite 1 para %s, ou 2 para %s \n", sport.goleiro.getNome(), sport.zagueiroD.getNome(), sport.zagueiroE.getNome());
	    n = ler.nextInt();
	    
	    if (n == 1){
	    	System.out.printf("%s tocou para %s \n", sport.goleiro.getNome(), sport.zagueiroD.getNome());
	    }
	    if (n == 2){
	    	System.out.printf("%s tocou para %s \n", sport.goleiro.getNome(), sport.zagueiroE.getNome());
	    }
	    
	    m = gol.placar();
	    
	    System.out.printf(m);

	    
	  }
}
