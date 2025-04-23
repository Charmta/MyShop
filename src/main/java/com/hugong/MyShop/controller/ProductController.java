package com.hugong.MyShop.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Cy
 * @since 2025-04-16
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    //跳转到商品管理页面
    @GetMapping("/toList")
    public  String toList(){
        System.out.println("----------toList----------");

        return "prod/list";
    }
    //分页查询商品信息
    @PostMapping("/getPage")
    public String getPage(){
        System.out.println("-----------getPage------------");

        return null;
    }
}
