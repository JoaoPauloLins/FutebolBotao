import java.util.Scanner;

public class Partida {
	
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
	    int escolhas = 0;
	    int tempo = 0;
	    String sorteio ="";
	    String m = "";
	    
	    // Time Sport
	    Goleiro goleiroA = new Goleiro("Magrão",1,"Sport");
	    Zagueiro zagueiroEA = new Zagueiro("Durval",4,"Sport");
	    Zagueiro zagueiroDA = new Zagueiro("Ronaldo Alves",2,"Sport");
	    Lateral lateralEA = new Lateral("Mena",6,"Sport");
	    Lateral lateralDA = new Lateral("Samuel Xavier",3,"Sport");
	    Volante volanteEA = new Volante("Fabrício",5,"Sport");
	    Volante volanteDA = new Volante("Ritchely",7,"Sport");
	    Meia meiaEA = new Meia("Diego Souza", 10,"Sport");
	    Meia meiaDA = new Meia("Thomás",8,"Sport");
	    Atacante atacanteEA = new Atacante("Oswaldo", 11,"Sport");
	    Atacante atacanteDA = new Atacante("André",9,"Sport");
	    
	    Time sport = new Time("Sport",goleiroA,zagueiroEA,zagueiroDA,lateralEA,lateralDA,volanteEA,volanteDA,meiaEA,meiaDA,atacanteEA,atacanteDA);
	    sport.pontuacao = 0;
	    
	    // Time Brasil
	    Goleiro goleiroB = new Goleiro("Weverton",1,"Brasil");
	    Zagueiro zagueiroEB = new Zagueiro("David Luiz",4,"Brasil");
	    Zagueiro zagueiroDB = new Zagueiro("Tiago Silva",2,"Brasil");
	    Lateral lateralEB = new Lateral("Marcelo",6,"Brasil");
	    Lateral lateralDB = new Lateral("Daniel Alves",3,"Brasil");
	    Volante volanteEB = new Volante("Cazemiro",5,"Brasil");
	    Volante volanteDB = new Volante("Paulinho",7,"Brasil");
	    Meia meiaEB = new Meia("Renato Augusto", 10,"Brasil");
	    Meia meiaDB = new Meia("Felipe Coutinho",8,"Brasil");
	    Atacante atacanteEB = new Atacante("Neymar", 11,"Brasil");
	    Atacante atacanteDB = new Atacante("Gabriel Jesus",9,"Brasil");
	    
	    Time brasil = new Time("Brasil",goleiroB,zagueiroEB,zagueiroDB,lateralEB,lateralDB,volanteEB,volanteDB,meiaEB,meiaDB,atacanteEB,atacanteDB);
	    brasil.pontuacao = 0;
	    
	    Gol gol = new Gol(sport,brasil);
	    Bola bola = new Bola(sport,brasil);
	    Jogador j;
	    String t;
	
