import java.util.Scanner;

public class Partida {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
	    int escolhas = 0;
	    int tempo = 0;
	    String m = "";
	    
	    // Time Sport
	    Goleiro goleiroA = new Goleiro("Magrão",1);
	    Zagueiro zagueiroEA = new Zagueiro("Durval",4);
	    Zagueiro zagueiroDA = new Zagueiro("Ronaldo Alves",2);
	    Lateral lateralEA = new Lateral("Mena",6);
	    Lateral lateralDA = new Lateral("Samuel Xavier",3);
	    Volante volanteEA = new Volante("Fabrício",5);
	    Volante volanteDA = new Volante("Ritchely",7);
	    Meia meiaEA = new Meia("Diego Souza", 10);
	    Meia meiaDA = new Meia("Thomás",8);
	    Atacante atacanteEA = new Atacante("Oswaldo", 11);
	    Atacante atacanteDA = new Atacante("André",9);
	    
	    Time sport = new Time("Sport",goleiroA,zagueiroEA,zagueiroDA,lateralEA,lateralDA,volanteEA,volanteDA,meiaEA,meiaDA,atacanteEA,atacanteDA);
	    sport.pontuacao = 0;
	    
	    // Time Brasil
	    Goleiro goleiroB = new Goleiro("Weverton",1);
	    Zagueiro zagueiroEB = new Zagueiro("David Luiz",4);
	    Zagueiro zagueiroDB = new Zagueiro("Tiago Silva",2);
	    Lateral lateralEB = new Lateral("Marcelo",6);
	    Lateral lateralDB = new Lateral("Daniel Alves",3);
	    Volante volanteEB = new Volante("Cazemiro",5);
	    Volante volanteDB = new Volante("Paulinho",7);
	    Meia meiaEB = new Meia("Renato Augusto", 10);
	    Meia meiaDB = new Meia("Felipe Coutinho",8);
	    Atacante atacanteEB = new Atacante("Neymar", 11);
	    Atacante atacanteDB = new Atacante("Gabriel Jesus",9);
	    
	    Time brasil = new Time("Sport",goleiroB,zagueiroEB,zagueiroDB,lateralEB,lateralDB,volanteEB,volanteDB,meiaEB,meiaDB,atacanteEB,atacanteDB);
	    brasil.pontuacao = 0;
	    
	    Gol gol = new Gol(sport,brasil);
	
	    System.out.printf("Começa o jogo!\n");
	    //Primeiro Tempo
	    while(tempo < 45){
	    	
	    }
	    //Segundo Tempo
	    while(tempo < 90){
	    	
	    }
	    System.out.printf("O goleiro %s está com a bola!\n",sport.goleiro.getNome());
	    sport.goleiro.posseBola = true;
	    System.out.printf("%s vai tocar a bola para: digite 1 para %s, ou 2 para %s \n", sport.goleiro.getNome(), sport.zagueiroD.getNome(), sport.zagueiroE.getNome());
	    escolhas = ler.nextInt();
	    
	    if (escolhas == 1){
	    	System.out.printf("%s tocou para %s \n", sport.goleiro.getNome(), sport.zagueiroD.getNome());
	    }
	    if (escolhas == 2){
	    	System.out.printf("%s tocou para %s \n", sport.goleiro.getNome(), sport.zagueiroE.getNome());
	    }
	    
	    m = gol.placar();
	    
	    System.out.printf(m);

	    
	  }
}
