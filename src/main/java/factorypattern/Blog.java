package factorypattern;

import factorypattern.abstractpkg.Website;
import factorypattern.pages.AboutPage;
import factorypattern.pages.CommentPage;
import factorypattern.pages.PostPage;

public class Blog extends Website {
  @Override
  public void createWebsite() {
    pages.add(new PostPage());
    pages.add(new AboutPage());
    pages.add(new CommentPage());
  }
}
