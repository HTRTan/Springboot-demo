package com.totwo.createdemo.controller;

import com.totwo.createdemo.entity.UserDataBean;
import com.totwo.createdemo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
public class MainController {
    @Autowired
    private MainService mMainService;

    @GetMapping("")
    public String GoIndexPage(Model model , HttpServletRequest response , HttpServletResponse request){
        List<UserDataBean> mUserDataBean =  mMainService.getAllUserData();//从接口中获取数据库用户资料
        model.addAttribute("AllUserData",mUserDataBean);//将对象mUserDataBean以名为AllUserData存入model传到html页面
        return "index";//显示resources/templates中的index.html
    }

}
