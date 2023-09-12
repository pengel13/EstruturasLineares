package filmeSeriado;

public class FilmeTeste {

	public static void main(String[] args) {
		Filme f1 = new Filme(1212, 2012, "Até que a sorte nos separe", "Arthur Kellerman", "Leandro Hassum", TipoVideo.FILME);

		Filme f2 = new Filme(1515, 2016, "GENTE RANDE", "LORENZO KIRST", "ADAM SANDLER", TipoVideo.FILME);

		Filme f3 = new Filme(1515,2020, "GREYS ANATOMY", "PEDRO ENGEL", "DCOOTR GREY", TipoVideo.SERIADO);


		ListaFilmes l1 = new ListaFilmes(10);
		l1.adicionaFilme(f1);
		l1.adicionaFilme(f2,0);
		l1.adicionaFilme(f3,2);

		Filme[] lista = l1.getListaFilmes();
		
		for (int i = 0; i < lista.length; i++) {
			Filme f = lista[i];
			if (f != null) {
				System.out.println(f.toString());
			}
		}
	}

}
