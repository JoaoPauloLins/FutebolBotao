
public class Jogador {

	public String nome;
	public int numeroCamisa;
	public boolean bola; // Se for true, o jogador possue a bola. Se for false, o jogador não possue a bola.
	public String time;

	//Construtor	
	public Jogador (String nome, int numeroCamisa, String time){
		this.nome = nome;
		this.numeroCamisa = numeroCamisa;
		this.time = time;
	}

	//Get e Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroCamisa() {
		return numeroCamisa;
	}
	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}
	public boolean isBola() {
		return bola;
	}
	public void setBola(boolean bola) {
		this.bola = bola;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	//Métodos
	
	public void passeBola(Jogador companheiro){
		if (bola){
			companheiro.bola = true;
			this.bola = false;
		}
	}
	
	public void roubarBola(Jogador adversario){
		if (!bola){
			this.bola = true;
			adversario.bola = false;
		}
	}
}
                                                                                                                                                                                                                             