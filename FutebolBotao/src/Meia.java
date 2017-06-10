
public class Meia extends Jogador implements IJogadas,IFinalizacao{

	public Meia (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa,time);
	}
	
	@Override
	public void chutarGol (Gol gol,String time){
		gol.gol(time);
	}

	@Override
	public void passeBola(Jogador companheiro, int numero) {
		if (posseBola && companheiro.getNumeroCamisa() == numero){
			if(companheiro instanceof Meia || companheiro instanceof Lateral || companheiro instanceof Atacante){
				companheiro.posseBola = true;
				this.posseBola = false;
			}
		}
	}

	@Override
	public void roubarBola(Jogador adversario, int numero) {
		if (!posseBola && adversario.getNumeroCamisa() == numero){
			if(adversario instanceof Volante && Math.random() < 0.5){
				this.posseBola = true;
				adversario.posseBola = false;
			}
		}
		
	}
}
