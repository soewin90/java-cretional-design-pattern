package abstractfactorypattern.factory;

import abstractfactorypattern.CreditCard;
import abstractfactorypattern.enumtype.CardTypeEnum;
import abstractfactorypattern.validator.Validator;
import abstractfactorypattern.visa.VisaGoldCreditCard;
import abstractfactorypattern.visa.VisaGoldValidator;
import abstractfactorypattern.visa.VisaPlatinumCreditCard;
import abstractfactorypattern.visa.VisaPlatinumValidator;

public class VisaFactory extends AbstractCreditFactory {
  @Override
  public CreditCard getCreditCard(CardTypeEnum cardTypeEnum) {
    switch (cardTypeEnum) {
      case PLATINUM:
        return new VisaPlatinumCreditCard();
      case GOLD:
        return new VisaGoldCreditCard();
      default:
        return null;
    }
  }

  @Override
  public Validator getValidator(CardTypeEnum cardTypeEnum) {
    switch (cardTypeEnum) {
      case PLATINUM:
        return new VisaPlatinumValidator();
      case GOLD:
        return new VisaGoldValidator();
      default:
        return null;
    }
  }
}
