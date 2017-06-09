
public class Volante extends Jogador{
	public Volante(String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}
	
	public void passeBola(Jogador companheiro){
		if (bola && (companheiro instanceof Volante || companheiro instanceof Meia)){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
	public void enfiarBola(Jogador companheiro){
		if (bola&& (companheiro instanceof Atacante)){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
	public void roubarBola(Jogador adversario){
		if (!bola && (adversario instanceof Meia )){
			this.bola = true;
			adversario.bola = false;
		}
	}

}