package com.lymboy.sell.repository;

import com.lymboy.sell.dataobject.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void saveTest() {

        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123456");
        productInfo.setProductName("皮蛋瘦肉粥");
        productInfo.setProductStock(100);
        productInfo.setCategoryType(6);
        productInfo.setProductDescription("好吃");
        productInfo.setProductPrice(new BigDecimal(38.0));
        productInfo.setProductStatus(0);

        repository.save(productInfo);
    }

    @Test
    public void findByProductStatus() {
        List<ProductInfo> byProductStatus = repository.findByProductStatus(0);
        System.out.println(byProductStatus.get(0));
    }
}