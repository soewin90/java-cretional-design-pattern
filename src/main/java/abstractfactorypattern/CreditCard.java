package abstractfactorypattern;

public abstract class CreditCard {

  protected int cardNumber;
  protected int cardNumberLength;

  public int getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(int cardNumber) {
    this.cardNumber = cardNumber;
  }

  public int getCardNumberLength() {
    return cardNumberLength;
  }

  public void setCardNumberLength(int cardNumberLength) {
    this.cardNumberLength = cardNumberLength;
  }
}
