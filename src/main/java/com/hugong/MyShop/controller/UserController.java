package com.hugong.MyShop.controller;


import com.hugong.MyShop.pojo.Role;
import com.hugong.MyShop.pojo.User;
import com.hugong.MyShop.service.RoleService;
import com.hugong.MyShop.service.UserService;
import com.hugong.MyShop.utils.AjaxResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Cy
 * @since 2025-04-16
 */
@Tag(name = "用户管理")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;
    //进入登录页面
    @Operation(summary = "进入登录页面")
    @GetMapping("/toLogin")
    public String toLogin(HttpServletRequest request){
        System.out.println("-----------toLogin----------");


        //查询所有角色信息
        List<Role> list=roleService.list();

        request.setAttribute("list",list);

        return "user/login";
    }
    //处理用户登录
    @Operation(summary = "处理用户登录",description = "需要用户名,密码,用户主键参数")
    @GetMapping("/login")
    @ResponseBody
    public AjaxResult login(User user){
        System.out.println("------login-------");
        System.out.println("user:"+user);


        //根据用户名，密码和角色主键 查询指定的用户信息
        User user2=userService.login(user);
        System.out.println("user2:"+user2);



        if (user2!=null){//登录成功
            return AjaxResult.right();
        }else {//登录失败
            return  AjaxResult.error();
        }

    }

}
