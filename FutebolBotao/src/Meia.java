
public class Meia extends Jogador implements IJogadas,IFinalizacao{

	public Meia (String nome, int numeroCamisa){
		super(nome, numeroCamisa);
	}
	
	@Override
	public void chutarGol (Gol gol,String time){
		gol.gol(time);
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
