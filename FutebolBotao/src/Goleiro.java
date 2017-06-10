
public class Goleiro extends Jogador implements IJogadas{

	public Goleiro(String nome, int numeroCamisa) {
		super(nome, numeroCamisa);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void passeBola(Jogador companheiro) {
		if (posseBola && companheiro instanceof Zagueiro){
			companheiro.posseBola = true;
			this.posseBola = false;
		}
		
	}

	@Override
	public void roubarBola(Jogador adversario) {
		// TODO Auto-generated method stub
		
	}

}
