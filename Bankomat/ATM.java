import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM
{
    public static void main (String[] args)

    {
        Card a  = new Card(123,7000);
        Card b = new Card(234, 10000);
        Card c = new Card(345, 5000);
        ATMOperations cashMachine = new ATMOperations();


        List<Card> listCard = new ArrayList<Card>();
        listCard.add(a);
        listCard.add(b);
        listCard.add(c);


        System.out.println("Włóż kartę");
        Scanner scanner = new Scanner(System.in);
        int cardNumber;
        cardNumber = scanner.nextInt();

        cashMachine.isProperly(cardNumber, listCard);
    }

}
