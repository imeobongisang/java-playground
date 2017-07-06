package com.epb.playground.review;


public class PlayingCard {
    private Rank rank;
    private Suit suit;

    public PlayingCard(String rank, String suit) {
        if(rank.toUpperCase() == this.rank && suit.toUpperCase() == this.suit) {
            this.rank = rank.toUpperCase();
            this.suit = suit.toUpperCase();
        } else {
            throw new RuntimeException("Attempted to make invalid card");
        }

    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof PlayingCard))
            throw new RuntimeException("You must compare a valid playing card");
        
        PlayingCard comparedCard = (PlayingCard) object;

        if(this.rank == comparedCard.getRank() && this.rank == comapredCard.getSuit)
            return true;
        else
            return false;

        
    }

    public String getCard(){
        return "You have the card, " + rank + ", from the " +  suit + " suit.";
    }

    public String getRank() {
        return this.rank;        
    }
    

    public String getSuit() {
        return this.suit;        
    }
    


}