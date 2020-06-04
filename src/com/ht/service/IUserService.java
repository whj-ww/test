package com.ht.service;

import com.ht.bean.User;

import java.util.List;

/**
 * Created by Administrator on 2019/11/29.
 */
public interface IUserService {
    public List<User> alluser();
    public void addqx(int id,String qx);
    public List<String> selqxbyuid(int uid);
}
