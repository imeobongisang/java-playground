package com.epb.playground.review;

import java.util.*;

public class CardHouse{
    public static void main(String[] args) {
        PlayingCard playingCard = new PlayingCard(Rank.JACK, Suit.DIAMONDS);
        List<PlayingCard> playingCards = new ArrayList();

        for (Rank rank : Rank.values()) {
            for(Suit suit : Suit.values()) {
                playingCards.add(new PlayingCard(rank, suit));
            }
        }
        
        DeckOfCards deckOfCards = new DeckOfCards();
        System.out.println(playingCards);
        

    }
}