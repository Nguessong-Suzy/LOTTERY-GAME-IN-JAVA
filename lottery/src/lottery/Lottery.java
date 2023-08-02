/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lottery;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author BOSS
 */
public class Lottery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int lotterynumber = (int) (Math.random() * 900) + 100;
        int usernumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a lottery number"));
        JOptionPane.showMessageDialog(null, "Lottery number: " + lotterynumber);
        int un3 = (int) Math.floor(usernumber / 100);
        int un2 = ((int) Math.floor(usernumber / 10)) % 10;
        int un1 = usernumber % 10;
        int ln3 = (int) Math.floor(lotterynumber / 100);
        int ln2 = ((int) Math.floor(lotterynumber / 10)) % 10;
        int ln1 = lotterynumber % 10;
        boolean num1Matcheslot1 = ln1 == un1;
        boolean num1Matcheslot2 = ln2 == un1;
        boolean num1Matcheslot3 = ln3 == un1;
        boolean num2Matcheslot1 = ln1 == un2;
        boolean num2Matcheslot2 = ln2 == un2;
        boolean num2Matcheslot3 = ln3 == un2;
        boolean num3Matcheslot1 = ln1 == un3;
        boolean num3Matcheslot2 = ln2 == un3;
        boolean num3Matcheslot3 = ln3 == un3;
         if(lotterynumber == usernumber)
        {
             JOptionPane.showMessageDialog(null,"You win $10000!");  
        }
         else if((num1Matcheslot1 && num3Matcheslot2 && num2Matcheslot3)||(num2Matcheslot1 && num1Matcheslot2 && num3Matcheslot3)||(num2Matcheslot1 && num3Matcheslot2 && num1Matcheslot3)||(num3Matcheslot1 && num1Matcheslot2 && num2Matcheslot3)||(num3Matcheslot1 && num2Matcheslot2 && num1Matcheslot3))
         {
             JOptionPane.showMessageDialog(null,"You win $3000!");
         }
         else if((num1Matcheslot1 && num1Matcheslot2)||(num1Matcheslot1 && num1Matcheslot3)||(num1Matcheslot1 && num2Matcheslot1)||(num1Matcheslot1 && num2Matcheslot2)||(num1Matcheslot1 && num2Matcheslot3)||(num1Matcheslot1 && num3Matcheslot1)||(num1Matcheslot1 && num3Matcheslot2)||(num1Matcheslot1 && num3Matcheslot3)||(num1Matcheslot2 && num1Matcheslot3)||(num1Matcheslot2 && num2Matcheslot1)||(num1Matcheslot2 && num2Matcheslot2)||(num1Matcheslot2 && num2Matcheslot3)||(num1Matcheslot2 && num3Matcheslot1)||(num1Matcheslot2 && num3Matcheslot2)||(num1Matcheslot2 && num3Matcheslot3)||(num1Matcheslot3 && num2Matcheslot1)||(num1Matcheslot3 && num2Matcheslot2)||(num1Matcheslot3 && num2Matcheslot3)||(num1Matcheslot3 && num3Matcheslot1)||(num1Matcheslot3 && num3Matcheslot2)||(num1Matcheslot3 && num3Matcheslot3)||(num2Matcheslot1 && num2Matcheslot2)||(num2Matcheslot1 && num2Matcheslot3)||(num2Matcheslot1 && num3Matcheslot1)||(num2Matcheslot1 && num3Matcheslot2)||(num2Matcheslot1 && num3Matcheslot3)||(num2Matcheslot2 && num2Matcheslot3)||(num2Matcheslot2 && num3Matcheslot1)||(num2Matcheslot2 && num3Matcheslot2)||(num2Matcheslot2 && num3Matcheslot3)||(num2Matcheslot3 && num3Matcheslot1)||(num2Matcheslot3 && num3Matcheslot2)||(num2Matcheslot3 && num3Matcheslot3)||(num3Matcheslot1 && num3Matcheslot2)||(num3Matcheslot1 && num3Matcheslot3)||(num3Matcheslot2 && num3Matcheslot3))
         {
             JOptionPane.showMessageDialog(null,"You win $2000!"); 
         }
         else if(num1Matcheslot1||num1Matcheslot2||num1Matcheslot3||num2Matcheslot1||num2Matcheslot2||num2Matcheslot3||num3Matcheslot1||num3Matcheslot2||num3Matcheslot3)
         {
              JOptionPane.showMessageDialog(null,"You win $1000!");
         }
         else
         {
              JOptionPane.showMessageDialog(null,"You loose!");
         }
    }
    
}
