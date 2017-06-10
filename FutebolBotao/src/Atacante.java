
public class Atacante extends Jogador implements IJogadas,IFinalizacao{

	public Atacante(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa,time);
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
	@Override
	public void chutarGol(Gol gol,String time){
		gol.gol(time);
	}

	@Override
	public void passeBola(Jogador companheiro, int numero) {
		if (posseBola && companheiro.getNumeroCamisa() == numero){
			if(companheiro instanceof Atacante){
				companheiro.posseBola = true;
				this.posseBola = false;
			}
		}
	}

	@Override
	public void roubarBola(Jogador adversario, int numero) {
		if (!posseBola && adversario.getNumeroCamisa() == numero){
			if (adversario instanceof Zagueiro){
				this.posseBola = true;
				adversario.posseBola = false;
			}			
		}		
	}

}
	