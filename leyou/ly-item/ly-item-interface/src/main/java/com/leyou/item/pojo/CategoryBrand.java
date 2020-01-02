package com.leyou.item.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryBrand implements Serializable {
    /**
    * 商品类目id
    */
    private Long categoryId;

    /**
    * 品牌id
    */
    private Long brandId;

    private static final long serialVersionUID = 1L;
}