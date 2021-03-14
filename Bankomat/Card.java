
public class Card {
    private int cardNumber;
    private int accountBalance;

    public Card(int cardNumber, int accountBalance)
    {
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
    }

    public int getCardNumber()
    {
        return cardNumber;
    }

    public int getAccountBalance()
    {
        return accountBalance;
    }

    public void setAccountBalance(int expenses)
    {
        accountBalance = accountBalance - expenses;
    }
}
