package conversaoObjetos;

public class Letra {
	public String getBar(int i) throws LetraErro {
		if (i == 0) {
			// throw our custom exception
			throw new LetraErro("Não pode ser 0 keka burro");
		} else {
			return "Thanks";
		}
	}
}
