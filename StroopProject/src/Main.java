import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Main extends JFrame {
    static Main main=new Main();
    public static void main(String[] args) throws IOException {
        JButton start=new JButton("Start");
        start.setFont(new Font("Times new Roman", Font.PLAIN, 100));
        Scanner in = new Scanner(System.in);
        System.out.println("Please input test number :");
        int n = in.nextInt()-1;
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
        BufferedWriter  writer= null;

            String root = System.getProperty("user.dir");
            String FileName = "data.txt";
            String FilePath = root + File.separator+"src" + File.separator +FileName;
            writer = new BufferedWriter(new FileWriter(FilePath,true));
        double st = System.currentTimeMillis();;
        start.addActionListener(e -> {
            try {
                Stroop.test(n);
                //picTest.test(n);
                //caculate.test(n);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        });
        double cost = System.currentTimeMillis()-st;
        writer.write(cost + ",totalcost");
        writer.newLine();
        writer.flush();
        writer.close();
    }
}
