import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class caculate {
    static JFrame main = Main.main;
    static JPanel panel = new JPanel();
    static JLabel pane = new JLabel();
    static Font f = new Font("Times new Roman", Font.PLAIN, 150);
    static JTextField field = new JTextField(150);
    static String[][] test = {{"14*8-2*4", "22*6+3*2", "3*74+5*3", "54*7+3*4", "18*7-2*3"},
            {"52*8-5*3 (tips: 401)", "86*3+4*3  (tips:270)", "4*64-4*2  (tips:248)", "8*13+4*3  (tips:116)", "5*22-6*9  (tips:56)"},
            {"67*3+2*8  (tips:185)", "5*24-6*8  (tips:82)", "61*2-7*7  (tips:83)", "23*7+4*4  (tips:167)", "19*6+3*2  (tips:108)"}};
    static int[][] answer = {{104, 138, 237, 390, 120}, {401, 270, 248, 116, 56}, {185, 82, 83, 167, 108}};
    static double time = System.currentTimeMillis();
    static BufferedWriter writer;

    static {
        try {
            String root = System.getProperty("user.dir");
            String FileName = "data.txt";
            String FilePath = root + File.separator + "src" + File.separator + FileName;
            writer = new BufferedWriter(new FileWriter(FilePath, true));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static {
        main.setVisible(false);
        main = new Main();
        main.setVisible(true);
        double width = Toolkit.getDefaultToolkit().getScreenSize().width; //得到当前屏幕分辨率的高
        double height = Toolkit.getDefaultToolkit().getScreenSize().height;//得到当前屏幕分辨率的宽
        main.setSize((int) width/4, (int) height/4);//设置大小
        main.setLocation(0, 0); //设置窗体居中显示
        main.setTitle("calTest");
        main.setLayout(null);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setLayout(new GridLayout(2, 1));
        panel.setLayout(new GridLayout(3, 2));
        pane.setLayout(new GridLayout(3,2));
        JPanel panel2 = new JPanel();
        pane.add(field);
        pane.setText("按下任意键开始，请选出图中的动物");
        pane.setFont(new Font("宋体", Font.PLAIN, 50));
        pane.add(field);
        panel2.add(pane);
        main.add(panel2);
        main.add(panel);
    }

    public static void test(int n) throws Exception {


        pane.setText(test[0][n]);
        time = System.currentTimeMillis();
        int input = Integer.parseInt(field.getText());
        double cost = System.currentTimeMillis() - time;
        time = System.currentTimeMillis();
        if (input == answer[0][n]) {
            try {
                writer.write(cost + ",correct");
                writer.newLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                writer.write(cost + ",false");
                writer.newLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        int num =(int) Math.random()*2+1;
        if (num == 1){
            pane.setText(test[1][n]);
            time = System.currentTimeMillis();
            input = Integer.parseInt(field.getText());
            cost = System.currentTimeMillis() - time;
            time = System.currentTimeMillis();
            if (input == answer[1][n]) {
                try {
                    writer.write(cost + ",correct,correct tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    writer.write(cost + ",false,correct tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            pane.setText(test[2][n]);
            time = System.currentTimeMillis();
            input = Integer.parseInt(field.getText());
            cost = System.currentTimeMillis() - time;
            time = System.currentTimeMillis();
            if (input == answer[2][n]) {
                try {
                    writer.write(cost + ",correct,incorrect tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    writer.write(cost + ",false,incorrect tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }else {
            pane.setText(test[2][n]);
            time = System.currentTimeMillis();
            input = Integer.parseInt(field.getText());
            cost = System.currentTimeMillis() - time;
            time = System.currentTimeMillis();
            if (input == answer[2][n]) {
                try {
                    writer.write(cost + ",correct,incorrect tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    writer.write(cost + ",false,incorrect tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            pane.setText(test[1][n]);
            time = System.currentTimeMillis();
            input = Integer.parseInt(field.getText());
            cost = System.currentTimeMillis() - time;
            time = System.currentTimeMillis();
            if (input == answer[1][n]) {
                try {
                    writer.write(cost + ",correct,correct tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                try {
                    writer.write(cost + ",false,correct tips");
                    writer.newLine();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }

    }
}
