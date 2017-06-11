
public class Zagueiro extends Jogador implements IJogadas{
	
	public Zagueiro (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}

	@Override
	public String passeBola(Jogador companheiro, int numero, Atacante adversario){
		String m = "";
		if (posseBola && companheiro.getNumeroCamisa() == numero && (companheiro instanceof Zagueiro || companheiro instanceof Volante || companheiro instanceof Lateral)){
			if (Math.random() < 0.9){
				//Acertou o passe
				companheiro.posseBola = true;
				this.posseBola = false;
				if (adversario.roubarBola(companheiro, this.numeroCamisa)){
					m = this.nome+" acertou o passe mas "+adversario.getNome()+" roubou a bola!";
				}
				else {
					m = this.nome+" toca para "+companheiro.getNome();
				}
			}
			else{
				//Errou o passe
				this.posseBola = false;
				adversario.posseBola = true;
				m = this.nome+" errou o passe e a bola está com "+adversario.getNome();
			}
		}
		return m;
	}

	@Override
	public boolean roubarBola(Jogador adversario, int numero) {
		if (!posseBola && adversario.getNumeroCamisa() == numero && Math.random() < 0.6){
			this.posseBola = true;
			adversario.posseBola = false;
			return true;
		}
		else{
			return false;
		}
	}
}
