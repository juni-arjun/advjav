import java.applet.*;
import java.awt.*;
public class AppletDemo extends Applet{
    public void paint(Graphics g){
        g.drawString("HelloApplet", 100, 300);
        g.drawRect(100, 100, 300, 300);
    }
}