package com.leyou.item.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Specification implements Serializable {
    /**
    * 规格模板所属商品分类id
    */
    private Long categoryId;

    /**
    * 规格参数模板，json格式
    */
    private String specifications;

    private static final long serialVersionUID = 1L;
}