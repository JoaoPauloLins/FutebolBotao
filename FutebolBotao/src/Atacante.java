
public class Atacante extends Jogador {

	public Atacante(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}
	
	//M�todos
	
	public void chutarGol(Gol gol){
		gol.gol(time);
	}

}
	