import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game
{

    List<Player> listOfPlayers = new ArrayList<>();


    public void newGame(){
        System.out.println("MUNCHKIN COUNTER");
        System.out.println("1. Nowa gra");
        System.out.println("2. Wyjdź z gry");

        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();

        switch (userChoice){
            case 1 -> createPlayers();
            case 2 -> System.exit(0);
        }
    }

    public void addToList (Player player){
        listOfPlayers.add(player);
    }

    public void iterateOverListOfPlayers() {
        boolean isTrue = true;

        while (isTrue) {
            for (int i = 0; i < listOfPlayers.size(); i++) {
                listOfPlayers.get(i).showPlayer();

                boolean choice = true;
                while(choice) {
                    System.out.println("1. Dodaj level");
                    System.out.println("2. Dodaj siłę");
                    System.out.println("3. Następny gracz");

                    Scanner scanner = new Scanner(System.in);
                    int userChoice = scanner.nextInt();

                    switch (userChoice) {
                        case 1 -> {
                            listOfPlayers.get(i).setLevel();
                            listOfPlayers.get(i).showPlayer();
                            System.out.println("Dodałes lvl");

                        }
                        case 2 -> {listOfPlayers.get(i).setPower();
                            listOfPlayers.get(i).showPlayer();
                            System.out.println("Dodałes sile");

                        }
                        case 3 -> choice = false;

                    }
                }
            }
        }
    }

    public void createPlayers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę graczy");
        int numberOfPlayers = scanner.nextInt();

        for (int i =0;i<numberOfPlayers; i++){
            int index = i+1;
            System.out.println("Podaj imię dla gracza numer "+index);
            String name = scanner.next();

            Player newPlayer = new Player(name,1,1);
            addToList(newPlayer);
        }
        iterateOverListOfPlayers();
    }
        



}
