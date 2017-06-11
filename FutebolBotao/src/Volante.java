
public class Volante extends Jogador implements IJogadas{
	public Volante(String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}
	
	@Override
	public String passeBola(Jogador companheiro, int numero, Meia adversario){
		String m = "";
		if (posseBola && companheiro.getNumeroCamisa() == numero){
			double p = Math.random();
			if (p < 0.8 && (companheiro instanceof Volante || companheiro instanceof Meia)){
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
			else if(p < 0.4 && companheiro instanceof Atacante){
				//Acertou a enfiada de bola
				companheiro.posseBola = true;
				this.posseBola = false;
				if (adversario.roubarBola(companheiro, this.numeroCamisa)){
					m = this.nome+" acertou a enfiada de bola mas "+adversario.getNome()+" roubou a bola!";
				}
				else {
					m = this.nome+" enfiou a bola para "+companheiro.getNome();
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
		if (!posseBola && adversario.getNumeroCamisa() == numero && Math.random() < 0.5){
			this.posseBola = true;
			adversario.posseBola = false;
			return true;
		}
		else{
			return false;
		}
	}
}