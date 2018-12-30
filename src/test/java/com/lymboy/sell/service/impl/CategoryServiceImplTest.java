package com.lymboy.sell.service.impl;

import com.lymboy.sell.dataobject.ProductCategory;
import com.lymboy.sell.repository.ProductCategoryRepository;
import com.lymboy.sell.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() {
        System.out.println(categoryService);
        ProductCategory one = categoryService.findOne(1);
        System.out.println(one);
    }

    @Test
    public void findAll() {
        List<ProductCategory> all = categoryService.findAll();
        for (ProductCategory p : all) {
            System.out.println(p);
        }
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> categoryTypes = categoryService.findByCategoryTypeIn(Arrays.asList(4, 6));
        for (ProductCategory p : categoryTypes) {
            System.out.println(p);
        }
    }

    @Test
    public void save() {
        categoryService.save(new ProductCategory("Sairo", 7));
    }
}