/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2cardgame;

/** model class- define card details
 *
 * @author sivagamasrinivasan
 */
public class Card 
{
    // 2 variable value- int and suit - string
    
    private String suit;
    private int value;

   public Card(String s, int v)
   {
      this.suit=s;
      this.value=v;
   }
    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
}
