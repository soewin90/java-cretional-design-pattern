package Builder;

public class LunchOrderDemo {

  public static void main(String[] args) {
    /** the problem here is if you are not setting a proper value or omit then it will print null */
    LunchOrderBean lunchOrderBean = new LunchOrderBean();
    lunchOrderBean.setDressing("Mustard");
    lunchOrderBean.setMeat("Chicken");
    System.out.println(lunchOrderBean.getBread()); // this will print null which cause problem

    /**
     * let's try telescoping , problem is if need to add sandwich or don't wannn add meat, then need
     * to create new constructor
     */
    LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Chicken");
    LunchOrderTele lunchOrderTele1 = new LunchOrderTele("Bread");
    System.out.println(lunchOrderTele.toString());

    LunchOrderBuilderPattern.Builder lunchOrderBuilder1 = new LunchOrderBuilderPattern.Builder();
    lunchOrderBuilder1.bread("Wheat").condiments("Lettuce").dressing("Mustrad").meat("Chicken");
    LunchOrderBuilderPattern pattern = lunchOrderBuilder1.build();
    System.out.println(pattern.getBread());
    System.out.println(pattern.getCondiments());

    // another way of initiation
    pattern =
        new LunchOrderBuilderPattern.Builder()
            .bread("Wheat")
            .condiments("Lettuce")
            .dressing("Mustrad")
            .meat("Chicken")
            .build();
    System.out.println(pattern.getBread());
    System.out.println(pattern.getCondiments());
  }
}
