package com.lymboy.sell.service.impl;

import com.lymboy.sell.dataobject.OrderDetail;
import com.lymboy.sell.dataobject.OrderMaster;
import com.lymboy.sell.dto.OrderDTO;
import com.lymboy.sell.enums.OrderStatusEnum;
import com.lymboy.sell.repository.OrderMasterRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    private final String BUYER_OPENID = "1101110";

    private final String ORDER_ID = "1546247262603200184";

    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName("大师兄");
        orderDTO.setBuyerAddress("M78星云");
        orderDTO.setBuyerPhone("123456789012");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        List<OrderDetail> orderDetails = new ArrayList<>();

        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(20);

        orderDetails.add(o1);

        orderDTO.setOrderDetailList(orderDetails);

        OrderDTO result = orderService.create(orderDTO);

        log.info("【创建订单】result={}", result);
    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        System.out.println(orderDTO);

    }

    @Test
    public void findList() {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPENID, pageRequest);

        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());
    }

    @Test
    public void cancel() {
        OrderDTO one = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.cancel(one);

        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(), result.getOrderStatus());

    }

    @Test
    public void finish() {
        OrderDTO one = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.finish(one);

        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), result.getOrderStatus());
    }

    @Test
    public void paid() {
    }
}