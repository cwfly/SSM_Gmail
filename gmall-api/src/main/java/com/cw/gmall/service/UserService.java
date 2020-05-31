package com.cw.gmall.service;


import com.cw.gmall.bean.UmsMember;
import com.cw.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
   List<UmsMember> getAllUser();

   List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressById(String memberId);

    UmsMember login(UmsMember umsMember);

    void addUserToken(Long id, String token);

    List<UmsMemberReceiveAddress> getAddressById(String memberId);

    UmsMemberReceiveAddress getReceiveAddressById(String receiveAddressId);
}
