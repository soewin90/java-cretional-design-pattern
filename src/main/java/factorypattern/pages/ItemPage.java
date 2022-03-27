package factorypattern.pages;

import factorypattern.abstractpkg.Page;

public class ItemPage extends Page {
  @Override
  public String pageName() {
    return "CommentPage";
  }
}
