
public class Lateral extends Jogador{
	public Lateral(String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}
	@Override
	public void passeBola(Jogador companheiro){
		if (bola && (companheiro instanceof Meia)){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	@Override
	public void roubarBola(Jogador adversario){
		if (!bola && (adversario instanceof Lateral )){
			this.bola = true;
			adversario.bola = false;
		}
	}
	
	public void fazerCruzamento(Jogador companheiro, Bola chao){
		if (bola && (companheiro instanceof Atacante)){
			chao.chao = false;
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
}
