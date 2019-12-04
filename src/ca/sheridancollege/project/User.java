/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * SYST 17796 Project fall 2019 Base code.
 * @author Priya Singh
 *@ author Ravneet Kaur Ranu
 * @author Ridhima Nanda
 * Date: 12/3/2019
*/
public abstract class User{
    
    private ArrayList<Card> hand = new ArrayList<>();
    
    /**
     * @param card An object representing one instance of a card
     * 
     * Adds a card to the ArrayList of hand representing either the dealer or 
     * player's hand
    */
    public void addCard(Card card){
        hand.add(card);
    }
    
    public ArrayList<Card> getHand(){
        return hand;
    }
    
    /**
     * @return int Total value of the cards
     * Adds all the sum of the cards
    */
    public int cardTotal(){
        int total = 0;
        for(int i = 0; i < hand.size(); i++){
            total += hand.get(i).getValue().getValue();
        }
        return total;
    }

    public double stand(){
        return cardTotal();
    }
    
    /**
     * @return String 
     * @param name Player's name
     * 
     * String consists of the card object and the total value of the cards in 
     * the hand
    */
    public String printHand(String name){
        name += "'s hand\n";
        for(int i = 0; i < hand.size(); i++){
            name += hand.get(i) + "\n";
        }
        name += "Total: " + cardTotal() + "\n";
        return name;
    }
}
