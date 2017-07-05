public class PlayingCard {
    private String rank;
    private String suit;

    public PlayingCard(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getCard(){
        return "You have the card, " + rank + ", from the " +  suit + " suit.";
    }
}