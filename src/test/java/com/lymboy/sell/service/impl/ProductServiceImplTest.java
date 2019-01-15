package com.lymboy.sell.service.impl;

import com.lymboy.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl service;

    @Test
    public void findOne() {
        ProductInfo one = service.findOne("123456");
        System.out.println(one);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> all = service.findUpAll();
        System.out.println(all.get(0));
    }

    @Test
    public void findAll() {

        PageRequest pageRequest = new PageRequest(0, 2);

        service.findAll(pageRequest);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("654321");
        productInfo.setProductName("皮蛋瘦肉粥");
        productInfo.setProductStock(100);
        productInfo.setCategoryType(6);
        productInfo.setProductDescription("好吃");
        productInfo.setProductPrice(new BigDecimal(38.0));
        productInfo.setProductStatus(0);

        service.save(productInfo);
    }
}