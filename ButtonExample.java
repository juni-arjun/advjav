import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonExample {
    public static void main(String[] args){
        JFrame f = new JFrame("ButtonExample");
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField tf = new JTextField(15);
        tf.setBounds(50, 50, 150, 20);
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 95, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to JavaTPoint");
            }
        });
        f.add(tf);
        f.add(b);

        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 50, 50);
        JCheckBox checkBox2 = new JCheckBox("JAVA");
        checkBox1.setBounds(100, 150, 100, 50);
        JCheckBox checkBox3 = new JCheckBox("Machine Learning");
        // checkBox1.setBounds(100, 100, 50, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);

        JRadioButton r1 = new JRadioButton("A) C++");
        JRadioButton r2 = new JRadioButton("B) JAVA");
        JRadioButton r3 = new JRadioButton("C) Machine Learning");
        r1.setBounds(75, 50, 100, 30);
        r2.setBounds(75, 100, 100, 30);
        r1.setBounds(75, 150, 150, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        f.add(r1);
        f.add(r2);
        f.add(r3);

        JToggleButton button = new JToggleButton("ON");
        f.add(button);
        button.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                if(button.isSelected())
                    button.setText("OFF");
                else
                    button.setText("ON");
            }
        });
        f.setVisible(true);
    }
}
