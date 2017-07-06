package com.epb.playground.review;
public class DeckOfCards {
    private static int numberOfCards = 0;
    private PlayingCard[] playingCards = new PlayingCard[52];
    
    public DeckOfCards(PlayingCard... playingCards){
        int loadedCardCount = playingCards.length;
        
        if(loadedCardCount + numberOfCards > 52) {
            throw new RuntimeException("Number of cards in the deck cannot exceed 52");
        }

        playingCards.stream.forEach(playingCard -> {
                this.playingCards.stream.forEach(otherPlayingCard -> {
                    if(otherPlayingCard.equals(playingCard)) {
                        throw new RuntimeException("You cannot have duplicate Cards");
                    }
                });
                
        });
        
    }

    public void addCard() {

    }
}