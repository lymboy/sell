package com.lymboy.sell.repository;

import com.lymboy.sell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    private final String OPENID = "1212121";


    @Test
    public void save() {
        OrderMaster orderMaster = new OrderMaster();

        orderMaster.setOrderId("1234567");
        orderMaster.setBuyerName("师兄");
        orderMaster.setBuyerPhone("12343243534");
        orderMaster.setBuyerAddress("发vv范德萨");
        orderMaster.setBuyerOpenid("1212121");
        orderMaster.setOrderAmount(new BigDecimal(2.3));

        orderMasterRepository.save(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0,1);
        Page<OrderMaster> ret = orderMasterRepository.findByBuyerOpenid(OPENID, request);
        long totalElements = ret.getTotalElements();
        System.out.println(totalElements);
    }
}