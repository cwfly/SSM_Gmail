package com.cw.gmall.service;

import com.cw.gmall.bean.OmsOrder;

public interface OrderService {
    String genTradeCode(String memberId);

    boolean checkTradeCode(String memberId, String tradeCode);

    void saveOrder(OmsOrder omsOrder);

    OmsOrder getOrderByOutTradeNo(String outTradeNo);
}
