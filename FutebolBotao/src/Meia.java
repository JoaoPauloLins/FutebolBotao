
public class Meia extends Jogador implements IJogadas{

	public Meia (String nome, int numeroCamisa, String time){
		super(nome, numeroCamisa, time);
	}
	
	public void chutarGol (Gol OitentaE7ehNosso){
		OitentaE7ehNosso.gol(time);
	}

	@Override
	public void passeBola(Jogador companheiro) {
		if (posseBola && (companheiro instanceof Meia || companheiro instanceof Lateral || companheiro instanceof Atacante)){
			companheiro.posseBola = true;
			this.posseBola = false;
		}
		
	}

	@Override
	public void roubarBola(Jogador adversario) {
		if (!posseBola && adversario instanceof Volante && Math.random() < 0.5){
			this.posseBola = true;
			adversario.posseBola = false;
		}
		
	}
}
