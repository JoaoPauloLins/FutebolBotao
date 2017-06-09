
public class Goleiro extends Jogador {

	public Goleiro(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}
	
	// Métodos
	
	@Override
	public void passeBola(Jogador companheiro){
		if (bola && companheiro instanceof Zagueiro){
			companheiro.bola = true;
			this.bola = false;
		}
	}

}
