package abstractfactorypattern.validator;

import abstractfactorypattern.CreditCard;

public interface Validator {

  public boolean isValid(CreditCard card);
}
