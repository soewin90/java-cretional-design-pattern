package abstractfactorypattern.visa;

import abstractfactorypattern.CreditCard;
import abstractfactorypattern.validator.Validator;

public class VisaGoldValidator implements Validator {
  @Override
  public boolean isValid(CreditCard card) {
    if (card.getCardNumberLength() < 0) {
      return false;
    }
    if (card.getCardNumber() < 0) {
      return false;
    }
    return true;
  }
}
