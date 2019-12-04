/**
 * SYST 17796 Project fall 2019 Base code.
 * @author Priya Singh
 *@ author Ravneet Kaur Ranu
 * @author Ridhima Nanda
 * Date: 12/3/2019
*/
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public class Player extends User{

    private String playerID; //the unique ID for this player
    private Balance balance;

    public Player(String name){
        playerID = name;
        balance = new Balance();
    }

    public Balance getBalance(){
        return balance;
    }

    public String getPlayerID(){
        return playerID;
    }
    
    public void setBalance(Balance balance){
        this.balance = balance;
    }
    
    /**
     * Returns a String that has the totalBalance of the Player
     * @return String 
    */
    public String printBalance(){
        return "Balance Total: $" + balance.getTotalBalance();
    }
}
