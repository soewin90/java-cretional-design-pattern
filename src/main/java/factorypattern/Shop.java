package factorypattern;

import factorypattern.abstractpkg.Website;
import factorypattern.pages.CartPage;
import factorypattern.pages.ItemPage;

public class Shop extends Website {
  @Override
  public void createWebsite() {
    pages.add(new ItemPage());
    pages.add(new CartPage());
  }
}
