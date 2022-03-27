package abstractfactorypattern.factory;

import abstractfactorypattern.CreditCard;
import abstractfactorypattern.enumtype.CardTypeEnum;
import abstractfactorypattern.validator.Validator;

public abstract class AbstractCreditFactory {

  public static AbstractCreditFactory getCreditFactory(int creditScore) {
    if (creditScore > 650) {
      return new PaypalFactory();
    } else {
      return new VisaFactory();
    }
  }

  public abstract CreditCard getCreditCard(CardTypeEnum cardTypeEnum);

  public abstract Validator getValidator(CardTypeEnum cardTypeEnum);
}
