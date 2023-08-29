package labCinema;

public class Assento {
	private int fileira;
	private int coluna;
	
	public Assento (char fileira, int coluna) {
		this.setColuna(coluna);
		this.setFileira(fileira);
	}

	public int getFileira() {
		return fileira;
	}

	public boolean setFileira(char fileira) {
		
		this.fileira = fileira;
		return true;
	}
	
	public int passaPraInt(char fileira) {
		return 1;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

}
