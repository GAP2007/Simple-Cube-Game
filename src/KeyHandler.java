import java.awt.event.*;

public class KeyHandler implements KeyListener{
    boolean isWKeyPressed = false;
    boolean isAKeyPressed = false;
    boolean isSKeyPressed = false;
    boolean isDKeyPressed = false;

    @Override
    public void keyPressed(KeyEvent arg0) {
        int code = arg0.getKeyCode();
        if(code == KeyEvent.VK_W){
            isWKeyPressed = true;
        }
        if(code == KeyEvent.VK_A){
            isAKeyPressed = true;
        }
        if(code == KeyEvent.VK_S){
            isSKeyPressed = true;
        }
        if(code == KeyEvent.VK_D){
            isDKeyPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        int code = arg0.getKeyCode();
        if(code == KeyEvent.VK_W){
            isWKeyPressed = false;
        }
        if(code == KeyEvent.VK_A){
            isAKeyPressed = false;
        }
        if(code == KeyEvent.VK_S){
            isSKeyPressed = false;
        }
        if(code == KeyEvent.VK_D){
            isDKeyPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent arg0) {

        
    }
    
}
