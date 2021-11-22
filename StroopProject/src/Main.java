import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    static Main main=new Main();
    public static void main(String[] args) {
        JButton start=new JButton("Start");
        start.setFont(new Font("Times new Roman", Font.PLAIN, 100));

        start.setSize(100,100);
        double width = Toolkit.getDefaultToolkit().getScreenSize().width; //得到当前屏幕分辨率的高
        double height = Toolkit.getDefaultToolkit().getScreenSize().height;//得到当前屏幕分辨率的宽
        main.setSize((int)width,(int)height);//设置大小
        main.setLocation(0,0); //设置窗体居中显示
        main.setTitle("Stroop");
        main.setLayout(null);
        start.setBounds((int) (width/2-50), (int) (height/2-50),300,100);
        main.add(start);
        main.setVisible(true);
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        start.addActionListener(e -> {
            try {
                Stroop.test();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }
}
