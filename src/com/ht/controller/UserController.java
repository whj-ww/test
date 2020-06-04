package com.ht.controller;

import com.ht.bean.User;
import com.ht.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2019/11/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService is;
    @RequestMapping("/list")
    public String list(Model model){
        List list = is.alluser();
        model.addAttribute("list",list);
        return "userlist";
    }

    @RequestMapping("/toqx")
    public String toqx(int id,Model model){
        model.addAttribute("id",id);
        return "qx";
    }
    @RequestMapping("/addqx")
    public String addqx(int id,String[] qx,Model model){
        for (String module:qx){
            is.addqx(id,module);
        }
        return "redirect:list";
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        session.setAttribute("user",user);
        //根据用户ID查询权限List
        List moudellist = is.selqxbyuid(user.getId());
        session.setAttribute("moudellist",moudellist);
        return "redirect:/index.jsp";
    }

    @RequestMapping("/add")
    public String add(){
        return "hello";
    }

    @RequestMapping("/del")
    public String del(){
        return "hello";
    }
    @RequestMapping("/adddept")
    public String adddept(){
        return "hello";
    }


}
