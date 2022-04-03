import javax.swing.JFrame;
import java.awt.*;

public class GFrame extends JFrame{
    Dimension screenSize = new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
    GFrame(GCanvas canvas)
    {
        add(canvas);
        pack();
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
