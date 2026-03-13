import java.applet.*;
import java.awt.*;
public class LifecycleofApplet extends Applet
{
    public void init()
    {
    setBackground(Color.red);
    setFont(new Font("Arial",Font.BOLD,20));
    Label lab1=new Label("life cycle of Applet");
    add(lab1);
    System.out.println("init method is called");

}
public void start()
{
    System.out.println("start method is called");
}
public void paint(Graphics g)
{
    System.out.println("paint method is called");
}
public void stop()
{
    System.out.println("stop method is called");
}
public void destroy()
{
    System.out.println("destroy method is called");
}
}
