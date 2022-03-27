package Prototype.Category;

import java.util.HashMap;
import java.util.Map;

public class Registry {

  private Map<String, Item> itemMap = new HashMap<>();

  public Registry() {
    loadItems();
  }

  public Item createItem(String type) {
    Item item = null;
    try {
      item = (Item) itemMap.get(type).clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return item;
  }

  private void loadItems() {
    Movie movie = new Movie();
    movie.setRuntime("2.5 hr");
    movie.setPrice(500);
    movie.setTitle("Star War");
    movie.setUrl("abc.com");
    itemMap.put("Movie", movie);

    Book book = new Book();
    book.setPrice(100);
    book.setTitle("Star War Epic");
    book.setUrl("xyz.com");
    book.setNumberOfPages(50);
    itemMap.put("Book", book);
  }
}
