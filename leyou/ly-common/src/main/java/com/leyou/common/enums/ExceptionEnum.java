package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400,"价格不能为空"),
    CATEGORY_NOT_FOUND(404,"商品分类没查到"),
    BRAND_NOT_FOUND(404,"品牌为空"),
    BRAND_SAVE_FAILURE(500,"新增品牌失败"),
    UPLOAD_ERROR(500,"文件上传失败"),
    INVALID_FILE_TYPE(400,"文件类型有误")
    ;
    private int code;
    private String msg;

}
