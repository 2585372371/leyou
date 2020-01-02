package com.leyou.item.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpuDetail implements Serializable {
    private Long spuId;

    /**
    * 商品描述信息
    */
    private String description;

    /**
    * 全部规格参数数据
    */
    private String specifications;

    /**
    * 特有规格参数及可选值信息，json格式
    */
    private String specTemplate;

    /**
    * 包装清单
    */
    private String packingList;

    /**
    * 售后服务
    */
    private String afterService;

    private static final long serialVersionUID = 1L;
}