package com.xgk.ymall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xgk.ymall.bean.UmsMember;
import com.xgk.ymall.bean.UmsMemberReceiveAddress;
import com.xgk.ymall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {


    @Reference
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
