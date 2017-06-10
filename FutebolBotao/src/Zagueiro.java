
public class Zagueiro extends Jogador implements IJogadas{
	
	public Zagueiro (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}

	@Override
	public void passeBola(Jogador companheiro, int numero) {
		if (posseBola && companheiro.getNumeroCamisa() == numero){
			if (companheiro instanceof Zagueiro || companheiro instanceof Volante || companheiro instanceof Lateral){
				companheiro.posseBola = true;
				this.posseBola = false;
			}		
		}
	}

	@Override
	public void roubarBola(Jogador adversario, int numero) {
		if (!posseBola && adversario.getNumeroCamisa() == numero && Math.random() < 0.6){
			if (adversario instanceof Atacante){
				double n = Math.random();
				if(n < 0.3){
					this.posseBola = true;
					adversario.posseBola = false;
				}
				else if(n > 0.3){
					//FALTA
				}
			}
		}
	}	
}
