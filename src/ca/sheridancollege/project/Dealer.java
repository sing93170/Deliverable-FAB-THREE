package ca.sheridancollege.project;
/**
 * SYST 17796 Project fall 2019 Base code.
 * @author Priya Singh
 *@ author Ravneet Kaur Ranu
 * @author Ridhima Nanda
 * Date: 12/3/2019
*/
public class Dealer extends User{

    public Dealer(){
    }

    ;
    
    /**
     * @return boolean Returns true/false when the method executes
     * 
     * This method is used for calculating if the dealer has a total value of 
     * cards less than 16 or not
    */
    public boolean check(){
        boolean temp = false;
        if(super.cardTotal() < 16){
            temp = true;
        }
        return temp;
    }
}