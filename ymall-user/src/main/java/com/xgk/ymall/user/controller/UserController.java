package com.xgk.ymall.user.controller;

import com.xgk.ymall.user.bean.UmsMember;
import com.xgk.ymall.user.bean.UmsMemberReceiveAddress;
import com.xgk.ymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("user/index")
    @ResponseBody
    public String index(){
        return "user.index";
    }


    @RequestMapping("user/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("user/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        return userService.getReceiveAddressByMemberId(memberId);
    }

}
