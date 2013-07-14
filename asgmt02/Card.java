public class Card
{
    public enum Rank
    {
        ACE(11), KING(10), QUEEN(10), JACK(10), TEN(10), NINE(9), EIGHT(8),
        SEVEN(7), SIX(6), FIVE(5), FOUR(4), THREE(3), DEUCE(2);
    
        private Integer score;
        
        // Assign a score to each rank
        Rank(Integer score) {
            this.score = score;
        }
    }
    
    public enum Suit
    {
         HEARTS(4), DIAMONDS(3), CLUBS(2), SPADES(1);
         private Integer score;
         
         // Assign a score to each suit
         Suit(Integer score) {
             this.score = score;
         }
    }
    
    private final Rank  rank;
    private final Suit  suit;
    
    Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }
    
    public Rank rank()          { return rank; }
    public Suit suit()          { return suit; }
    public String toString()    { return rank + " of " + suit + "(" + Score() + ")"; }
    
    /** Get card score from its rank and suit */
    public int Score() {
        return suit.score * rank.score;
    }
}
