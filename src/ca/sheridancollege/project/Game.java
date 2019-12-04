/**
 * SYST 17796 Project fall 2019 Base code.
 * @author Priya Singh
 *@ author Ravneet Kaur Ranu
 * @author Ridhima Nanda
 * Date: 12/3/2019
*/
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 */
public class Game{

    private Player p;
    private Dealer d;
    private Deck deck;
    private final double WIN_RATIO = 1.5;

    public Game(Player p, Dealer d, Deck deck){
        this.p = p;
        this.d = d;
        this.deck = deck;
    }

    public double getWIN_RATIO(){
        return WIN_RATIO;
    }

    public Player getP(){
        return p;
    }

    public Dealer getD(){
        return d;
    }

    public Deck getDeck(){
        return deck;
    }
}
