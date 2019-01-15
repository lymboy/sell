package com.lymboy.sell.service;

import com.lymboy.sell.dto.OrderDTO;

/**
 * User LYM
 * Create 2019/1/1 17:38
 */
public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    // 取消一个订单
    OrderDTO cancelOrder(String openid, String orderId);
}
