
public class Time {
	
	public String nome;
	
	public Goleiro goleiro;
	public Zagueiro zagueiroE;
	public Zagueiro zagueiroC;
	public Zagueiro zagueiroD;
	public Lateral lateralE;
	public Lateral lateralD;
	public Volante volanteE;
	public Volante volanteD;
	public Meia meiaE;
	public Meia meiaD;
	public Atacante atacanteE;
	public Atacante atacanteC;
	public Atacante atacanteD;
	
	public int pontuacao;

	//Construtor
	// Esquema 4-4-2
	public Time (String nome,
			     Goleiro goleiro,
				 Zagueiro zagueiroE,
				 Zagueiro zagueiroD,
				 Lateral lateralE,
				 Lateral lateralD,
				 Volante volanteE,
				 Volante volanteD,
				 Meia meiaE,
				 Meia meiaD,
				 Atacante atacanteE,
				 Atacante atacanteD)
	{
			this.nome = nome;
			this.goleiro = goleiro;
			this.zagueiroE = zagueiroE;
			this.zagueiroD = zagueiroD;
			this.lateralE = lateralE;
			this.lateralD = lateralD;
			this.volanteE = volanteE;
			this.volanteD = volanteD;
			this.meiaE = meiaE;
			this.meiaD = meiaD;
			this.atacanteE = atacanteE;
			this.atacanteD = atacanteD;
			
	}
}
