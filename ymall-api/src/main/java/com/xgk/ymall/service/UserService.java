package com.xgk.ymall.service;



import com.xgk.ymall.bean.UmsMember;
import com.xgk.ymall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
