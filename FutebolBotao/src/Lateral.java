
public class Lateral extends Jogador implements IJogadas{
	public Lateral(String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}

	@Override
	public void passeBola(Jogador companheiro, int numero) {
		if (posseBola && companheiro.getNumeroCamisa() == numero){
			if(companheiro instanceof Meia || companheiro instanceof Atacante){
				companheiro.posseBola = true;
				this.posseBola = false;
			}		
		}		
	}

	@Override
	public void roubarBola(Jogador adversario, int numero) {
		if (!posseBola && adversario.getNumeroCamisa() == numero){
			if (adversario instanceof Lateral){
				this.posseBola = true;
				adversario.posseBola = false;
			}
		}
	}
}
