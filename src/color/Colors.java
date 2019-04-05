/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import javax.swing.*;
import java.awt.*;
public class Colors {

    public static void main(String[] args) {
        
        JFrame pick = new JFrame();
        
        pick.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pick.setTitle("My Color Chooser");
        pick.setSize(350,350);
        pick.setResizable(false);
        
        
        ColorChooser col = new ColorChooser();
        Heading head = new Heading();
        
        pick.add(head,BorderLayout.NORTH);
        pick.add(col,BorderLayout.CENTER);
        
        pick.setVisible(true);
        
        
        
    }

    
    }
    

