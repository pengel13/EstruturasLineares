package veiculo;

public class VeiculoTeste {
	public static void main(String[] args) {
		Veiculo v1 = new LandRover(09.0, 5);
		System.out.println(v1.acelerar(10));
	}
}
