package abstractfactorypattern;

import abstractfactorypattern.enumtype.CardTypeEnum;
import abstractfactorypattern.factory.AbstractCreditFactory;
import abstractfactorypattern.validator.Validator;

public class AbstractFactoryDemo {

  public static void main(String[] args) {
    AbstractCreditFactory abstractCreditFactory =
        AbstractCreditFactory.getCreditFactory(750); // paypalfactory-platinum
    CreditCard creditCard = abstractCreditFactory.getCreditCard(CardTypeEnum.PLATINUM);
    System.out.println(creditCard);
    creditCard.setCardNumber(123);
    creditCard.setCardNumberLength(-1);
    Validator validator = abstractCreditFactory.getValidator(CardTypeEnum.PLATINUM);
    boolean isValid = validator.isValid(creditCard);
    System.out.println(isValid);

    abstractCreditFactory = AbstractCreditFactory.getCreditFactory(649); // visafactory-platinum
    creditCard = abstractCreditFactory.getCreditCard(CardTypeEnum.PLATINUM);
    System.out.println(creditCard);
    creditCard.setCardNumber(123);
    creditCard.setCardNumberLength(-1);
    validator = abstractCreditFactory.getValidator(CardTypeEnum.PLATINUM);
    isValid = validator.isValid(creditCard);
    System.out.println(isValid);
  }
}
