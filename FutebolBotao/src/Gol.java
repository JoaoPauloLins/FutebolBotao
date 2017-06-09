
public class Gol {
	
	public int pontuacaoA;
	public int pontuacaoB;
	public String placar;

	
	//Get e Set
	public int getPontuacaoA() {
		return pontuacaoA;
	}
	public void setPontuacaoA(int pontuacaoA) {
		this.pontuacaoA = pontuacaoA;
	}
	public int getPontuacaoB() {
		return pontuacaoB;
	}
	public void setPontuacaoB(int pontuacaoB) {
		this.pontuacaoB = pontuacaoB;
	}
	public String getPlacar() {
		return placar;
	}
	public void setPlacar(String placar) {
		this.placar = placar;
	}
	
	//Métodos
	
	public void gol(String time){
		if (time.equals("A")){
			this.pontuacaoA++;
		}
		
		if (time.equals("B")){
			this.pontuacaoB++;
		}
	}
	
	public String placar(){
		this.placar = "time A "+this.pontuacaoA+"x"+this.pontuacaoB+" time B";
		return placar;
	}

}
