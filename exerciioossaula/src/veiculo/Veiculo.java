package veiculo;

public class Veiculo {

	private double velocidade;
	private int passageiros;
	private Manobrista manobrista;
	
	public Veiculo() {
	}

	public Veiculo(double velocidade, int passageiros) {
		super();
		this.setVelocidade(velocidade);
		this.setPassageiros(passageiros);
	}

	public double getVelocidade() {
		return velocidade;
	}

	public boolean setVelocidade(double velocidade) {
		this.velocidade = velocidade;
		return true;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public boolean setPassageiros(int passageiros) {
		this.passageiros = passageiros;
		return true;
	}

	public boolean acelerar(double percentual) {
		double novaVelocidade = this.getVelocidade() + (percentual / 100) * this.getVelocidade();
		if(this.setVelocidade(novaVelocidade)) {
			return true;
		}
		return false;
	}	

	public void freiar(double percentual) {
		double novaVelocidade = this.getVelocidade() - (percentual / 100) * this.getVelocidade();
		this.setVelocidade(novaVelocidade);

	}

	public Manobrista getManobrista() {
		return manobrista;
	}

	public void setManobrista(Manobrista manobrista) {
		this.manobrista = manobrista;
	}

}
