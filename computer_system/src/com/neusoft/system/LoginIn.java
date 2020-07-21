package com.neusoft.system;

import com.neusoft.dao.UserDao;
import com.neusoft.util.DbUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class LoginIn {

    public static void main(String[] args) {
        JFrame jFrame=new JFrame("计算机课程考试报名系统");
        Container container=jFrame.getContentPane();
        container.setLayout(null);
        JLabel userName=new JLabel("用户名");
        userName.setIcon(new ImageIcon(LoginIn.class.getResource("/images/user.png")));
        JLabel passwordJLable=new JLabel("密     码");
        passwordJLable.setIcon(new ImageIcon(LoginIn.class.getResource("/images/password.png")));
        userName.setBounds(140,50,100,30);
        passwordJLable.setBounds(140,90,100,30);
        container.add(userName);
        container.add(passwordJLable);

        JTextField nameTxt= new JTextField("");
        JTextField passwordTxt= new JTextField("");
        nameTxt.setBounds(230,50,210,30);
        passwordTxt.setBounds(230,90,210,30);
        container.add(nameTxt);
        container.add(passwordTxt);

        JButton loginJButton=new JButton("登录");
        loginJButton.setBounds(190,150,90,30);
        container.add(loginJButton);
        loginJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Connection con= DbUtil.getCon();
                    String password=new String(passwordTxt.getText());
                    User user=new User(nameTxt.getText(),password);
                    UserDao userDao = new UserDao();
                    User resultUser = userDao.login(user, con);
                    if(resultUser != null){
                        JOptionPane.showMessageDialog(null, "登陆成功");
                        dispose();
                        jFrame.setVisible(false);
                        MainFrame main = new MainFrame();
                        main.setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "用户名或者密码错误");
            } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
        loginJButton.setIcon(new ImageIcon(LoginIn.class.getResource("/images/login.png")));

        JButton register=new JButton("注册");
        register.setBounds(320,150,90,30);
        container.add(register);
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUser add=new AddUser();
                add.setVisible(true);
            }
        });
        register.setIcon(new ImageIcon(LoginIn.class.getResource("/images/add.png")));

        jFrame.setBounds(600,300,600,300);
        jFrame.getContentPane().setBackground(Color.lightGray);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
