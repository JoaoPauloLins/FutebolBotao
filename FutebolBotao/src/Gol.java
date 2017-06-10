
public class Gol {
	
	private Time timeA;
	private Time timeB;
	public String placar;

	//Construtor
	public Gol(Time timeA,Time timeB){
		this.timeA = timeA;
		this.timeB = timeB;
	}
	
	//Get e Set
	public Time getTimeA() {
		return timeA;
	}
	public void setTimeA(Time timeA) {
		this.timeA = timeA;
	}
	public Time getTimeB() {
		return timeB;
	}
	public void setTimeB(Time timeB) {
		this.timeB = timeB;
	}
	public String getPlacar() {
		return placar;
	}
	public void setPlacar(String placar) {
		this.placar = placar;
	}

	//Métodos
	
	public void gol(String time){
		if (time.equals(timeA.nome)){
			this.timeA.pontuacao++;
		}
		else if (time.equals(timeB.nome)){
			this.timeB.pontuacao++;
		}
	}
	
	public String placar(){
		this.placar = "time A "+this.timeA.pontuacao+"x"+this.timeB.pontuacao+" time B";
		return placar;
	}

}
