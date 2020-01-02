package com.leyou.item.pojo;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_brand")
public class Brand implements Serializable {
    /**
     * 品牌id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 品牌名称
     */
    @Column(name = "`name`")
    private String name;

    /**
     * 品牌图片地址
     */
    @Column(name = "image")
    private String image;

    /**
     * 品牌的首字母
     */
    @Column(name = "letter")
    private String letter;

    private static final long serialVersionUID = 1L;
}