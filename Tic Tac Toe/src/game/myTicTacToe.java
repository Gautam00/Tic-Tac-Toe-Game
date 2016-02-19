/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
 *
 * @author SHAKIB
 */
//*******************Start ActionListener Class********************
public  class myTicTacToe extends JFrame implements ActionListener {
    
    private JButton Buttons[];
    private int count;
    //ConsTructor
    public myTicTacToe()
    {
        count = 0;
        setTitle("My Tic Tac Toe By Md Nazmus Shakib");//Title Name
        setSize(500,500);//Size 
        setVisible(true);//Window Visible 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the window
        setLayout(new GridLayout(3,3));//Layout size
        Buttons =new JButton[9];//number of buutons
        for(int i=0;i<Buttons.length;i++)
        {
            Buttons[i]=new JButton();
            add(Buttons[i]);//add buttons
             Buttons[i].addActionListener(this);
        }        
    }
//*************End of Constractor*****************
   
    
    //<<<<<<<<<<<<ActionPerformed Class Started>>>>>>>>>>>>>>>>
    
    public void actionPerformed(ActionEvent e)
    {
        
       Object  O = e.getSource();//action command specific for a JButton
      
       for(int j=0;j<Buttons.length;j++)
       {
       
        if(O==Buttons[j])
           {
                if(count%2==0)
                {
                     Buttons[j].setText("O");
                     count++;
                     Buttons[j].setBackground(Color.GREEN);
                }
                else 
                {
                    Buttons[j].setText("X");
                    count++;
                    Buttons[j].setBackground(Color.RED);
                       
                }
                
                 Buttons[j].setEnabled(false);
        }// Condition To view X & O in GridLayout End
       }
       for(int j=0;j<Buttons.length;j++)
        {
            
           if(count>4)
              {
            
                
                if(Buttons[0].getText() == "X" && Buttons[1].getText() == "X" && Buttons[2].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                    
                }
                
                else if(Buttons[0].getText() == "O" && Buttons[1].getText() == "O" && Buttons[2].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
        
                else if(Buttons[3].getText() == "X" && Buttons[4].getText() == "X" && Buttons[5].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                
                else if(Buttons[3].getText() == "O" && Buttons[4].getText() == "O" && Buttons[5].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(Buttons[6].getText() == "X" && Buttons[7].getText() == "X" && Buttons[8].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                else if(Buttons[6].getText() == "O" && Buttons[7].getText() == "O" && Buttons[8].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(Buttons[0].getText() == "X" && Buttons[3].getText() == "X" && Buttons[6].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                
                else if(Buttons[0].getText() == "O" && Buttons[3].getText() == "O" && Buttons[6].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(Buttons[1].getText() == "X" && Buttons[4].getText() == "X" && Buttons[7].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                
                else if(Buttons[1].getText() == "O" && Buttons[4].getText() == "O" && Buttons[7].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(Buttons[2].getText() == "X" && Buttons[5].getText() == "X" && Buttons[8].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                
                else if(Buttons[2].getText() == "O" && Buttons[5].getText() == "O" && Buttons[8].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(Buttons[0].getText() == "X" && Buttons[4].getText() == "X" && Buttons[8].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                
                else if(Buttons[0].getText() == "O" && Buttons[4].getText() == "O" && Buttons[8].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(Buttons[2].getText() == "X" && Buttons[4].getText() == "X" && Buttons[6].getText() == "X")
                {
                    JOptionPane.showMessageDialog(null, "X is winner.");
                    System.exit(1);
                }
                
                else if(Buttons[2].getText() == "O" && Buttons[4].getText() == "O" && Buttons[6].getText() == "O")
                {
                    JOptionPane.showMessageDialog(null, "O is winner.");
                    System.exit(1);
                }
            
                else if(count == 9)
                {
                    JOptionPane.showMessageDialog(null,"Match is Drow.");
                    System.exit(1);
                }
           }
        }
        
}//************End of ActionPerformed Class*************
    
    //<<<<<<<<<<<<<<<<<<Main Class Start>>>>>>>>>>>>>>>
    public static void main(String []args)
    {
        new myTicTacToe();
    }
}
