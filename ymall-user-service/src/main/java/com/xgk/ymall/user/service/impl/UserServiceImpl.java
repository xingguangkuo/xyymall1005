package com.xgk.ymall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xgk.ymall.bean.UmsMember;
import com.xgk.ymall.bean.UmsMemberReceiveAddress;
import com.xgk.ymall.service.UserService;
import com.xgk.ymall.user.mapper.ReceiveAddressMapper;
import com.xgk.ymall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    ReceiveAddressMapper receiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        return receiveAddressMapper.selectByExample(example);
    }
}
