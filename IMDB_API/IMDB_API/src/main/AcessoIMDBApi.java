package main;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import com.google.gson.Gson;

public class AcessoIMDBApi {

	/*
	 * Acesso a Base de Dados IMDB via API
	 * 
	 * Link: https://imdb-api.com/api (Decrecated!) private static final String
	 * TOP_250_MOVIES = "https://imdb-api.com/en/API/Top250TVs/" + SUA_CHAVE;
	 * private static final String TOP_250_TVS =
	 * "https://imdb-api.com/en/API/Top250TVs/"+ SUA_CHAVE; private static final
	 * String TOP_MOST_POPULAR_MOVIES =
	 * "https://imdb-api.com/en/API/MostPopularMovies/" + SUA_CHAVE; private static
	 * final String TOP_MOST_POPULAR_TVS =
	 * "https://imdb-api.com/en/API/MostPopularTVs/" + SUA_CHAVE;
	 * 
	 * Link Atual: http://www.omdbapi.com/ Primeiro, cadastre um usuário para gerar
	 * uma chave de acesso. Depois, altere a constante SUA_CHAVE, incluindo a chave
	 * gerada.
	 */
	private static final String SUA_CHAVE = "a1ef934e";// <Sua chave aqui>";
	private static final String OMDB_LINK = "http://www.omdbapi.com/?s=Game&apikey=" + SUA_CHAVE;

	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(OMDB_LINK)).build();
		String resposta = "";
		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			if (response.statusCode() == 200) {
				System.out.println(response.body());
				resposta = response.body();
			}

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

		try {
			FileWriter file = new FileWriter("C:\\Users\\PEDROENGEL\\Documents\\IMDB_API\\file.json");
			file.write(resposta);
			file.flush();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
