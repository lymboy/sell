package com.lymboy.sell.service;

import com.lymboy.sell.dataobject.ProductInfo;
import com.lymboy.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在售的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有商品，分页
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 保存
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 增加库存
     * @param cartDTOList
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减少库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
