
public class Lateral extends Jogador implements IJogadas{
	public Lateral(String nome, int numeroCamisa){
		super(nome, numeroCamisa);
	}

	@Override
	public void passeBola(Jogador companheiro) {
		if (posseBola && (companheiro instanceof Meia || companheiro instanceof Atacante)){
			companheiro.posseBola = true;
			this.posseBola = false;
		}
		
	}

	@Override
	public void roubarBola(Jogador adversario) {
		if (!posseBola && (adversario instanceof Lateral )){
			this.posseBola = true;
			adversario.posseBola = false;
		}
		
	}
}
