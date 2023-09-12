package veiculo;

public class LandRover extends Veiculo{
	private final double velocidadeMaxima = 210.0;
	private final int capacidadeMaxima = 7;
	
	
	public LandRover(double velocidade, int passageiros) {
		super(velocidade, passageiros);
	}
	
	@Override
	public boolean setVelocidade(double velocidade) {
		if (velocidade > velocidadeMaxima) {
			return false;
		}
		super.setVelocidade(velocidade);
		return true;
		
	}

	@Override
	public boolean setPassageiros(int passageiros) {
		if (passageiros>capacidadeMaxima) {
			return false;
		}
		super.setPassageiros(passageiros);
		return true;
	}


	
}
