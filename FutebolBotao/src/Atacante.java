
public class Atacante extends Jogador implements IJogadas{

	public Atacante(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
	public void chutarGol(Gol gol){
		gol.gol(time);
	}

	@Override
	public void passeBola(Jogador companheiro) {
		if (posseBola && companheiro instanceof Atacante){
			companheiro.posseBola = true;
			this.posseBola = false;
		}
		
	}

	@Override
	public void roubarBola(Jogador adversario) {
		if (!posseBola && (adversario instanceof Zagueiro)){
			this.posseBola = true;
			adversario.posseBola = false;
		}		
	}

}
	