package com.neusoft.system;


import com.neusoft.dao.UserDao;
import com.neusoft.util.DbUtil;
import com.neusoft.util.StringUtil;
import com.sun.deploy.util.StringUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class AddUser extends JFrame {
    private JPanel contentPane;
    private JTextField nameTxt;
    private JPasswordField passwordTxt;
    private JTextField telTxt;
    private JTextField schoolTxt;
    private JTextField positionTxt;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AddUser frame = new AddUser();
                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public AddUser(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(80, 100, 500, 500);
        contentPane = new JPanel();
        contentPane.setForeground(Color.BLACK);
        contentPane.setBackground(SystemColor.menu);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("用  户  名");
        label.setIcon(new ImageIcon(AddUser.class.getResource("/images/user.png")));
        label.setBounds(85,80, 100, 25);
        contentPane.add(label);

        JLabel label_1 = new JLabel("用户密码");
        label_1.setIcon(new ImageIcon(AddUser.class.getResource("/images/password.png")));
        label_1.setBounds(81,130, 100, 25);
        contentPane.add(label_1);

        JLabel label_2 = new JLabel("联系电话");
        label_2.setIcon(new ImageIcon(AddUser.class.getResource("/images/tel.png")));
        label_2.setBounds(79,180, 100, 25);
        contentPane.add(label_2);

        JLabel label_3 = new JLabel("所在学校");
        label_3.setIcon(new ImageIcon(AddUser.class.getResource("/images/school.png")));
        label_3.setBounds(82,230, 100, 25);
        contentPane.add(label_3);

        JLabel label_4 = new JLabel("职          位");
        label_4.setIcon(new ImageIcon(AddUser.class.getResource("/images/user.png")));
        label_4.setBounds(81,280, 100, 25);
        contentPane.add(label_4);

        nameTxt = new JTextField();
        nameTxt.setColumns(10);
        nameTxt.setBounds(180,80,200,30);
        contentPane.add(nameTxt);

        passwordTxt = new JPasswordField();
        passwordTxt.setColumns(10);
        passwordTxt.setBounds(180,130,200,30);
        contentPane.add(passwordTxt);

        telTxt = new JTextField();
        telTxt.setColumns(10);
        telTxt.setBounds(180,180,200,30);
        contentPane.add(telTxt);

        schoolTxt = new JTextField();
        schoolTxt.setColumns(10);
        schoolTxt.setBounds(180,230,200,30);
        contentPane.add(schoolTxt);

        positionTxt = new JTextField();
        positionTxt.setColumns(10);
        positionTxt.setBounds(180,280,200,30);
        contentPane.add(positionTxt);

        JButton button=new JButton("注册");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=nameTxt.getText();
                String password=new String(passwordTxt.getPassword());
                String school=schoolTxt.getText();
                int tel= Integer.parseInt(telTxt.getText());
                String position=positionTxt.getText();

                if(StringUtil.isEmpty((nameTxt.getText()))){
                    JOptionPane.showMessageDialog(null,"账号不能为空");
                }
                User user=new User(name,password,school,tel,position);
                Connection con=null;
                try {
                    con= DbUtil.getCon();
                    UserDao userDao=new UserDao();
                    int a=userDao.add(con,user);
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "注册成功");
                    }

                    if (a == 0) {
                        JOptionPane.showMessageDialog(null, "注册失败");
                    }
                } catch (Exception e2) {
                }finally {
                    try {
                        DbUtil.closeCon(con);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(null, "注册失败");
                    }
                }

            }
        });
        button.setBounds(180,330,100,30);
        contentPane.add(button);

        }
    }


