package com.xgk.ymall.user.service.impl;

import com.xgk.ymall.user.bean.UmsMember;
import com.xgk.ymall.user.bean.UmsMemberReceiveAddress;
import com.xgk.ymall.user.mapper.ReceiveAddressMapper;
import com.xgk.ymall.user.mapper.UserMapper;
import com.xgk.ymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
