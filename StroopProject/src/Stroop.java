import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Stroop{
    static JFrame main=Main.main;
    static JPanel panel=new JPanel();
    static JLabel pane=new JLabel();
    static Font f = new Font("Times new Roman", Font.PLAIN, 150);
    static JButton button1=new JButton("Green");
    static JButton button2=new JButton("Blue");
    static JButton button3=new JButton("Red");
    static JButton button4=new JButton("Yellow");
    static JButton button5=new JButton("Pink");
    static JButton button6=new JButton("Orange");
    static String[] text={"Green","Blue","+++"};//add text
    static Color[] colors={Color.RED,Color.BLUE,Color.GREEN};//add color
    static int cnt = -1;
    static int correct=0;
    static double time=System.currentTimeMillis();
    static BufferedWriter writer;

    static {
        try {
            String root = System.getProperty("user.dir");
            String FileName = "data.txt";
            String FilePath = root + File.separator+"src" + File.separator +FileName;
            writer = new BufferedWriter(new FileWriter(FilePath,true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws Exception{
        main.setVisible(false);
        main=new Main();
        main.setVisible(true);

        double width = Toolkit.getDefaultToolkit().getScreenSize().width; //得到当前屏幕分辨率的高
        double height = Toolkit.getDefaultToolkit().getScreenSize().height;//得到当前屏幕分辨率的宽
        main.setSize((int)width,(int)height);//设置大小
        main.setLocation(0,0); //设置窗体居中显示
        main.setTitle("Stroop");
        main.setLayout(null);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setLayout(new GridLayout(2,1));
        panel.setLayout(new GridLayout(3,2));
        JPanel panel2=new JPanel();

        button1.addActionListener(e -> {
            if (cnt==-1){
                cnt++;
                pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);
                time = System.currentTimeMillis();
            }
            else {
                double cost = System.currentTimeMillis() - time;
                //System.out.println(System.currentTimeMillis()-time);
                time = System.currentTimeMillis();

                if (colors[cnt] == Color.GREEN) {
                    correct++;
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
                cnt++;
                if (cnt< (text).length){
                pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);}
                if (cnt == text.length) {
                    try {
                        writer.write("---");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Thanks!");
                    main.setVisible(false);
                    System.out.println((double) correct / text.length);
                    System.exit(0);
                }
            }
        });
        button2.addActionListener(e -> {
            if (cnt==-1){
                cnt++;
                pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);
                time = System.currentTimeMillis();
            }
            else {
                double cost = System.currentTimeMillis() - time;
                time = System.currentTimeMillis();

                if (colors[cnt] == Color.BLUE) {
                    correct++;
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
                cnt++;
                if (cnt< (text).length){
                    pane.setText(text[cnt]);
                    pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                    pane.setForeground(colors[cnt]);}
                if (cnt == text.length) {
                    try {
                        writer.write("---");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Thanks!");
                    main.setVisible(false);
                    System.out.println((double) correct / text.length);
                    System.exit(0);
                }
            }
        });
        button3.addActionListener(e -> {
            if (cnt==-1){
                cnt++;
                pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);
                time = System.currentTimeMillis();
            }
            else {
                double cost = System.currentTimeMillis() - time;
                time = System.currentTimeMillis();

                if (colors[cnt] == Color.RED) {
                    correct++;
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

                cnt++;
                if (cnt< (text).length){
                    pane.setText(text[cnt]);
                    pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                    pane.setForeground(colors[cnt]);}
                if (cnt == text.length) {
                    try {
                        writer.write("---");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Thanks!");
                    main.setVisible(false);
                    System.out.println((double) correct / text.length);
                    System.exit(0);
                }
            }
        });
        button4.addActionListener(e -> {
            if (cnt==-1){
                cnt++; pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);
                time = System.currentTimeMillis();
            }
            else {
                double cost = System.currentTimeMillis() - time;
                time = System.currentTimeMillis();

                if (colors[cnt] == Color.YELLOW) {
                    correct++;
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
                cnt++;
                if (cnt< (text).length){
                    pane.setText(text[cnt]);
                    pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                    pane.setForeground(colors[cnt]);}
                if (cnt == text.length) {
                    try {
                        writer.write("---");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Thanks!");
                    main.setVisible(false);
                    System.out.println((double) correct / text.length);
                    System.exit(0);
                }
            }
        });
        button5.addActionListener(e -> {
            if (cnt==-1){
                cnt++;
                pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);
                time = System.currentTimeMillis();
            }
            else {
                double cost = System.currentTimeMillis() - time;
                time = System.currentTimeMillis();

                if (colors[cnt] == Color.PINK) {
                    correct++;
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
                cnt++;
                if (cnt< (text).length){
                    pane.setText(text[cnt]);
                    pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                    pane.setForeground(colors[cnt]);}
                if (cnt == text.length) {
                    try {
                        writer.write("---");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Thanks!");
                    main.setVisible(false);
                    System.out.println((double) correct / text.length);
                    System.exit(0);
                }
            }
        });
        button6.addActionListener(e -> {
            if (cnt==-1){
                cnt++;
                pane.setText(text[cnt]);
                pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                pane.setForeground(colors[cnt]);
                time = System.currentTimeMillis();
            }
            else {
                double cost = System.currentTimeMillis() - time;
                time = System.currentTimeMillis();

                if (colors[cnt] == Color.ORANGE) {
                    correct++;
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
                cnt++;
                if (cnt< (text).length){
                    pane.setText(text[cnt]);
                    pane.setFont(new Font("Times new Roman", Font.PLAIN, 250));
                    pane.setForeground(colors[cnt]);}
                if (cnt == text.length) {
                    try {
                        writer.write("---");
                        writer.newLine();
                        writer.flush();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    try {
                        writer.close();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Thanks!");
                    main.setVisible(false);
                    System.out.println((double) correct / text.length);
                    System.exit(0);
                }
            }
        });
        pane.setText("按下任意键开始，请选出正确的颜色");
        pane.setFont(new Font("宋体", Font.PLAIN, 50));
        panel2.add(pane);
        button1.setFont(f);
        button2.setFont(f);
        button3.setFont(f);
        button4.setFont(f);
        button5.setFont(f);
        button6.setFont(f);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
       main.add(panel2);
       main.add(panel);
    }
}
