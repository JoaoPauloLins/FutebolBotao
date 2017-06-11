
public class Goleiro extends Jogador{

	public Goleiro(String nome, int numeroCamisa, String time) {
		super(nome, numeroCamisa, time);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String passeBola(Jogador companheiro, int numero) {
		String m = "";
		if (posseBola && companheiro.getNumeroCamisa() == numero && (companheiro instanceof Zagueiro)){
			companheiro.posseBola = true;
			this.posseBola = false;	
			m = this.nome+" toca para "+companheiro.getNome();
		}
		return m;
	}
	
	public boolean agarrar(){
		if ( Math.random() < 0.5){
			return true;
		}
		else{
			return false;
		}
	}

}
