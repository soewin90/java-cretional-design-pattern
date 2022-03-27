package Prototype;

import Prototype.Category.Book;
import Prototype.Category.Movie;
import Prototype.Category.Registry;

import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

  public static void main(String[] args) {
    // Prototype sample without any help from Registry/Client with Shallow Copy
    String sql = "select * from book";
    List<String> parameters = new ArrayList<>();
    parameters.add("star war");
    Statement statement = new Statement(sql, parameters, new Record());
    System.out.println("First Statement: " + statement);
    System.out.println(statement.getSql());
    System.out.println(statement.getParameters());
    System.out.println(statement.getRecord());
    Statement secondStatement = statement.clone();
    System.out.println("Second Statement: " + secondStatement);
    System.out.println(secondStatement.getSql());
    System.out.println(secondStatement.getParameters());
    System.out.println(secondStatement.getRecord());

    Registry registry = new Registry();
    Movie movie = (Movie) registry.createItem("Movie");
    System.out.println("First movie: " + movie);
    System.out.println(movie.getTitle());
    System.out.println(movie.getRuntime());
    Movie secondMovie = (Movie) registry.createItem("Movie");
    System.out.println("Second movie: " + secondMovie);
    System.out.println(movie.getTitle());
    System.out.println(movie.getRuntime());

    Book book = (Book) registry.createItem("Book");
    System.out.println("First Book: " + book);
    System.out.println(book.getTitle());
    System.out.println(book.getNumberOfPages());
  }
}
