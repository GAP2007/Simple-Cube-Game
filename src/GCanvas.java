import java.awt.*;
import java.awt.Graphics;

public class GCanvas extends Canvas implements Runnable{
    private GFrame frame;
    private Thread gameThread;
    private KeyHandler key;
    private int PlayerX = 250;
    private int PlayerY = 250;
    private int PlalyerSpeed = 1;
    
    
    
    GCanvas(){
        key = new KeyHandler();
        setSize(new Dimension(500, 500));
        setFocusable(true);
        addKeyListener(key);
    }

    public void startGameThread(){
        frame = new GFrame(this);
        gameThread = new Thread(this);
        gameThread.start();
    }
    public void Update(){
        if(key.isWKeyPressed){
            System.out.println("W was pressed");
            PlayerY -= PlalyerSpeed;
            
        }
        if(key.isAKeyPressed){
            PlayerX -= PlalyerSpeed;
        }
        if(key.isSKeyPressed){
            PlayerY += PlalyerSpeed;
        }
        if(key.isDKeyPressed){
            PlayerX += PlalyerSpeed;
        }
    }
    public void Render(){
        repaint(PlayerX, PlayerY, 100, 100);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.fillRect(PlayerX, PlayerY, 100, 100);
        g2D.fillRect(1, 1, 50, 50);
    }

    @Override
    public void run() {
            int FPS = 60;
            double DrawIntrval = 1000000000 / FPS;
            long lastUpdate;
            long nextUpdateTime;
            long sleepTimeSec;
            while (gameThread != null) {
            Render();
            Update();
            lastUpdate = System.nanoTime();
            nextUpdateTime = (long) (lastUpdate + DrawIntrval);
            long sleepTime = nextUpdateTime - lastUpdate;
            sleepTimeSec = sleepTime / 1000000;
            try {
                Thread.sleep(sleepTimeSec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }

}
