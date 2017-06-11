
public class Meia extends Jogador implements IJogadas,IFinalizacao{

	public Meia (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa,time);
	}
	
	@Override
	public String chutarGol(Gol gol,String time, Goleiro goleiro){
		String m = "";
		boolean defesa;
		defesa = goleiro.agarrar();
		if (defesa){
			this.posseBola = false;
			goleiro.posseBola = true;
			m = this.nome+" chuta pro gol mas "+goleiro.getNome()+" defendeu!!!!!!!!!!!";
		}
		else{
			gol.gol(time);
			this.posseBola = false;
			goleiro.posseBola = true;
			m = this.nome+" chutou pro gol... GOOOOOOOOOOOOOOOOOOOOOL!!!!!!!!!!!";
		}
		return m;
	}

	@Override
	public String passeBola(Jogador companheiro, int numero, Volante adversario) {
		String m = "";
		if (posseBola && companheiro.getNumeroCamisa() == numero && (companheiro instanceof Atacante || companheiro instanceof Meia || companheiro instanceof Lateral)){
			if (Math.random() < 0.6){
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
		if (!posseBola && adversario.getNumeroCamisa() == numero && Math.random() < 0.3){
			this.posseBola = true;
			adversario.posseBola = false;
			return true;
		}
		else{
			return false;
		}
	}
}
