package main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) throws IOException {

        String json
                = String.join(" ",
                        Files.readAllLines(
                                Paths.get("./resources/arquivo.json"),
                                StandardCharsets.UTF_8)
                );
        
        Pessoa p = new Gson().fromJson(json, Pessoa.class);

        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getLista());
        System.out.println("");
        System.out.println(p.getCidade().getNome());
        System.out.println(p.getCidade().getEstado());
    }
}