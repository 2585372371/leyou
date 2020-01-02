package com.leyou.item.web;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import com.sun.org.apache.regexp.internal.RE;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "rows",defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key
    ){
        System.out.println("page: "+page);
        PageResult<Brand> pageResult=brandService.queryBrandByPage(page,rows,sortBy,desc,key);
        return ResponseEntity.ok(pageResult);
    }
    @PostMapping("add")
    public ResponseEntity<Void> saveBrand( @RequestParam("cids") List<Long> cids,Brand brand){

        brandService.insertBrand(brand,cids);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
