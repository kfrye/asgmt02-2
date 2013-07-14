import java.util.ArrayList;
import java.util.List;

public class Hand
{
private List<Card> hand = new ArrayList<Card>();
    
    /** Add a card to the hand */
    public void Add(Card card) {
        hand.add(card);
    }
    
    /** Print the hand */
    public void Print(int line) {
        int i = 0;
        int score = 0;
        
        for(Card card:hand) {
            i++;
            score += card.Score();
            System.out.printf(card.toString());
            
            // start a new line
            if(i % line == 0) {
                System.out.printf(",\n");
            }
            
            // end of the hand. Don't print a comma.
            else if(hand.size() == i) {
                System.out.printf("\n");
            }
            
            // mid-line. Print a comma
            else {
                System.out.printf(", ");
            }
        }
        System.out.printf("score = " + score + "\n\n");
    }
    
    /** Clear the hand */
    public void Toss() {
        hand.clear();
    }
}
