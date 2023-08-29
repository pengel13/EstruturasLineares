package filmeSeriado;

public class FilmeTeste {

	public static void main(String[] args) {
		Filme f1 = new Filme();
		f1.setCodigo(1212);
		f1.setAno(2012);
		f1.setTitulo("Até que a sorte nos separe");
		f1.setDiretor("Arthur Kellermana");
		f1.setAtores("Leandro Hassum");
		f1.setTipo(TipoVideo.FILME);

		Filme f2 = new Filme();
		f2.setCodigo(1515);
		f2.setAno(2016);
		f2.setTitulo("Gente Grande");
		f2.setDiretor("Lorenzo Kisrt");
		f2.setAtores("Adam Sandler");
		f2.setTipo(TipoVideo.FILME);

		Filme f3 = new Filme();
		f2.setCodigo(1515);
		f2.setAno(2020);
		f2.setTitulo("Grey's Anathomy");
		f2.setDiretor("Pedro Engel");
		f2.setAtores("Docotr grey");
		f2.setTipo(TipoVideo.SERIADO);

		ListaFilmes l1 = new ListaFilmes(10);
		l1.adicionaFilme(f1);
		l1.adicionaFilme(f2, 1);
		l1.adicionaFilme(f3, 3);

		Filme[] lista = l1.getListaFilmes();

		for (int i = 0; i < lista.length; i++) {
			Filme f = lista[i];
			if (f != null) {
				System.out.println(f.getAno());
				System.out.println(f.getTipo());
				System.out.println(f.getCodigo());
				System.out.println(f.getAtores());
				System.out.println(f.getDiretor());
				System.out.println(f.getTitulo());
			}
		}
	}

}
