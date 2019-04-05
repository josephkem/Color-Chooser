
package color;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class ColorChooser extends JPanel {


    public JTextField a;
    public JTextField b;
    public JTextField c;
    public JLabel r;
    public JLabel bl;
    public JLabel g;
    public JSlider one;
    public JSlider two;
    public JSlider thr;

    
    
    public ColorChooser()
            {
                setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
                setBorder(BorderFactory.createLineBorder(java.awt.Color.red));
                setBackground(Color.YELLOW);
                
                
                
                a = new JTextField(5);
                b = new JTextField(5);
                c = new JTextField(5);
                
                press key = new press();
                
                a.addKeyListener(key);
                b.addKeyListener(key);
                c.addKeyListener(key);
                
                r = new JLabel("Red");
                bl = new JLabel("Blue");
                g = new JLabel("Green");
                
                one = new JSlider(JSlider.HORIZONTAL,0,255,0);
                two = new JSlider(JSlider.HORIZONTAL,0,255,0);
                thr = new JSlider(JSlider.HORIZONTAL,0,255,0);
                
                change sel = new change();
                
                one.addChangeListener(sel);
                two.addChangeListener(sel);
                thr.addChangeListener(sel);
                
              
                one.setMajorTickSpacing(255);
                one.setMinorTickSpacing(20);
                one.setPaintTicks(true);
                one.setPaintLabels(true);
                two.setMajorTickSpacing(255);
                two.setMinorTickSpacing(20);
                two.setPaintTicks(true);
                two.setPaintLabels(true);
                thr.setMajorTickSpacing(255);
                thr.setMinorTickSpacing(20);
                thr.setPaintTicks(true);
                thr.setPaintLabels(true);
                
                 
                add(r);
                add(a);
                add(one);
                add(bl);
                add(b);
                add(two);
                add(g);
                add(c);
                add(thr);
                
                
                
            }
    
    
    private class change implements ChangeListener
    {
        @Override
        public void stateChanged(ChangeEvent s)
        {
            if(s.getSource() == one)
            {
                int redval;
                String red;
                redval = one.getValue();
                red = Integer.toString(redval);
                a.setText(red);  
            }
            
            if(s.getSource() == two)
            {
                int blueval;
                String blue;
                blueval = two.getValue();
                blue = Integer.toString(blueval);
                b.setText(blue);
                
            }
            
            if(s.getSource() == thr)
            {
                int greenval;
                String green;
                greenval = thr.getValue();
                green = Integer.toString(greenval);
                c.setText(green);
            }
            
       
            
        }
    }
    
    private class press implements KeyListener
    {
        public void keyReleased(KeyEvent k)
        {
            
        }
        public void keyPressed(KeyEvent k)
        {
            String rednum;
            String blunum;
            String grnnum;
            int redd;
            int blu;
            int grn;
            
            
            if(k.getKeyCode() == KeyEvent.VK_ENTER)
            {
                if(k.getSource() == a)
                {
                    rednum = a.getText();
                    redd = Integer.parseInt(rednum);
                    one.setValue(redd);
                    
                }
                
                if(k.getSource() == b)
                {
                    blunum = b.getText();
                    blu = Integer.parseInt(blunum);
                    two.setValue(blu);
                }
                
                if(k.getSource() == c)
                {
                    grnnum = c.getText();
                    grn = Integer.parseInt(grnnum);
                    thr.setValue(grn);
                    
                }
                
                
              
                
            }
            
        }
        
        public void keyTyped(KeyEvent k )
        {
            
        }
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(new Color(one.getValue(),thr.getValue(),two.getValue()));
        g.fillRect(200,200,100,50);
        repaint();
        
        
        
    }
    
 

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
}
