package com.neusoft.dao;

import com.neusoft.system.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    //登录
    public User login(User user,Connection con) throws Exception{
        User resultUser = null;
        String sql = "select password from t_user where name =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, user.getName());
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            String password = rs.getString("password");
            String  name = user.getName();
            resultUser = new User(name,password);
        }
        return resultUser;
    }
    //添加用户
    public int add(Connection con, User user) throws Exception {
        String sql="insert into t_user values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,user.getName());
            ps.setString(2,user.getPassword());
            ps.setString(3,user.getSchool());
            ps.setInt(4,user.getTel());
            ps.setString(5, String.valueOf(user.getPosition()));
            return ps.executeUpdate();
    }
}
