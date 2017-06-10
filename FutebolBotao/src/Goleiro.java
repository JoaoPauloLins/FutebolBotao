
public class Goleiro extends Jogador implements IJogadas{

	public Goleiro(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void passeBola(Jogador companheiro, int numero) {
		if (posseBola && companheiro.getNumeroCamisa() == numero){
			if (companheiro instanceof Zagueiro){
				companheiro.posseBola = true;
				this.posseBola = false;
			}			
		}		
	}

	@Override
	public void roubarBola(Jogador adversario, int numero) {
		// TODO Auto-generated method stub
		
	}

}
