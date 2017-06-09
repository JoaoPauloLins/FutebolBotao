
public class Meia extends Jogador {

	public Meia (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}
	
	public void chutarGol (Gol OitentaE7ehNosso){
		OitentaE7ehNosso.gol(time);
	}
	
	@Override
	public void passeBola(Jogador companheiro){
		if (bola && companheiro instanceof Meia || companheiro instanceof Lateral || companheiro instanceof Atacante){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
	@Override
	public void roubarBola(Jogador adversario){
		if (!bola && adversario instanceof Volante && Math.random() < 0.5){
			this.bola = true;
			adversario.bola = false;
		}
	}
	
}
