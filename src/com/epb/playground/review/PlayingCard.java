package com.epb.playground.review;


public class PlayingCard {
    private Rank rank;
    private Suit suit;

    public PlayingCard(Rank rank, Suit suit) {
        if (rank == null || suit == null){
            throw new RuntimeException("Attempted to make invalid card");
        }

         this.rank = rank;
         this.suit = suit;
      
    }

    @Override
    public boolean equals(Object object){
        if(!(object instanceof PlayingCard))
            throw new RuntimeException("You must compare a valid playing card");
        
        PlayingCard comparedCard = (PlayingCard) object;

        if(this.rank == comparedCard.getRank() && this.suit == comparedCard.getSuit())
            return true;
        else
            return false;

        
    }

   

    public Rank getRank() {
        return this.rank;        
    }
    

    public Suit getSuit() {
        return this.suit;        
    }
    
    public void setRank(Rank rank) {
         this.rank = rank;        
    }
    

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    
    @Override
    public String toString(){
        return "{rank : " + this.rank  + ", suit : " + this.suit + "}";
    }


}