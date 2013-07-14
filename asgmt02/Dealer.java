import java.util.ArrayList;
import java.util.List;

public class Dealer
{
    private static List<Hand> table = new ArrayList<Hand>();
    
    public static void Deal(int nGames, int nHands, int cardsPerHand, int cardsPerLine, boolean shuffle) { 
        for(int i = 0; i < nHands; i++) {
            Hand objHand = new Hand();
            table.add(objHand);
        }
        
        if(shuffle)
            Deck.Shuffle();
        
        // print the deck
        Deck.Print(cardsPerLine);
        
        // For each game
        for(int i = 0; i < nGames; i++) {
            
            // Deal the cards
            for(int j = 0; j < cardsPerHand; j++) {
                for(int k = 0; k < nHands; k++) {
                    Card card;
                    
                    // Get a card from the deck
                    card = Deck.Get();
                    
                    // Add the card to the hand
                    table.get(k).Add(card);
                }
            }
            
            // Print the games
            System.out.printf("=== Game " + (i + 1) + " ===\n\n" );
            
            for(int k = 0; k < nHands; k++) {
                System.out.printf("--- Hand " + (k + 1) + " ---\n\n");
                
                // print the hand
                table.get(k).Print(cardsPerLine);
                
                // clear the hand
                table.get(k).Toss();
            }
        }
        
        System.out.printf("=== Games Complete ===\n");
    }
}
