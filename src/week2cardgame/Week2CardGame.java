/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2cardgame;

import java.util.Scanner;

/**view class- User interaction 
 *
 * @author sivagamasrinivasan
 */
public class Week2CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // value and suit access by object of the card class
        Card[] deck = new Card[4]; // 4 cards // array of objects
        Scanner in= new Scanner(System.in);
        
        System.out.println("enter 4 cards detail: ");
        for( int i=0;i<deck.length;i++)
        {
//            Card s1 = new Card();// - s1 object 
//            deck[i]=s1;
            deck[i]= new Card(in.next(),in.nextInt());
        }
        
        System.out.println("your 4 cards details: ");
        for( int i=0;i<deck.length;i++)
        {

            System.out.println(deck[i].getSuit() + " "+ deck[i].getValue() );
        }
        
    }
    
}
