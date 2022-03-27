package factorypattern.pages;

import factorypattern.abstractpkg.Page;

public class SearchPage extends Page {
  @Override
  public String pageName() {
    return "SearchPage";
  }
}
