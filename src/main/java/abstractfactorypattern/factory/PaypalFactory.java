package abstractfactorypattern.factory;

import abstractfactorypattern.CreditCard;
import abstractfactorypattern.enumtype.CardTypeEnum;
import abstractfactorypattern.paypal.PaypalGoldCardValidator;
import abstractfactorypattern.paypal.PaypalGoldCreditCard;
import abstractfactorypattern.paypal.PaypalPlatinumCardValidator;
import abstractfactorypattern.paypal.PaypalPlatinumCreditCard;
import abstractfactorypattern.validator.Validator;

public class PaypalFactory extends AbstractCreditFactory {
  @Override
  public CreditCard getCreditCard(CardTypeEnum cardTypeEnum) {
    switch (cardTypeEnum) {
      case PLATINUM:
        return new PaypalPlatinumCreditCard();
      case GOLD:
        return new PaypalGoldCreditCard();
      default:
        return null;
    }
  }

  @Override
  public Validator getValidator(CardTypeEnum cardTypeEnum) {
    switch (cardTypeEnum) {
      case PLATINUM:
        return new PaypalPlatinumCardValidator();
      case GOLD:
        return new PaypalGoldCardValidator();
      default:
        return null;
    }
  }
}
