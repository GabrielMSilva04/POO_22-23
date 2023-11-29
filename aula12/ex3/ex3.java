package aula12.ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<Movie>();
        String filename = "movies.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] palavras = line.split("\t");
                // Percorre o array de palavras
                String name = palavras[0];
                Float score = Float.valueOf(palavras[1]);
                String rating = palavras[2];
                String genre = palavras[3];
                Integer runningTime = Integer.valueOf(palavras[4]);
                Movie movie = new Movie(name, score, rating, genre, runningTime);
                movieList.add(movie);
            }
        }
        catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
        //b) Ordenar o array de filmes pelo nome
        movieList = sortedByName(movieList);

        // Imprimir o array de filmes
        System.out.println("Sorted By Name:");
        for (Movie movie : movieList) {
            System.out.println(movie);
            System.out.println();
        }

        //c) Ordenar o array de filmes pelo nome
        movieList = sortedByScore_RunningTime(movieList);

        // Imprimir o array de filmes
        System.out.println("Sorted By Descending score and Running time:");
        for (Movie movie : movieList) {
            System.out.println(movie);
            System.out.println();
        }

        //d) Listar os géneros de filmes existentes
        HashMap<String, Integer> genres = listGenres(movieList);
        System.out.println("Genres:");
        System.out.println(genres);

        //e) Escrever num ficheiro de texto os filmes com score superior a 60 e "genre" escolhido
        writeMySelection(movieList, "comedy");
    }

    static ArrayList<Movie> sortedByName(ArrayList<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getName));
        return movies;
    }

    static ArrayList<Movie> sortedByScore_RunningTime(ArrayList<Movie> movies) {
        movies.sort(Comparator.comparing(Movie::getScore).reversed().thenComparing(Movie::getRunningTime));
        return movies;
    }

    static HashMap<String, Integer> listGenres(ArrayList<Movie> movies) {
        HashMap<String, Integer> genres = new HashMap<String, Integer>();
        for (Movie movie : movies) {
            String genre = movie.getGenre();
            if (genres.containsKey(genre)) {
                genres.put(genre, genres.get(genre) + 1);
            } else {
                genres.put(genre, 1);
            }
        }
        return genres;
    }

    static void writeMySelection(ArrayList<Movie> movies, String genre) {
        //e) Escrever num ficheiro de texto os filmes com score superior a 60
        //e género escolhido
        ArrayList<Movie> moviesWithScore = new ArrayList<Movie>();
        for (Movie movie : movies) {
            if (movie.getScore() > 60 && movie.getGenre().equals(genre)) {
                moviesWithScore.add(movie);
            }
        }
        moviesWithScore = sortedByName(moviesWithScore);
        // Escrever no ficheiro
        try {
            FileWriter myWriter = new FileWriter("myselection.txt");
            for (Movie movie : moviesWithScore) {
                myWriter.write(movie.toString());
                myWriter.write("\n\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
