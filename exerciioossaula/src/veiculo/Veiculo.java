package veiculo;

public abstract class Veiculo {

	private float velocidade;
	private int passageiros;
		
	public Veiculo() {}
	
	public Veiculo(float velocidade, int passageiros) {
		super();
		this.velocidade = velocidade;
		this.passageiros = passageiros;
	}
	
	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	 
}
