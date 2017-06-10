
public class Zagueiro extends Jogador implements IJogadas{
	
	public Zagueiro (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}

	@Override
	public void passeBola(Jogador companheiro) {
		if (posseBola && companheiro instanceof Zagueiro || companheiro instanceof Volante || companheiro instanceof Lateral){
			companheiro.posseBola = true;
			this.posseBola = false;
		}
		
	}

	@Override
	public void roubarBola(Jogador adversario) {
		if (!posseBola && adversario instanceof Atacante && Math.random() < 0.6){
			this.posseBola = true;
			adversario.posseBola = false;
		}
		
	}	
}
