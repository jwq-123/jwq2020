package com.neusoft.system;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JPanel contentPane;
    JDesktopPane table =null;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public MainFrame() {
        setBackground(Color.WHITE);
        setTitle("计算机课程考试报名系统");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

    }
}
