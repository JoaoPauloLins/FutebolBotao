
public class Atacante extends Jogador {

	public Atacante(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
	public void chutarGol(){
		Gol gol = new Gol();
		if (this.time.equals("A")){
			gol.pontuacaoA++;
		}
		else if (this.time.equals("B")){
			gol.pontuacaoB++;
		}
	}

}
	