/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 * SYST 17796 Project fall 2019 Base code.
 * @author Priya Singh
 *@ author Ravneet Kaur Ranu
 * @author Ridhima Nanda
 * Date: 12/3/2019
*/
public class Balance{

    private double totalBalance;
    
    /**
     * @return double A getter for the totalBalance variable
    */
    public double getTotalBalance(){
        return totalBalance;
    }
    
    /**
     * @param totalBalance Money being added to a player's balance
    */
    public void setTotalBalance(double totalBalance){
        this.totalBalance = totalBalance;
    }
    
    /**
     * @param money Bet amount
     * @return double Returns the final calculation
     * 
     * Method returns how much the totalBalance is after bet is subtracted
     * from it
    */
    public double loseBalance(double money){
        totalBalance = totalBalance - money;
        return totalBalance;
    }
    
    /**
     * @param money Bet amount
     * @return double The final amount after calculation
     * 
     * Method returns totalBalance after adding the money to it
    */
    public double addBalance(double money){
        totalBalance = totalBalance + money;
        return totalBalance;
    }
}
