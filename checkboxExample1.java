import java.awt.*;
// import java.awt.event.*;
public class checkboxExample1 {
    checkboxExample1() {
        Frame f = new Frame("Checkbox Example");
        Checkbox checkbox1 = new Checkbox("M.Tech");
        checkbox1.setBounds(100, 100, 50, 50);
        Checkbox checkbox2 = new Checkbox("B.Tech", true);
        checkbox2.setBounds(100, 150, 50, 50);
        f.add(checkbox1);
        f.add(checkbox2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new checkboxExample1();
    }
}