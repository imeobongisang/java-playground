package com.epb.playground.review;
import java.util.*;

public class DeckOfCards {
    private static int numberOfCards = 0;
    private PlayingCard[] playingCards = new PlayingCard[52];
    
    public DeckOfCards(List<PlayingCard> playingCards){
        int loadedCardCount = playingCards.length;
        
        if(loadedCardCount + numberOfCards > 52) {
            throw new RuntimeException("Number of cards in the deck cannot exceed 52");
        }
        List<PlayingCard> cards = Arrays.asList(playingCards);
        List<PlayingCard> cards2 = Arrays.asList(this.playingCards);
        playingCards
            .stream()
            .forEach(playingCard -> {
                     this.card2
                            .stream()
                            .forEach(otherPlayingCard -> {
                                if(otherPlayingCard.equals(playingCard)) {
                                    throw new RuntimeException("You cannot have duplicate Cards");
                                }   
                            }); 
            });
        
        this.playingCards = playingCards;
    }

    public void addCard(PlayingCard... playingCards) {
        if(loadedCardCount + numberOfCards > 52) {
            throw new RuntimeException("Number of cards in the deck cannot exceed 52");
        }
        List<playingCard> cards = Arrays.asList(playingCards);
        cards
            .stream()
            .forEach(playingCard -> this.playingCards.add(playingCard));

    }

   public void showCards(){
        this.playingCards.stream.forEach(System.out::println);
   }
}