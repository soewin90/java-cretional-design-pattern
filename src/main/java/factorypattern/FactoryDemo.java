package factorypattern;

import factorypattern.abstractpkg.Page;
import factorypattern.abstractpkg.Website;
import factorypattern.factory.WebsiteFactory;

public class FactoryDemo {

  public static void main(String args[]) {
    Website site = WebsiteFactory.getWebsite(WebsiteTypeEnum.BLOG);

    Page myPage = site.getPages().get(0);
    System.out.println(myPage.pageName());
    myPage = site.getPages().get(1);
    System.out.println(myPage.pageName());
    myPage = site.getPages().get(2);
    System.out.println(myPage.pageName());

    site = WebsiteFactory.getWebsite(WebsiteTypeEnum.SHOP);

    myPage = site.getPages().get(0);
    System.out.println(myPage.pageName());
    myPage = site.getPages().get(1);
    System.out.println(myPage.pageName());
  }
}