	    System.out.println("Começa o jogo!");
	    if (Math.random() < 0.5){
	    	sport.goleiro.posseBola = true;
	    	System.out.printf("O %s começa com a posse de bola! \n",sport.getNome());
	    	sorteio = "A";
	    }
	    else{
	    	brasil.goleiro.posseBola = true;
	    	System.out.printf("O %s começa com a posse de bola! \n",brasil.getNome());
	    	sorteio = "B";
	    }
	    //Primeiro Tempo
	    do{
	    	Jogador k;
	    	j = bola.quemBola();
	    	k = j;
	    	t = bola.timeBola();
		    System.out.println(j.getNome()+" está com a bola!");
		    if(t.equals("Sport")){
		    	System.out.println(j.getNome()+" pode tocar para:");
		    	if (j instanceof Goleiro){
		    		System.out.println(zagueiroEA.getNome()+" ("+zagueiroEA.getNumeroCamisa()+")");
		    		System.out.println(zagueiroDA.getNome()+" ("+zagueiroDA.getNumeroCamisa()+")");
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if (escolhas == zagueiroEA.getNumeroCamisa()){
		    			j = zagueiroEA;
		    		}
		    		else {
		    			j = zagueiroDA;
		    		}
		    		goleiroA.passeBola(j, escolhas);
		    	}
		    	else if(j instanceof Zagueiro){
		    		if(j.getNumeroCamisa() == 4){
		    			System.out.println(zagueiroDA.getNome()+" ("+zagueiroDA.getNumeroCamisa()+")");
		    			System.out.println(volanteEA.getNome()+" ("+volanteEA.getNumeroCamisa()+")");
		    			System.out.println(lateralEA.getNome()+" ("+lateralEA.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(zagueiroEA.getNome()+" ("+zagueiroEA.getNumeroCamisa()+")");
		    			System.out.println(volanteDA.getNome()+" ("+volanteDA.getNumeroCamisa()+")");
		    			System.out.println(lateralDA.getNome()+" ("+lateralDA.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if(escolhas == zagueiroDA.getNumeroCamisa()){
		    			j = zagueiroDA;
		    		}
		    		else if(escolhas == zagueiroEA.getNumeroCamisa()){
		    			j = zagueiroEA;
		    		}
		    		else if(escolhas == volanteEA.getNumeroCamisa()){
		    			j = volanteEA;
		    		}
		    		else if(escolhas == volanteDA.getNumeroCamisa()){
		    			j = volanteDA;
		    		}
		    		else if(escolhas == lateralEA.getNumeroCamisa()){
		    			j = lateralEA;
		    		}
		    		else {
		    			j = lateralDA;
		    		}
		    		if (k.getNumeroCamisa() == 4){
		    			zagueiroEA.passeBola(j, escolhas);
		    		}
		    		else{
		    			zagueiroDA.passeBola(j, escolhas);
		    		}
		    	}
		    	else if(j instanceof Lateral){
		    		if(j.getNumeroCamisa() == 3){
		    			System.out.println(meiaDA.getNome()+" ("+meiaDA.getNumeroCamisa()+")");
		    			System.out.println(atacanteDA.getNome()+" ("+atacanteDA.getNumeroCamisa()+")");
		    			System.out.println(lateralEA.getNome()+" ("+lateralEA.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(meiaEA.getNome()+" ("+meiaEA.getNumeroCamisa()+")");
		    			System.out.println(atacanteEA.getNome()+" ("+atacanteEA.getNumeroCamisa()+")");
		    			System.out.println(lateralDA.getNome()+" ("+lateralDA.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if(escolhas == meiaDA.getNumeroCamisa()){
		    			j = meiaDA;
		    		}
		    		else if(escolhas == meiaEA.getNumeroCamisa()){
		    			j = meiaEA;
		    		}
		    		else if(escolhas == lateralDA.getNumeroCamisa()){
		    			j = lateralDA;
		    		}
		    		else if(escolhas == lateralEA.getNumeroCamisa()){
		    			j = lateralEA;
		    		}
		    		else if(escolhas == atacanteDA.getNumeroCamisa()){
		    			j = atacanteDA;
		    		}
		    		else {
		    			j = atacanteEA;
		    		}
		    		if(k.getNumeroCamisa() == 3){
		    			lateralDA.passeBola(j, escolhas);
		    		}
		    		else{
		    			lateralEA.passeBola(j, escolhas);
		    		}
		    	}
		    	else if(j instanceof Volante){
		    		if(j.getNumeroCamisa() == 5){
		    			System.out.println(meiaEA.getNome()+" ("+meiaEA.getNumeroCamisa()+")");
		    			System.out.println(lateralEA.getNome()+" ("+lateralEA.getNumeroCamisa()+")");
		    			System.out.println(atacanteEA.getNome()+" ("+atacanteEA.getNumeroCamisa()+")");
		    		}
		    		else {
		    			System.out.println(meiaDA.getNome()+" ("+meiaDA.getNumeroCamisa()+")");
		    			System.out.println(lateralDA.getNome()+" ("+lateralDA.getNumeroCamisa()+")");
		    			System.out.println(atacanteDA.getNome()+" ("+atacanteDA.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if (escolhas == meiaEA.getNumeroCamisa()){
		    			j = meiaEA;
		    		}
		    		else if(escolhas == meiaDA.getNumeroCamisa()){
		    			j = meiaDA;
		    		}
		    		else if(escolhas == lateralEA.getNumeroCamisa()){
		    			j = lateralEA;
		    		}
		    		else if(escolhas == lateralDA.getNumeroCamisa()){
		    			j = lateralDA;
		    		}
		    		else if(escolhas == atacanteDA.getNumeroCamisa()){
		    			j = atacanteDA;
		    		}
		    		else {
		    			j = atacanteEA;
		    		}
		    		if(k.getNumeroCamisa() == 5){
		    			volanteEA.passeBola(j, escolhas);
		    		}
		    		else{
		    			volanteDA.passeBola(j, escolhas);
		    		}	
		    	}
		    	else if(j instanceof Meia){
		    		if(j.getNumeroCamisa() == 10){
		    			System.out.println(atacanteEA.getNome()+" ("+atacanteEA.getNumeroCamisa()+")");
		    			System.out.println(lateralEA.getNome()+" ("+lateralEA.getNumeroCamisa()+")");
		    			System.out.println(meiaDA.getNome()+" ("+meiaDA.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(atacanteDA.getNome()+" ("+atacanteDA.getNumeroCamisa()+")");
		    			System.out.println(lateralDA.getNome()+" ("+lateralDA.getNumeroCamisa()+")");
		    			System.out.println(meiaEA.getNome()+" ("+meiaEA.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola;");
		    		System.out.println("Ou digite 0 para chutar pro gol: ");
		    		escolhas = ler.nextInt();
		    		if (escolhas == meiaEA.getNumeroCamisa()){
		    			j = meiaEA;
		    		}
		    		else if(escolhas == meiaDA.getNumeroCamisa()){
		    			j = meiaDA;
		    		}
		    		else if(escolhas == lateralDA.getNumeroCamisa()){
		    			j = lateralDA;
		    		}
		    		else if(escolhas == lateralEA.getNumeroCamisa()){
		    			j = lateralEA;
		    		}
		    		else if(escolhas == atacanteDA.getNumeroCamisa()){
		    			j = atacanteDA;
		    		}
		    		else if(escolhas == atacanteEA.getNumeroCamisa()){
		    			j = atacanteEA;
		    		}
		    		if(k.getNumeroCamisa() == 10){
		    			if(escolhas == 0){
		    				meiaEA.chutarGol(gol, "Sport");
		    			}
		    			else{
		    				meiaEA.passeBola(j, escolhas);	
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				meiaDA.chutarGol(gol, "Sport");
		    			}
		    			else{
		    				meiaDA.passeBola(j, escolhas);	
		    			}
		    		}
		    	}
		    	else{
		    		if(j.getNumeroCamisa() == 9){
		    			System.out.println(atacanteEA.getNome()+" ("+atacanteEA.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(atacanteDA.getNome()+" ("+atacanteDA.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola;");
		    		System.out.println("Ou digite 0 para chutar pro gol: ");
		    		escolhas = ler.nextInt();
		    		if(escolhas == atacanteDA.getNumeroCamisa()){
		    			j = atacanteDA;
		    		}
		    		else if(escolhas == atacanteEA.getNumeroCamisa()){
		    			j = atacanteEA;
		    		}
		    		if(k.getNumeroCamisa() == 9){
		    			if(escolhas == 0){
		    				atacanteDA.chutarGol(gol, "Sport");
		    			}
		    			else{
		    				atacanteDA.passeBola(j, escolhas);	
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				atacanteEA.chutarGol(gol, "Sport");
		    			}
		    			else{
		    				atacanteEA.passeBola(j, escolhas);	
		    			}
		    		}
		    	}
		    }
		    else if(t.equals("Brasil")){
		    	System.out.println(j.getNome()+" pode tocar para:");
		    	if (j instanceof Goleiro){
		    		System.out.println(zagueiroEB.getNome()+" ("+zagueiroEB.getNumeroCamisa()+")");
		    		System.out.println(zagueiroDB.getNome()+" ("+zagueiroDB.getNumeroCamisa()+")");
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if (escolhas == zagueiroEB.getNumeroCamisa()){
		    			j = zagueiroEB;
		    		}
		    		else {
		    			j = zagueiroDB;
		    		}
		    		goleiroB.passeBola(j, escolhas);
		    	}
		    	else if(j instanceof Zagueiro){
		    		if(j.getNumeroCamisa() == 4){
		    			System.out.println(zagueiroDB.getNome()+" ("+zagueiroDB.getNumeroCamisa()+")");
		    			System.out.println(volanteEB.getNome()+" ("+volanteEB.getNumeroCamisa()+")");
		    			System.out.println(lateralEB.getNome()+" ("+lateralEB.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(zagueiroEB.getNome()+" ("+zagueiroEB.getNumeroCamisa()+")");
		    			System.out.println(volanteDB.getNome()+" ("+volanteDB.getNumeroCamisa()+")");
		    			System.out.println(lateralDB.getNome()+" ("+lateralDB.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if(escolhas == zagueiroDB.getNumeroCamisa()){
		    			j = zagueiroDB;
		    		}
		    		else if(escolhas == zagueiroEB.getNumeroCamisa()){
		    			j = zagueiroEB;
		    		}
		    		else if(escolhas == volanteEB.getNumeroCamisa()){
		    			j = volanteEB;
		    		}
		    		else if(escolhas == volanteDB.getNumeroCamisa()){
		    			j = volanteDB;
		    		}
		    		else if(escolhas == lateralEB.getNumeroCamisa()){
		    			j = lateralEB;
		    		}
		    		else {
		    			j = lateralDB;
		    		}
		    		if (k.getNumeroCamisa() == 4){
		    			zagueiroEB.passeBola(j, escolhas);
		    		}
		    		else{
		    			zagueiroDB.passeBola(j, escolhas);
		    		}
		    	}
		    	else if(j instanceof Lateral){
		    		if(j.getNumeroCamisa() == 3){
		    			System.out.println(meiaDB.getNome()+" ("+meiaDB.getNumeroCamisa()+")");
		    			System.out.println(atacanteDB.getNome()+" ("+atacanteDB.getNumeroCamisa()+")");
		    			System.out.println(lateralEB.getNome()+" ("+lateralEB.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(meiaEB.getNome()+" ("+meiaEB.getNumeroCamisa()+")");
		    			System.out.println(atacanteEB.getNome()+" ("+atacanteEB.getNumeroCamisa()+")");
		    			System.out.println(lateralDB.getNome()+" ("+lateralDB.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if(escolhas == meiaDB.getNumeroCamisa()){
		    			j = meiaDB;
		    		}
		    		else if(escolhas == meiaEB.getNumeroCamisa()){
		    			j = meiaEB;
		    		}
		    		else if(escolhas == lateralDB.getNumeroCamisa()){
		    			j = lateralDB;
		    		}
		    		else if(escolhas == lateralEB.getNumeroCamisa()){
		    			j = lateralEB;
		    		}
		    		else if(escolhas == atacanteDB.getNumeroCamisa()){
		    			j = atacanteDB;
		    		}
		    		else {
		    			j = atacanteEB;
		    		}
		    		if(k.getNumeroCamisa() == 3){
		    			lateralDB.passeBola(j, escolhas);
		    		}
		    		else{
		    			lateralEB.passeBola(j, escolhas);
		    		}
		    	}
		    	else if(j instanceof Volante){
		    		if(j.getNumeroCamisa() == 5){
		    			System.out.println(meiaEB.getNome()+" ("+meiaEB.getNumeroCamisa()+")");
		    			System.out.println(lateralEB.getNome()+" ("+lateralEB.getNumeroCamisa()+")");
		    			System.out.println(atacanteEB.getNome()+" ("+atacanteEB.getNumeroCamisa()+")");
		    		}
		    		else {
		    			System.out.println(meiaDB.getNome()+" ("+meiaDB.getNumeroCamisa()+")");
		    			System.out.println(lateralDB.getNome()+" ("+lateralDB.getNumeroCamisa()+")");
		    			System.out.println(atacanteDB.getNome()+" ("+atacanteDB.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola:");
		    		escolhas = ler.nextInt();
		    		if (escolhas == meiaEB.getNumeroCamisa()){
		    			j = meiaEB;
		    		}
		    		else if(escolhas == meiaDB.getNumeroCamisa()){
		    			j = meiaDB;
		    		}
		    		else if(escolhas == lateralEB.getNumeroCamisa()){
		    			j = lateralEB;
		    		}
		    		else if(escolhas == lateralDB.getNumeroCamisa()){
		    			j = lateralDB;
		    		}
		    		else if(escolhas == atacanteDB.getNumeroCamisa()){
		    			j = atacanteDB;
		    		}
		    		else {
		    			j = atacanteEB;
		    		}
		    		if(k.getNumeroCamisa() == 5){
		    			volanteEB.passeBola(j, escolhas);
		    		}
		    		else{
		    			volanteDB.passeBola(j, escolhas);
		    		}	
		    	}
		    	else if(j instanceof Meia){
		    		if(j.getNumeroCamisa() == 10){
		    			System.out.println(atacanteEB.getNome()+" ("+atacanteEB.getNumeroCamisa()+")");
		    			System.out.println(lateralEB.getNome()+" ("+lateralEB.getNumeroCamisa()+")");
		    			System.out.println(meiaDB.getNome()+" ("+meiaDB.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(atacanteDB.getNome()+" ("+atacanteDB.getNumeroCamisa()+")");
		    			System.out.println(lateralDB.getNome()+" ("+lateralDB.getNumeroCamisa()+")");
		    			System.out.println(meiaEB.getNome()+" ("+meiaEB.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola;");
		    		System.out.println("Ou digite 0 para chutar pro gol: ");
		    		escolhas = ler.nextInt();
		    		if (escolhas == meiaEB.getNumeroCamisa()){
		    			j = meiaEB;
		    		}
		    		else if(escolhas == meiaDB.getNumeroCamisa()){
		    			j = meiaDB;
		    		}
		    		else if(escolhas == lateralDB.getNumeroCamisa()){
		    			j = lateralDA;
		    		}
		    		else if(escolhas == lateralEB.getNumeroCamisa()){
		    			j = lateralEA;
		    		}
		    		else if(escolhas == atacanteDB.getNumeroCamisa()){
		    			j = atacanteDB;
		    		}
		    		else if(escolhas == atacanteEB.getNumeroCamisa()){
		    			j = atacanteEB;
		    		}
		    		if(k.getNumeroCamisa() == 10){
		    			if(escolhas == 0){
		    				meiaEB.chutarGol(gol, "Brasil");
		    			}
		    			else{
		    				meiaEB.passeBola(j, escolhas);	
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				meiaDB.chutarGol(gol, "Brasil");
		    			}
		    			else{
		    				meiaDB.passeBola(j, escolhas);	
		    			}
		    		}
		    	}
		    	else{
		    		if(j.getNumeroCamisa() == 9){
		    			System.out.println(atacanteEB.getNome()+" ("+atacanteEB.getNumeroCamisa()+")");
		    		}
		    		else{
		    			System.out.println(atacanteDB.getNome()+" ("+atacanteDB.getNumeroCamisa()+")");
		    		}
		    		System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola;");
		    		System.out.println("Ou digite 0 para chutar pro gol: ");
		    		escolhas = ler.nextInt();
		    		if(escolhas == atacanteDB.getNumeroCamisa()){
		    			j = atacanteDB;
		    		}
		    		else if(escolhas == atacanteEB.getNumeroCamisa()){
		    			j = atacanteEB;
		    		}
		    		if(k.getNumeroCamisa() == 9){
		    			if(escolhas == 0){
		    				atacanteDB.chutarGol(gol, "Brasil");
		    			}
		    			else{
		    				atacanteDB.passeBola(j, escolhas);	
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				atacanteEB.chutarGol(gol, "Brasil");
		    			}
		    			else{
		    				atacanteEB.passeBola(j, escolhas);	
		    			}
		    		}
		    	}
		    }
		    tempo++;
		    System.out.println(gol.placar());
		    System.out.println(tempo+" minutos do primeiro tempo");
	    }while(tempo < 45);

	    /*
	    while(tempo < 45){
	    	
	    }
	    System.out.println("Termina o primeiro tempo!");
	    if (sorteio.equals("A")){
	    	brasil.goleiro.posseBola = true;
	    	System.out.printf("O %s recomeça com a posse de bola! \n",brasil.getNome());
	    }
	    else{
	    	sport.goleiro.posseBola = true;
	    	System.out.printf("O %s recomeça com a posse de bola! \n",sport.getNome());
	    }
	    //Segundo Tempo
	    while(tempo < 90){
	    	
	    }
	    */

	    /*
	    sport.atacanteD.chutarGol(gol, "Sport");
	    m = gol.placar();
	    
	    System.out.printf(m);
	    */

	    
	  }
}
