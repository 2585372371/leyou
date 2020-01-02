package com.leyou.item.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cid3 implements Serializable {
    /**
    * 父类目id,顶级类目填0
    */
    private Long parentId;

    private static final long serialVersionUID = 1L;
}