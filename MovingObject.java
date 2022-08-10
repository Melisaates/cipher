import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class MovingObject extends JFrame implements KeyListener {

    Canvas canvas;
    int x, y;
    public MovingObject() {
      
        
        this.setTitle("moving object");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(640, 480);
        x = 640/2; y = 480/2;
        canvas = new Canvas(){
            @Override
            public void paint(Graphics g) {
                
                g.setColor(Color.RED);
                g.fillOval(x, y, 5, 5);
            } 
        };
        canvas.addKeyListener(this);
        this.add(canvas);

  
      
        //TODO add keyListener to canvas
        
        //TODO add canvas to the frame

        this.setVisible(true);
    }



    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y--;
         

        }
        else if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
            
        }
        else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
          
        }
        else if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
            
        }
        
     canvas.repaint();   
     
    }
    @Override
    public void keyTyped(KeyEvent e) {
     
        
    }
    @Override
    public void keyReleased(KeyEvent e) {

        
    }

}
