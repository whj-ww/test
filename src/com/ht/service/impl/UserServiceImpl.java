package com.ht.service.impl;

import com.ht.bean.User;
import com.ht.common.DBConnection;
import com.ht.service.IUserService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/29.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Override
    public List<User> alluser() {
        List list = new ArrayList();
        Connection conn = DBConnection.getConnection();
        String sql="select * from users";
        try {
            PreparedStatement prst = conn.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while(rs.next()){
                User  user = new User();
                user.setId(rs.getInt("id"));
                user.setUname(rs.getString("uname"));
                user.setPwd(rs.getString("pwd"));
                user.setSex(rs.getString("sex"));
                user.setAihao(rs.getString("aihao"));
                user.setJianjie(rs.getString("jianjie"));
                user.setDeptno(rs.getInt("deptno"));
                user.setHiredate(rs.getString("hiredate"));
                list.add(user);
            }
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void addqx(int id, String qx) {
        Connection conn = DBConnection.getConnection();
        String sql="insert into qx values(MYSEQ.nextval,'"+qx+"',"+id+")";
        try {
            PreparedStatement prst = conn.prepareStatement(sql);
            prst.executeUpdate();

            prst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> selqxbyuid(int uid) {
        List list = new ArrayList();
        Connection conn = DBConnection.getConnection();
        String sql="select * from qx where userid="+uid;
        try {
            PreparedStatement prst = conn.prepareStatement(sql);
            ResultSet rs = prst.executeQuery();
            while(rs.next()){
                list.add(rs.getString("moudel"));
            }
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
