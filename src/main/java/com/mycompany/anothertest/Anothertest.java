/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anothertest;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;


public class Anothertest {

    public static void main(String[] args) {
               java.awt.EventQueue.invokeLater(new Runnable() {
                   
            public void run() {
                String[] mode = {"Basic", "SciCal", "EcoCal"};
                
              int choices = JOptionPane.showOptionDialog(null, "Select your desired mode:", "Mode Selection", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, mode, null);
              
              switch (choices) {
                  case 0:
                      JOptionPane.showMessageDialog(null, "Initializing...", "Basic Calculator", JOptionPane.INFORMATION_MESSAGE);
                      new Calcu().setVisible(true);
                      break;
                  case 1:
                      JOptionPane.showMessageDialog(null, "Initializing...", "Science Calculator", JOptionPane.INFORMATION_MESSAGE);
                      new SciCal().setVisible(true);
                      break;
                  case 2:
                   JOptionPane.showMessageDialog(null, "Initializing...", "Economic Calculator", JOptionPane.INFORMATION_MESSAGE);
                   new EcoCal().setVisible(true);
                      break;
              }
            }
               });
                       }
}

               
                       


            
               
    

 
