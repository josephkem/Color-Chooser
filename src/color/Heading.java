/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import java.awt.*;
import javax.swing.*;

public class Heading extends JPanel {
    
    public JLabel h;
    
    public Heading()
    {
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        h = new JLabel("Welcome To My Color Chooser");
        add(h);
        
    
    }
    
}
