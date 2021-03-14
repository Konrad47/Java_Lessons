import java.util.List;
import java.util.Scanner;

public class ATMOperations
{
    public void isProperly(int cardFromAtm, List<Card> listOfCard)
    {
        int sizeOfListCard = listOfCard.size();
        for(int i=0; i<sizeOfListCard; i++)
        {
            Card cardTemp = listOfCard.get(i);
            if(cardFromAtm== cardTemp.getCardNumber())
            {
                atmOperation(cardTemp);
            }
        }
    }
    public void informationAboutMoney(Card numberOfCard)
    {
        System.out.println("Numer karty: " + " " + numberOfCard.getCardNumber());
        System.out.println("Stan konta: " + " " + numberOfCard.getAccountBalance());
    }
    public void cashWithdrawal(Card numberOfCard)
    {
        Scanner scanner = new Scanner(System.in);

        boolean shouldContinue = true;
        while(shouldContinue)
        {
            System.out.println("Ile wypłacić: ");
            int paymentValue = scanner.nextInt();
            if(paymentValue<=0)
            {
                System.out.println("Proszę podać wartość większą od zera");
            }
            if(paymentValue > numberOfCard.getAccountBalance())
            {
                System.out.println("Za mało środków na koncie");
            }
            if(paymentValue > 0 && paymentValue < numberOfCard.getAccountBalance())
            {
                numberOfCard.setAccountBalance(paymentValue);
                System.out.println("Saldo: " + numberOfCard.getAccountBalance());
                shouldContinue = false;

            }
        }

    }
    public void atmOperation(Card numberOfCard)
    {
        boolean shouldContinue = true;

        while (shouldContinue)
        {
            System.out.println("Wybierz numer");
            System.out.println("1. Informacje o koncie");
            System.out.println("2. Wypłata gotówki");
            System.out.println("3. Wyjście ");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            switch (userChoice)
            {
                case 1 -> informationAboutMoney(numberOfCard);
                case 2 -> cashWithdrawal(numberOfCard);
                case 3 -> shouldContinue = false;
            }
        }


    }
}

