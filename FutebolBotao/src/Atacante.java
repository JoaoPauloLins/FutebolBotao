
public class Atacante extends Jogador implements IJogadas,IFinalizacao{

	public Atacante(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa,time);
		// TODO Auto-generated constructor stub
	}
	
	//Métodos
	
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
	public String passeBola(Jogador companheiro, int numero, Zagueiro adversario){
		String m = "";
		if (posseBola && companheiro.getNumeroCamisa() == numero && companheiro instanceof Atacante ){
			if (Math.random() < 0.5){
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
		if (!posseBola && adversario.getNumeroCamisa() == numero && Math.random() < 0.1){
			this.posseBola = true;
			adversario.posseBola = false;
			return true;
		}
		else{
			return false;
		}
	}

}
	