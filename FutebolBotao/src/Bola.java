
public class Bola {
	
	public Time timeA;
	public Time timeB;
	
	public Bola(Time timeA, Time timeB){
		this.timeA = timeA;
		this.timeB = timeB;
	}
	
	public Jogador quemBola(){
		Jogador j;
		if (timeA.goleiro.posseBola){
			j = timeA.goleiro;
		}
		else if(timeA.zagueiroE.posseBola){
			j = timeA.zagueiroE;
		}
		else if(timeA.zagueiroD.posseBola){
			j = timeA.zagueiroD;
		}
		else if(timeA.lateralE.posseBola){
			j = timeA.lateralE;
		}
		else if(timeA.lateralD.posseBola){
			j = timeA.lateralD;
		}
		else if(timeA.volanteE.posseBola){
			j = timeA.volanteE;
		}
		else if(timeA.volanteD.posseBola){
			j = timeA.volanteD;
		}
		else if(timeA.meiaE.posseBola){
			j = timeA.meiaE;
		}
		else if(timeA.meiaD.posseBola){
			j = timeA.meiaD;
		}
		else if(timeA.atacanteE.posseBola){
			j = timeA.atacanteE;
		}
		else if(timeA.atacanteD.posseBola){
			j = timeA.atacanteD;
		}
		//TimeB
		else if (timeB.goleiro.posseBola){
			j = timeB.goleiro;
		}
		else if(timeB.zagueiroE.posseBola){
			j = timeB.zagueiroE;
		}
		else if(timeB.zagueiroD.posseBola){
			j = timeB.zagueiroD;
		}
		else if(timeB.lateralE.posseBola){
			j = timeB.lateralE;
		}
		else if(timeB.lateralD.posseBola){
			j = timeB.lateralD;
		}
		else if(timeB.volanteE.posseBola){
			j = timeB.volanteE;
		}
		else if(timeB.volanteD.posseBola){
			j = timeB.volanteD;
		}
		else if(timeB.meiaE.posseBola){
			j = timeB.meiaE;
		}
		else if(timeB.meiaD.posseBola){
			j = timeB.meiaD;
		}
		else if(timeB.atacanteE.posseBola){
			j = timeB.atacanteE;
		}
		else {
			j = timeB.atacanteD;
		}
		return j;
	}
	
	public String timeBola(){
		Jogador j = quemBola();
		return j.getTime();
	}
}
