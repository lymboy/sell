package com.lymboy.sell.service;

import com.lymboy.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    /**
     * 通过 categoryId 查询单个商品类目
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有商品类目
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 通过商品类型查找
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存商品类目
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
