package com.leyou.item.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock implements Serializable {
    /**
    * 库存对应的商品sku id
    */
    private Long skuId;

    /**
    * 可秒杀库存
    */
    private Integer seckillStock;

    /**
    * 秒杀总数量
    */
    private Integer seckillTotal;

    /**
    * 库存数量
    */
    private Integer stock;

    private static final long serialVersionUID = 1L;
}