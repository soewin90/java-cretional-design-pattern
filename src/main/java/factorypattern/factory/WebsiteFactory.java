package factorypattern.factory;

import factorypattern.Blog;
import factorypattern.Shop;
import factorypattern.WebsiteTypeEnum;
import factorypattern.abstractpkg.Website;

public class WebsiteFactory {

  public static Website getWebsite(WebsiteTypeEnum websiteType) {
    switch (websiteType) {
      case BLOG:
        {
          return new Blog();
        }
      case SHOP:
        {
          return new Shop();
        }

      default:
        return null;
    }
  }
}
