package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
         // Ask the user for these values using a confirm dialog like the one below
         
        int day = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println(day);
        if (day == 0) {
        	JOptionPane.showMessageDialog(null, "get up lazybones!");
        }
        else if (day == 1) {
        	JOptionPane.showMessageDialog(null, "Sleep in?");
        }
        else if (day == 2) {
        	JOptionPane.showMessageDialog(null, "Sleep in?");
        }
        
        	
        
    


        /*
         * Print “sleep in"? if it is a vacation or a weekend. 
         * If it’s a weekday, print “get up lazybones!"? 
         * If it is a weekday, but we are on vacation,  print “sleep in"?.
         */
    }
}
