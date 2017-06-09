
public class Zagueiro extends Jogador {
	
	public Zagueiro (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}
	
	@Override
	public void passeBola(Jogador companheiro){
		if (bola && companheiro instanceof Zagueiro || companheiro instanceof Volante || companheiro instanceof Lateral){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
	@Override
	public void roubarBola(Jogador adversario){
		if (!bola && adversario instanceof Atacante && Math.random() < 0.6){
			this.bola = true;
			adversario.bola = false;
		}
	}
	
}
