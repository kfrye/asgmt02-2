import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck
{
    private static final List<Card> protoDeck = new ArrayList<Card>();
    private static int index;
    
    // initialize prototype deck
    static {
        for (Card.Suit suit : Card.Suit.values())
            for (Card.Rank rank : Card.Rank.values())
                protoDeck.add(new Card(rank, suit));
        index = 0;
    }
    
    /** Shuffle the deck */
    public static void Shuffle() {
        Collections.shuffle(protoDeck);
    }
    
    /** Get a card from the deck */
    public static Card Get() {
        Card card;
        
        // if we come to the end of the deck, start again at the beginning
        if(index >= protoDeck.size()) {
            index = 0;
        }
        card = protoDeck.get(index);
        index++;
        return card;
    }
    
    /** Print the deck */
    public static void Print(int line) {
        int i;
        i = 0;
        for(Card card:protoDeck) {
            i++;
            System.out.printf(card.toString());

            if(i % line == 0) {
                System.out.printf(",\n");
            }
            else if(protoDeck.size() == i) {
                System.out.printf("\n\n");
            }
            else {
                System.out.printf(", ");
            }
        }
        
    }
}
