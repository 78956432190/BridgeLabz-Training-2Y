package Level3;
import java.util.Random;
import java.util.Scanner;

public class CardDeck {
    public static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = random.nextInt(deck.length);
            // swap
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public static void displayDeck(String[] deck) {
        for (String card : deck) {
            System.out.println(card);
        }
    }

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        displayDeck(deck);
    }
}
