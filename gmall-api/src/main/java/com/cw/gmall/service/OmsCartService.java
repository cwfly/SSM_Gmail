package com.cw.gmall.service;

import com.cw.gmall.bean.OmsCartItem;

import java.util.List;

public interface OmsCartService {

    OmsCartItem ifExistInDB(String memberId, String skuId);

    void addCart(OmsCartItem omsCartItem);

    void flushCartCache(String memberId);

    void updateCart(OmsCartItem omsCartFromDB);

    List<OmsCartItem> cartList(String memberId);

    void checkCart(OmsCartItem omsCartItem);
}
