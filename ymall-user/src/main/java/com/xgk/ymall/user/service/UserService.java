package com.xgk.ymall.user.service;

import com.xgk.ymall.user.bean.UmsMember;
import com.xgk.ymall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
