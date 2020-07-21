package com.neusoft.system;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame{
         private JPanel contentPane;
         JDesktopPane table =null;
          private JTextField nameTxt;
          private JPasswordField passwordTxt;
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        AdminLogin frame = new AdminLogin();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    public AdminLogin(){
        setTitle("管理员登录窗口");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(600, 300, 550, 300);
        contentPane = new JPanel();
        contentPane.setForeground(Color.BLACK);
        contentPane.setBackground(SystemColor.menu);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel userName=new JLabel("管理员姓名：");
        userName.setIcon(new ImageIcon(LoginIn.class.getResource("/images/user.png")));
        userName.setBounds(85,80, 100, 25);
        contentPane.add(userName);

        JLabel passwordJLable=new JLabel("密     码：");
        passwordJLable.setIcon(new ImageIcon(LoginIn.class.getResource("/images/password.png")));
        passwordJLable.setBounds(81,130, 100, 25);
        contentPane.add(passwordJLable);

        nameTxt = new JTextField();
        nameTxt.setColumns(10);
        nameTxt.setBounds(180,80,200,30);
        contentPane.add(nameTxt);

        passwordTxt = new JPasswordField();
        passwordTxt.setColumns(10);
        passwordTxt.setBounds(180,130,200,30);
        contentPane.add(passwordTxt);

        JButton button=new JButton("登录");
        button.setBounds(180,180,90,30);
        contentPane.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username= nameTxt.getText() ;
                String password= passwordTxt.getText() ;
                if (username.equals ("jack") &&password.equals("123123")){
                    setVisible(false);
                    AdminMainFrame adminMainFrame=new AdminMainFrame();
                    adminMainFrame.setVisible(true);
        }else{
                    JOptionPane.showMessageDialog(null, "管理员姓名或者密码错误");
                }
            }
        });
    }
}
