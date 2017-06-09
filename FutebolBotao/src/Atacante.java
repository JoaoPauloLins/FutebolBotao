
public class Atacante extends Jogador {

	public Atacante(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
	public void chutarGol(Gol gol, Bola bola){
		if (bola.chao){
			gol.gol(time);
		}
	}
	
	@Override 
	public void passeBola(Jogador companheiro){
		if (bola && companheiro instanceof Atacante){
			companheiro.bola = true;
			this.bola = false;
		}
	}

}
	