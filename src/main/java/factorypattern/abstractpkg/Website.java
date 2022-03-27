package factorypattern.abstractpkg;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

  protected List<Page> pages = new ArrayList<Page>();

  // step: 1
  public Website() {
    this.createWebsite();
  }

  // step: 2
  public List<Page> getPages() {
    return pages;
  }

  public abstract void createWebsite();
}
