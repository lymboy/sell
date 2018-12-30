package com.lymboy.sell.repository;

import com.lymboy.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
//        List<ProductCategory> pros = repository.findAll();
//        for (ProductCategory pro : pros) {
//            System.out.println(pro);
//        }
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory);
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(3);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(6);

        repository.save(productCategory);
    }

    @Test
    public void test00() {
        List<ProductCategory> list = repository.findByCategoryTypeIn(Arrays.asList(3, 6));
        for (ProductCategory p : list) {
            System.out.println(p);
        }
    }
}