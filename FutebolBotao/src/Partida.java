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
	    Volante volanteEB = new Volante("Casemiro",5,"Brasil");
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
		    		do{
		    		try{
		    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+zagueiroEA.getNumeroCamisa()+" ou "+zagueiroDA.getNumeroCamisa());
		    			escolhas = ler.nextInt();
		    		} catch(java.util.InputMismatchException e){
		    			System.out.println("Você deve digitar um valor numérico que seja o "+zagueiroEA.getNumeroCamisa()+" ou o "+zagueiroDA.getNumeroCamisa()
		    			);}
		    			ler.nextLine();
		    		} while(escolhas != zagueiroEA.getNumeroCamisa() && escolhas != zagueiroDA.getNumeroCamisa());
		    		if (escolhas == zagueiroEA.getNumeroCamisa()){
		    			j = zagueiroEA;
		    		}
		    		else {
		    			j = zagueiroDA;
		    		}
		    		m = goleiroA.passeBola(j, escolhas);
		    		System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 4){
		    		do{
			    		try{
			    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+zagueiroDA.getNumeroCamisa()+" ou "+volanteEA.getNumeroCamisa()+" ou "+lateralEA.getNumeroCamisa());
			    			escolhas = ler.nextInt();
			    		} catch(java.util.InputMismatchException e){
			    			System.out.println("Você deve digitar um valor numérico que seja o "+zagueiroDA.getNumeroCamisa()+" ou o "+volanteEA.getNumeroCamisa()+" ou o "+lateralEA.getNumeroCamisa());}
			    			ler.nextLine();
			    		} while(escolhas != zagueiroDA.getNumeroCamisa() && escolhas != volanteEA.getNumeroCamisa() && escolhas != lateralEA.getNumeroCamisa());
		    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+zagueiroEA.getNumeroCamisa()+" ou "+volanteDA.getNumeroCamisa()+" ou "+lateralDA.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+zagueiroDA.getNumeroCamisa()+" ou o "+volanteEA.getNumeroCamisa()+" ou o "+lateralEA.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != zagueiroEA.getNumeroCamisa() && escolhas != volanteDA.getNumeroCamisa() && escolhas != lateralDA.getNumeroCamisa());
			    		}
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
		    			m = zagueiroEA.passeBola(j, escolhas, atacanteEB);
		    			System.out.println(m);
		    		}
		    		else{
		    			m = zagueiroDA.passeBola(j, escolhas, atacanteDB);
		    			System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 3){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaDA.getNumeroCamisa()+" ou "+atacanteDA.getNumeroCamisa()+" ou "+lateralEA.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaDA.getNumeroCamisa()+" ou o "+atacanteDA.getNumeroCamisa()+" ou o "+lateralEA.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != zagueiroDA.getNumeroCamisa() && escolhas != volanteEA.getNumeroCamisa() && escolhas != lateralEA.getNumeroCamisa());
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaEA.getNumeroCamisa()+" ou "+atacanteEA.getNumeroCamisa()+" ou "+lateralDA.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaEA.getNumeroCamisa()+" ou o "+atacanteEA.getNumeroCamisa()+" ou o "+lateralDA.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != meiaEA.getNumeroCamisa() && escolhas != atacanteEA.getNumeroCamisa() && escolhas != lateralDA.getNumeroCamisa());
			    		}
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
		    			m = lateralDA.passeBola(j, escolhas, lateralDB);
		    			System.out.println(m);
		    		}
		    		else{
		    			m = lateralEA.passeBola(j, escolhas, lateralEB);
		    			System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 5){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaEA.getNumeroCamisa()+" ou "+atacanteEA.getNumeroCamisa()+" ou "+lateralEA.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaEA.getNumeroCamisa()+" ou o "+atacanteEA.getNumeroCamisa()+" ou o "+lateralEA.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != meiaEA.getNumeroCamisa() && escolhas != lateralEA.getNumeroCamisa() && escolhas != atacanteEA.getNumeroCamisa());
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaDA.getNumeroCamisa()+" ou "+atacanteDA.getNumeroCamisa()+" ou "+lateralDA.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaDA.getNumeroCamisa()+" ou o "+atacanteDA.getNumeroCamisa()+" ou o "+lateralDA.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != meiaDA.getNumeroCamisa() && escolhas != atacanteDA.getNumeroCamisa() && escolhas != lateralDA.getNumeroCamisa());
			    		}
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
		    			m = volanteEA.passeBola(j, escolhas, meiaEB);
		    			System.out.println(m);
		    		}
		    		else{
		    			m = volanteDA.passeBola(j, escolhas, meiaDB);
		    			System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 10){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaDA.getNumeroCamisa()+" ou "+atacanteEA.getNumeroCamisa()+" ou "+lateralEA.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaDA.getNumeroCamisa()+" ou o "+atacanteEA.getNumeroCamisa()+" ou o "+lateralEA.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != meiaDA.getNumeroCamisa() && escolhas != lateralEA.getNumeroCamisa() && escolhas != atacanteEA.getNumeroCamisa() && escolhas != 0);
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaEA.getNumeroCamisa()+" ou "+atacanteDA.getNumeroCamisa()+" ou "+lateralDA.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaEA.getNumeroCamisa()+" ou o "+atacanteDA.getNumeroCamisa()+" ou o "+lateralDA.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != meiaEA.getNumeroCamisa() && escolhas != atacanteDA.getNumeroCamisa() && escolhas != lateralDA.getNumeroCamisa() && escolhas != 0);
			    		}
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
		    				m = meiaEA.chutarGol(gol, "Sport", goleiroB);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = meiaEA.passeBola(j, escolhas, volanteEB);
		    				System.out.println(m);
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				m = meiaDA.chutarGol(gol, "Sport", goleiroB);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = meiaDA.passeBola(j, escolhas, volanteDB);
		    				System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 9){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+atacanteEA.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+atacanteEA.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != atacanteEA.getNumeroCamisa() && escolhas != 0);
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+atacanteDA.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+atacanteDA.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != atacanteDA.getNumeroCamisa() && escolhas != 0);
			    		}
		    		if(escolhas == atacanteDA.getNumeroCamisa()){
		    			j = atacanteDA;
		    		}
		    		else if(escolhas == atacanteEA.getNumeroCamisa()){
		    			j = atacanteEA;
		    		}
		    		if(k.getNumeroCamisa() == 9){
		    			if(escolhas == 0){
		    				m = atacanteDA.chutarGol(gol, "Sport", goleiroB);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = atacanteDA.passeBola(j, escolhas, zagueiroDB);	
		    				System.out.println(m);
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				m = atacanteEA.chutarGol(gol, "Sport", goleiroB);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = atacanteEA.passeBola(j, escolhas, zagueiroEB);	
		    				System.out.println(m);
		    			}
		    		}
		    	}
		    }
		    else if(t.equals("Brasil")){
		    	System.out.println(j.getNome()+" pode tocar para:");
		    	if (j instanceof Goleiro){
		    		System.out.println(zagueiroEB.getNome()+" ("+zagueiroEB.getNumeroCamisa()+")");
		    		System.out.println(zagueiroDB.getNome()+" ("+zagueiroDB.getNumeroCamisa()+")");
		    		do{
			    		try{
			    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+zagueiroEB.getNumeroCamisa()+" ou "+zagueiroDB.getNumeroCamisa());
			    			escolhas = ler.nextInt();
			    		} catch(java.util.InputMismatchException e){
			    			System.out.println("Você deve digitar um valor numérico que seja o "+zagueiroEB.getNumeroCamisa()+" ou o "+zagueiroDB.getNumeroCamisa()
			    			);}
			    			ler.nextLine();
			    		} while(escolhas != zagueiroEB.getNumeroCamisa() && escolhas != zagueiroDB.getNumeroCamisa());
		    		if (escolhas == zagueiroEB.getNumeroCamisa()){
		    			j = zagueiroEB;
		    		}
		    		else {
		    			j = zagueiroDB;
		    		}
		    		m = goleiroB.passeBola(j, escolhas);
		    		System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 4){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+zagueiroDB.getNumeroCamisa()+" ou "+volanteEB.getNumeroCamisa()+" ou "+lateralEB.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+zagueiroDB.getNumeroCamisa()+" ou o "+volanteEB.getNumeroCamisa()+" ou o "+lateralEB.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != zagueiroDB.getNumeroCamisa() && escolhas != volanteEB.getNumeroCamisa() && escolhas != lateralEB.getNumeroCamisa());
			    		}
			    		else{
				    		do{
					    		try{
					    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+zagueiroEB.getNumeroCamisa()+" ou "+volanteDB.getNumeroCamisa()+" ou "+lateralDB.getNumeroCamisa());
					    			escolhas = ler.nextInt();
					    		} catch(java.util.InputMismatchException e){
					    			System.out.println("Você deve digitar um valor numérico que seja o "+zagueiroDB.getNumeroCamisa()+" ou o "+volanteEB.getNumeroCamisa()+" ou o "+lateralEB.getNumeroCamisa());}
					    			ler.nextLine();
					    		} while(escolhas != zagueiroEB.getNumeroCamisa() && escolhas != volanteDB.getNumeroCamisa() && escolhas != lateralDB.getNumeroCamisa());
				    		}
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
		    			m = zagueiroEB.passeBola(j, escolhas, atacanteEA);
		    			System.out.println(m);
		    		}
		    		else{
		    			m = zagueiroDB.passeBola(j, escolhas, atacanteDA);
		    			System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 3){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaDB.getNumeroCamisa()+" ou "+atacanteDB.getNumeroCamisa()+" ou "+lateralEB.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaDB.getNumeroCamisa()+" ou o "+atacanteDB.getNumeroCamisa()+" ou o "+lateralEB.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != zagueiroDB.getNumeroCamisa() && escolhas != volanteEB.getNumeroCamisa() && escolhas != lateralEB.getNumeroCamisa());
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaEB.getNumeroCamisa()+" ou "+atacanteEB.getNumeroCamisa()+" ou "+lateralDB.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaEB.getNumeroCamisa()+" ou o "+atacanteEB.getNumeroCamisa()+" ou o "+lateralDB.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != meiaEB.getNumeroCamisa() && escolhas != atacanteEB.getNumeroCamisa() && escolhas != lateralDB.getNumeroCamisa());
			    		}
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
		    			m = lateralDB.passeBola(j, escolhas, lateralDA);
		    			System.out.println(m);
		    		}
		    		else{
		    			m = lateralEB.passeBola(j, escolhas, lateralEA);
		    			System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 5){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaEB.getNumeroCamisa()+" ou "+atacanteEB.getNumeroCamisa()+" ou "+lateralEB.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaEB.getNumeroCamisa()+" ou o "+atacanteEB.getNumeroCamisa()+" ou o "+lateralEB.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != meiaEB.getNumeroCamisa() && escolhas != lateralEB.getNumeroCamisa() && escolhas != atacanteEB.getNumeroCamisa());
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaDB.getNumeroCamisa()+" ou "+atacanteDB.getNumeroCamisa()+" ou "+lateralDB.getNumeroCamisa());
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaDB.getNumeroCamisa()+" ou o "+atacanteDB.getNumeroCamisa()+" ou o "+lateralDB.getNumeroCamisa());}
				    			ler.nextLine();
				    		} while(escolhas != meiaDB.getNumeroCamisa() && escolhas != atacanteDB.getNumeroCamisa() && escolhas != lateralDB.getNumeroCamisa());
			    		}
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
		    			m = volanteEB.passeBola(j, escolhas, meiaEA);
		    			System.out.println(m);
		    		}
		    		else{
		    			m = volanteDB.passeBola(j, escolhas, meiaDA);
		    			System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 10){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaDB.getNumeroCamisa()+" ou "+atacanteEB.getNumeroCamisa()+" ou "+lateralEB.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaDB.getNumeroCamisa()+" ou o "+atacanteEB.getNumeroCamisa()+" ou o "+lateralEB.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != meiaDB.getNumeroCamisa() && escolhas != lateralEB.getNumeroCamisa() && escolhas != atacanteEB.getNumeroCamisa() && escolhas != 0);
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+meiaEB.getNumeroCamisa()+" ou "+atacanteDB.getNumeroCamisa()+" ou "+lateralDB.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+meiaEB.getNumeroCamisa()+" ou o "+atacanteDB.getNumeroCamisa()+" ou o "+lateralDB.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != meiaEB.getNumeroCamisa() && escolhas != atacanteDB.getNumeroCamisa() && escolhas != lateralDB.getNumeroCamisa() && escolhas != 0);
			    		}
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
		    				m = meiaEB.chutarGol(gol, "Brasil", goleiroA);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = meiaEB.passeBola(j, escolhas, volanteEA);
		    				System.out.println(m);
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				m = meiaDB.chutarGol(gol, "Brasil", goleiroA);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = meiaDB.passeBola(j, escolhas, volanteDA);
		    				System.out.println(m);
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
		    		if(j.getNumeroCamisa() == 9){
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+atacanteEB.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+atacanteEB.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != atacanteEB.getNumeroCamisa() && escolhas != 0);
			    		}
		    		else{
			    		do{
				    		try{
				    			System.out.println("Digite o número do jogador que "+j.getNome()+" irá tocar a bola: "+atacanteDB.getNumeroCamisa());
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			escolhas = ler.nextInt();
				    		} catch(java.util.InputMismatchException e){
				    			System.out.println("Você deve digitar um valor numérico que seja o "+atacanteDB.getNumeroCamisa());}
				    			System.out.println("Ou digite 0 para chutar pro gol: ");
				    			ler.nextLine();
				    		} while(escolhas != atacanteDB.getNumeroCamisa() && escolhas != 0);
			    		}
		    		if(escolhas == atacanteDB.getNumeroCamisa()){
		    			j = atacanteDB;
		    		}
		    		else if(escolhas == atacanteEB.getNumeroCamisa()){
		    			j = atacanteEB;
		    		}
		    		if(k.getNumeroCamisa() == 9){
		    			if(escolhas == 0){
		    				m = atacanteDB.chutarGol(gol, "Brasil", goleiroA);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = atacanteDB.passeBola(j, escolhas, zagueiroDA);	
		    				System.out.println(m);
		    			}
		    		}
		    		else{
		    			if(escolhas == 0){
		    				m = atacanteEB.chutarGol(gol, "Brasil", goleiroA);
		    				System.out.println(m);
		    			}
		    			else{
		    				m = atacanteEB.passeBola(j, escolhas, zagueiroEA);	
		    				System.out.println(m);
		    			}
		    		}
		    	}
		    }
		    tempo++;
		    System.out.println(gol.placar());
		    if(tempo <45){
		    System.out.println(tempo+" minutos do primeiro tempo");
		    }
		    else{
			    System.out.println(tempo+" minutos do segundo tempo");
		    }
	    }while(tempo < 90);
	    
	  }
}
