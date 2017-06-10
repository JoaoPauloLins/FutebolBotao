
public class Atacante extends Jogador implements IJogadas,IFinalizacao{

	public Atacante(String nome, int numeroCamisa) {
		super(nome, numeroCamisa);
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
	@Override
	public void chutarGol(Gol gol,String time){
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
	